import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
public class count {
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        try{
            File file = new File(args[0]);
            Scanner sc = new Scanner(file);
            int line =0;
            int word =0;
            int ch = 0;

            while(sc.hasNextLine())
            {
                String str = sc.nextLine();
                line++;
                word = word + str.split("\\s+").length;
                String c[] = str.split("");
                ch = ch + c.length;
            }
            System.out.println("line " + line);
            System.out.println("word "+word);
            System.out.println("character "+ch);
        }catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
