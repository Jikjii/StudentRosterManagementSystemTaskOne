package org.example;

public class Student_Main {

    public static String[] students = {
            "1,John,Smith,John1989@gmail.com,20,88,79,59",
            "2,Suzan,Erickson,Erickson_1990@gmailcom,19,91,72,85",
            "3,Jack,Napoli,The_lawyer99yahoo.com,19,85,84,87",
            "4,Erin,Black,Erin.black@comcast.net,22,91,98,82",
            "5,Geraldo,Grell,ggrell1@wgu.edu,25,78,81,94"
    };

    public static void main(String[] args){
        Student_Roster roster = new Student_Roster();

        // add(); loop through all the students in the array

        for (String row : students) {
            String[] j = row.split(",");
            roster.add(j[0], j[1], j[2], j[3],
                    Integer.parseInt(j[4]),
                    Integer.parseInt(j[5]), Integer.parseInt(j[6]), Integer.parseInt(j[7]));
        }

        // print_all();
        roster.print_all();

        //  print_invalid_emails(); //loop through the ArrayList
        roster.print_invalid_emails();


        // print_average_grade(current_loop_student);
        for (String row : students) {
            String id = row.split(",")[0];
            roster.print_average_grade(id);
        }

        // remove(3);
        roster.remove("3");
        roster.remove("3");


        roster.print_all();
    }
}
