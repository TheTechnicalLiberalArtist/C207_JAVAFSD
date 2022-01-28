/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.classroster.service;

import com.sg.classroster.dao.ClassRosterAuditDao;
import com.sg.classroster.dao.ClassRosterPersistenceException;
import com.sg.classroster.dao.classRosterDao;
import com.sg.classroster.dto.Student;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 *
 * @author kurtiswong
 */
public class ClassRosterServiceLayerImplTest {
    
    private ClassRosterServiceLayer service;
    
    public ClassRosterServiceLayerImplTest() {
        classRosterDao dao = new ClassRosterDaoStubImpl();
        ClassRosterAuditDao auditDao = new ClassRosterAuditDaoStubImpl();
        service = new ClassRosterServiceLayerImpl(dao, auditDao);
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testCreateValidStudent() {
        //Creating the student object
        Student student = new Student("0002");
        student.setFirstName("Sai");
        student.setLastName("Aung Hein");
        student.setCohort("JAVA-JAN-2022");
        
        try{
            service.createStudent(student);
        } catch (ClassRosterDuplicateIdException| 
                 ClassRosterDataValidationException| 
                 ClassRosterPersistenceException e) {
            fail("Studen Id was valid. No exception should have been thrown.");
        }
    }
    
    @Test
    public void testCreateDuplicateStudentId(){
        //Creating student object (similar to dao Id)
        Student student = new Student("0001");
        student.setFirstName("Sai");
        student.setLastName("Aung Hein");
        student.setCohort("JAVA-JAN-2022");
        
        try{
            service.createStudent(student);
            fail("An expected DupeId Exception was not thrown");
        }catch(ClassRosterDataValidationException|
               ClassRosterPersistenceException e){
            fail("Wrong Exception is being thrown");
        }catch(ClassRosterDuplicateIdException e){
            return;   
        }   
    }
    
    @Test
    public void testCreateStudentInvalidData() throws Exception {
        //Creating student object
        Student student = new Student("0002");
        student.setFirstName("");
        student.setLastName("Aung Hein");
        student.setCohort("JAVA-JAN-2022");
        
        try{
            service.createStudent(student);
            fail("An expected DataVal Exception was not thrown");
        }catch(ClassRosterDuplicateIdException|
               ClassRosterPersistenceException e){
            fail("Wrong Exception is being thrown");
        }catch(ClassRosterDataValidationException e){
            return;
        }
    }
        
    @Test
    public void testGetAllStudents() throws Exception {
        Student testClone = new Student("0001");
        testClone.setFirstName("Sai");
        testClone.setLastName("Aung Hein");
        testClone.setCohort("JAVA-JAN-2022");
        
        assertEquals(1, service.getAllStudents().size(),
                "Should only have 1 student");
        
        assertTrue(service.getAllStudents().contains(testClone), "The one student should be Sai");

    }  
    
    @Test
    public void testGetStudent() throws Exception {
        Student testClone = new Student("0001");
        testClone.setFirstName("Sai");
        testClone.setLastName("Aung Hein");
        testClone.setCohort("JAVA-JAN-2022");
        
        Student gettedStudent = service.getStudent("0001");
        
        assertEquals(gettedStudent, testClone, "There should only be 1 student");
        
        Student nullStudent = service.getStudent("0042");
        
        assertNull(nullStudent, "Student of Id 0042 should return null");
    }
    
    @Test
    public void testRemoveStudent() throws Exception {
        Student testClone = new Student("0001");
        testClone.setFirstName("Sai");
        testClone.setLastName("Aung Hein");
        testClone.setCohort("JAVA-JAN-2022");
        
        Student removedStudent = service.removeStudent("0001");
        
        assertNotNull(removedStudent, "Removed student 0001 should not be null");
        assertEquals(removedStudent, testClone, "Student with in Dao removed should be the same as testClone");
        
        Student shouldBeNull = service.removeStudent("0042");
        assertNull(shouldBeNull, "Student with Id 0042 removed should be null");
        
    }
    
    
    
    
}
