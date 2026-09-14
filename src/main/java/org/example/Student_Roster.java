package org.example;

import java.util.ArrayList;

public class Student_Roster {

    private ArrayList<Student> classRosterArrayList = new ArrayList<>();


    public void add(String studentID, String firstName, String lastName, String email, int age, int grade1, int grade2, int grade3) {
        int[] grades = {grade1, grade2, grade3};
        Student student = new Student(studentID, firstName, lastName, email, age, grades);
        classRosterArrayList.add(student);
    }

    public void remove(String studentID) {
        for (int i = 0; i < classRosterArrayList.size(); i++){
            if (classRosterArrayList.get(i).getStudentID().equals(studentID)) {
                classRosterArrayList.remove(i);
                System.out.println("Student " + studentID + " removed");
                return;
            }
        }
        System.out.println("Error: student with ID " + studentID + " was not found - try again.");
    }

    public void print_all(){
        for (Student student : classRosterArrayList){
            student.print();
        }
    }


    public void print_average_grade(String studentID) {
        for (Student student : classRosterArrayList) {
            if (student.getStudentID().equals(studentID)) {
                int[] grades = student.getGrades();
                int sum = 0;
                for (int grade : grades) {
                    sum += grade;
                }
                double average = (double) sum / grades.length;
                System.out.printf("Average grade for student %s: %.2f%n", studentID, average);
                return;
            }
        }
        System.out.println("Error: student with ID " + studentID + " was not found.");
    }


    public void print_invalid_emails(){
        for (Student student : classRosterArrayList) {
            String email = student.getEmail();
            if (!email.contains("@") || !email.contains(".") || email.contains(" ")){
                System.out.println("Invalid email: " + email);
            }
        }
    }

//    public static void main(String[] args) {
//        Student_Roster roster = new Student_Roster();
//        roster.add("1", "John", "Smith", "John1989@gmail.com", 20, 88, 79, 59);
//        roster.add("2", "Suzan", "Erickson", "Erickson_1990@gmailcom", 19, 91, 72, 85);
//
//        roster.print_all();
//        roster.print_invalid_emails();
//        roster.print_average_grade("1");
//        roster.print_average_grade("9");
//        roster.remove("2");
//        roster.remove("2");
//        roster.print_all();
//    }



}
