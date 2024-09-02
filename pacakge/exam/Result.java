package exam;

import student.Student;

public class Result {
    public static void generateMarkSheet(Student student, int[] marks) {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        double averageMarks = totalMarks / (double) marks.length;


        System.out.println("Student Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Marks: " + averageMarks);

        if (averageMarks >= 40) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
