import java.text.SimpleDateFormat;
import java.util.*;
public class password {
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        long startTime = System.currentTimeMillis();

        Scanner input= new Scanner(System.in);
        System.out.println("Ente Password");
        String s = input.nextLine();
        checkpass(s);

        if(checkpass(s))
        {
            System.out.println("valid");
        }
        else{
            System.out.println("invaild");
        }
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }

    public static boolean checkpass(String s)
    {
      if(s.length()>8)
      {
        return false;
      }
      int num=0;
      for(int i=0;i<s.length();i++)
      {
        if(!((s.charAt(i) >'a' && s.charAt(i) < 'z') || (s.charAt(i) >'A' && s.charAt(i) < 'Z') || (s.charAt(i) >'0' && s.charAt(i) < '9')))
        {
            return false;
        }
      }
      for(int i =0;i<s.length();i++)
      {
        if(s.charAt(i) >'0' && s.charAt(i) < '9')
        {
            num++;
        }
      }
      if(num<2)
      {
        return false;
      }
      return true;
    }
}