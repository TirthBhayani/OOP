import java.text.SimpleDateFormat;
import java.util.*;
public class prefix
{
    public static void main(String args[])
    {
         System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        long startTime = System.currentTimeMillis();
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st string : ");
        String s1 = sc.nextLine();
        System.out.println("enter 2nd string : ");
        String s2 = sc.nextLine();

        prefix(s1, s2);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
        
    }  
    public static void prefix(String s1,String s2)
    {
        int len = s1.length();
        if(s1.length()>s2.length())
        {
             len = s2.length();
        }
        int count =0;
        for(int i=0;i<len;i++)
        {
            if(s1.charAt(i) == s2.charAt(i))
            {
                count++;
            }
            else{
                break;
            }
        }
       if(count == 0)
       {
        System.out.println("no common prefix:");
       }
       else{
        System.out.println("common prefix : " + s1.substring(0, count));
       }
    } 

}