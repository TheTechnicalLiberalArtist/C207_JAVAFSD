
package com.sg.foundations.oop.studentquizgrades;

/**
 *
 * @author kurtiswong
 */
public class TestingSchoolApp {
    public static void main(String[] args){
        
        StudentQuizGrades SQG = new StudentQuizGrades();
        
        SQG.addStudentScores();
        
        SQG.viewStudents();
        
        SQG.getScore("Kurtis");
        
        SQG.averageScore("Kurtis");
    }
}
