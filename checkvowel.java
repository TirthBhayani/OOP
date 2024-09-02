import java.text.SimpleDateFormat;
import java.util.*;
public class checkvowel {
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        long startTime = System.currentTimeMillis();

        Scanner sc = new Scanner(System.in);
        System.out.println("enter String :");
        String s = sc.nextLine();
        s = s.toLowerCase();

        int vowel =0,constant =0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)== 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u')
            {
                vowel++;
            }
            else if(s.charAt(i)>= 'a' && s.charAt(i)<= 'z')
            {
                constant++;
            }
        }
        System.out.println("vowel = " +vowel);
        System.out.println("constant = " +constant);

        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }
}
