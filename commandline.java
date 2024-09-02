import java.text.SimpleDateFormat;
import java.util.*;
public class commandline {
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();

        int len = args.length;
        System.out.println("Numbers of arguments :"+len);
        System.out.println("the first student name is " + args[0]);
        System.out.println("the second student name is " + args[1]);
        System.out.println("the third student name is " + args[2]);
    
    }
}
