package org.example;

import java.util.Arrays;

public class Student {

    public static void main(String[] args) {

        Student testStudent = new Student("0000112", "Gerlado", "Grell", "testemail@email.com", 25, new int[]{34,41,41});

        System.out.println("Student name: " + testStudent.getFirstName() + " StudentID: " + testStudent.getStudentID() + "    Student age: " + testStudent.getAge() + "   Student grades: " + Arrays.toString(testStudent.getGrades()));

        testStudent.setStudentID("9998313");
        testStudent.setFirstName("Alfonso");
        testStudent.setGrades(new int[]{100, 123, 124});

        System.out.println("Student name: " + testStudent.getFirstName() + " StudentID: " + testStudent.getStudentID() + "    Student age: " + testStudent.getAge() + "   Student grades: " + Arrays.toString(testStudent.getGrades()));



}

    // fields
    private String studentID;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private int[] grades;

    // constructor

    Student(String studentID, String firstName, String lastName, String email, int age, int[] grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }


    // Getter

    String getStudentID(){
        return this.studentID;
    }

    String getFirstName(){
        return this.firstName;
    }

    String getLastName(){
        return this.lastName;
    }

    String getEmail(){
        return this.email;
    }

    int getAge(){
        return this.age;
    }

    int[] getGrades(){
        return this.grades;
    }



    void setStudentID(String studentID){
        this.studentID = studentID;
    }

    void setFirstName(String firstName){
        this.firstName = firstName;
    }

    void setLastName(String lastName){
        this.lastName = lastName;
    }

    void setEmail(String email){
        this.email = email;
    }

    void setAge(int age){
        this.age = age;
    }

    void setGrades(int[] grades){
        this.grades = grades;
    }


}
