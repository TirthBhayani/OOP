import java.text.SimpleDateFormat;
import java.util.*;

public class custom {

    public static void main(String[] args) {
         System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        try {
            if (args.length > 0) 
            {
                int firstArg = Integer.parseInt(args[0]);
                if (firstArg == 0)
                 {
                    throw new CustomZeroException("First argument cannot be 0");
                 } 
                else 
                {
                    System.out.println("First argument is: " + firstArg);
                }
            } 
            else
             {
                System.out.println("No command-line arguments provided.");
             }
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } 
        catch (CustomZeroException e) {
            System.out.println("CustomZeroException: " + e.getMessage());
        }
    }
}
class CustomZeroException extends Exception {
    public CustomZeroException(String s) {
        super(s);
    }
}
