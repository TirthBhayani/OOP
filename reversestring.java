import java.text.SimpleDateFormat;
import java.util.*;
public class reversestring {
    public static void main(String args[])
    {
    System.out.println("Name: Tirth Bhayani");
    System.out.println("220170116004");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
    System.out.println();
        if(args.length != 5)
        {
            System.out.println("provide 5 word !!");
            return;
        }
        for(String s : args)
        {
            String reverse = new StringBuilder(s).reverse().toString();
            if(palindrome(reverse))
            {
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        }
    }
    public static boolean palindrome(String s)
    {
        String original = new StringBuilder(s).reverse().toString();
        return s.equals(original);
    }
}
