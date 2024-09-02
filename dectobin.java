import java.text.SimpleDateFormat;
import java.util.*;
public class dectobin {

 public static String convet(int num)
 {
    if(num == 0)
    {
        return "0";
    }
    else if(num == 1)
    {
        return "1";
    }
    else
    {
        int reminder = num%2;
        int ans = num/2;
        return convet(ans) + reminder ;
    }
 }
 public static void main(String[] args) {
    System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter Number ");
    int n = sc.nextInt();
    String binaray = convet(n);
    System.out.println("binary :- " +binaray);
 }
}