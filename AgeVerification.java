import java.text.SimpleDateFormat;
import java.util.*;

public class AgeVerification {

    public static void main(String[] args) {
    System.out.println("Name: Tirth Bhayani");
    System.out.println("220170116004");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
    System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");

        try {
            int age = scanner.nextInt();
            verifyAge(age);
            System.out.println("Age verification successful!");
        } catch (InvalidAgeException e) {
            System.out.println("Invalid Age: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

    public static void verifyAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age must be between 0 and 150");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
