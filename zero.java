import java.text.SimpleDateFormat;
import java.util.*;

public class zero {
    public static double divide(int a, int b) throws dividebyzeroException {
        if (b == 0) {
            throw new dividebyzeroException("Cannot divide by zero...");
        }
        return (double) a / b;
    }

    public static void main(String args[]) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        int a = 10, b = 0;
        try {
            double ans = divide(a, b);
            System.out.println(ans);

        } catch (dividebyzeroException e) {
            System.out.println(e.getMessage());

        }

    }

}

class dividebyzeroException extends Exception {
    public dividebyzeroException(String s) {
        super(s);
    }
}