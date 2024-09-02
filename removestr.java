import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;

public class removestr{
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter String to remove: ");
        String str = inputScanner.nextLine(); 

        try {
            File file = new File("tirth.txt");
            Scanner scanner = new Scanner(file);
            StringBuilder modifiedContent = new StringBuilder();

            while (scanner.hasNext()) {
                String temp = scanner.next();
                if (!temp.equals(str)) {
                    modifiedContent.append(temp).append(" ");
                }
            }

            System.out.println("Modified Content:");
            System.out.println(modifiedContent.toString()); 

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
