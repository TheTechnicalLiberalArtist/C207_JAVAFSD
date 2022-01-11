
package com.sg.foundations.oop.studentquizgrades;
import com.sg.foundations.oop.userio.UserIOImpl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author kurtiswong
 */
public class StudentQuizGrades extends UserIOImpl {
    
    String StudentName;
    
    Map<String,double[]> StudentScore = new HashMap<>();
    
    //Add student functionality
    public void addStudentScores(){
    
    boolean haveStudent = true;
    
    do{
        
        String name = readString("What is the name of the student?");   
        double quiz1Scores = readDouble("What is the student score for quiz 1?", 0.0, 100.0);
        double quiz2Scores = readDouble("What is the student score for quiz 2?", 0.0, 100.0);
        double quiz3Scores = readDouble("What is the student score for quiz 3?", 0.0, 50.0);
        
        StudentScore.put(name, new double[] {quiz1Scores,quiz2Scores,quiz3Scores});
                
        String answer= readString("Would you like to add another student?");
        
        if (answer.equals("No")){
            haveStudent = false;
        }
        
      } while(!haveStudent);
    
    }
    
    //View all students functionality
    public void viewStudents(){
        
        Set<String> StudentNames = StudentScore.keySet();
       
        for(String keys: StudentNames){
            System.out.println(keys);   
        }    
    }
  
    //Remove a student
    public void removeStudent(String StudentName){
        this.StudentName = StudentName;
        StudentScore.remove(StudentName);
        
    }
    
    //Get quiz scores for a given student
    public void getScore(String StudentName){
        this.StudentName = StudentName;
        double [] scores = StudentScore.get(StudentName);
        System.out.println("The quiz scores for " + StudentName + " are " + Arrays.toString(scores));
            
    }
    
    //Average Scores 
    public void averageScore(String StudentName){
        this.StudentName = StudentName;
        double[] scoreArray = StudentScore.get(StudentName);
        double scoreTotal = 0.0;
        
        for(int i = 0; i < scoreArray.length; i++){
            
            scoreTotal += scoreArray[i];
            
            if(i == (scoreArray.length-1)){
                System.out.println(scoreTotal);
               scoreTotal = scoreTotal/scoreArray.length; 
            }  

        }
        
        System.out.println("The average score for " + StudentName + " is " + scoreTotal); 
        
    }
        
    
}
