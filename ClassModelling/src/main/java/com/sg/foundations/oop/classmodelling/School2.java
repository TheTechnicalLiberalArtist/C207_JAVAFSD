/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.oop.classmodelling;

/**
 *
 * @author kurtiswong
 */
public class School2 {
    private int enrolment;
    private int numberOfTeachers;
    private String[] courseOffered;
    private String sportsNickName;
    private String[] clubsOffered;
    private Student[] studentRoster;
    
    public void enrolStudent(Student student){
        
    } 
    
    public void unenrolStudent(Student student){
        
    }

    public int getEnrolment() {
        return enrolment;
    }

    public void setEnrolment(int enrolment) {
        this.enrolment = enrolment;
    }

    public int getNumberOfTeachers() {
        return numberOfTeachers;
    }

    public void setNumberOfTeachers(int numberOfTeachers) {
        this.numberOfTeachers = numberOfTeachers;
    }

    public String[] getCourseOffered() {
        return courseOffered;
    }

    public void setCourseOffered(String[] courseOffered) {
        this.courseOffered = courseOffered;
    }

    public String getSportsNickName() {
        return sportsNickName;
    }

    public void setSportsNickName(String sportsNickName) {
        this.sportsNickName = sportsNickName;
    }

    public String[] getClubsOffered() {
        return clubsOffered;
    }

    public void setClubsOffered(String[] clubsOffered) {
        this.clubsOffered = clubsOffered;
    }

    public Student[] getStudentRoster() {
        return studentRoster;
    }

    public void setStudentRoster(Student[] studentRoster) {
        this.studentRoster = studentRoster;
    }
    
    
}
