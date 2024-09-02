// Main.java (Main class to test the program)
import student.Student;
import exam.Result;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creating a student object
	 System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        Student student = new Student("tirth", 123);

        // Generating marks for the student
        int[] marks = {50,60,70,80,90};

        // Generating mark sheet
        Result.generateMarkSheet(student, marks);
    }
}
