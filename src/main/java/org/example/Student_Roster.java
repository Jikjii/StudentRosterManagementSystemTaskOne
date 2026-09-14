package org.example;

import java.util.ArrayList;

public class Student_Roster {

    private ArrayList<Student> classRosterArrayList = new ArrayList<>();


    public void add(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
        int[] grades = {grade1, grade2, grade3};
        Student student = new Student(studentID, firstName, lastName, email, age, grades);
        classRosterArrayList.add(student);
    }


}
