import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class removestring
{
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = inputScanner.next();
        try{
        File file = new File("tirth.txt");
        Scanner scanner = new Scanner(file);
        String a = "";
        String temp = "";
        while(scanner.hasNextLine())
        {
            temp = scanner.next();
            if(temp.equals(str))
            {
                continue;
            }
            a = a + temp + " ";
        }
        System.out.println(a + " ");
        scanner.close();
        }catch(FileNotFoundException e)
        {
            System.out.println("exception");
        }
    }
}