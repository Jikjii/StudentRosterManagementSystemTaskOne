package org.example;

import java.util.Arrays;

public class Student {
    // fields
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;

    // constructor
    public Student(String studentID, String firstName, String lastName, String email, int age, int[] grades) {
        setStudentID(studentID);
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setAge(age);
        setGrades(grades);
    }


    // Getter

    public String getStudentID(){
        return this.studentID;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public int getAge(){
        return this.age;
    }

    public int[] getGrades(){
        return this.grades;
    }



    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGrades(int[] grades){
        this.grades = grades;
    }

    public void print(){
        System.out.println(getStudentID()
                + "\tFirst Name: " + getFirstName()
                + "\tLast Name: " + getLastName()
                + "\tEmail: " + getEmail()
                + "\tAge: " + getAge()
                + "\tGrades: " + Arrays.toString(getGrades()).replace("[", "{").replace("]", "}"));
    }


}
