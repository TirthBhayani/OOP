import java.text.SimpleDateFormat;
import java.util.*;

public class avg {

    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println(); 
        String[]a = {"4","6"};

        try {
            double avg = average(a);
            System.out.println("Average: " + avg);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        }
    }

    public static double average(String[] a) throws NullPointerException, NumberFormatException {
        if ( a == null) {
            throw new NullPointerException("Array is null");
        }

        double sum = 0;
        int count = 0;

        for (String str : a) {
            if (str == null) {
                throw new NullPointerException("Array element is null");
            }
            try {
                double num = Double.parseDouble(str);
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Element is incorrectly formatted: " + str);
            }
        }

        if (count == 0) {
            throw new IllegalArgumentException("No valid numbers found in the array");
        }

        return sum / count;
    }
}
