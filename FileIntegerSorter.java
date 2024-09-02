import java.util.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class FileIntegerSorter {
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();

        try {
            File file = new File("tirth.txt");
            file.createNewFile(); 
            FileWriter writer = new FileWriter(file);

         
            Random random = new Random();
            for (int i = 0; i < 100; i++) {
                int val = random.nextInt(10000); 
                writer.write(val + " ");
            }

            writer.close();

            TreeSet<Integer> sortedIntegers = new TreeSet<>();
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int num = scanner.nextInt();
                    sortedIntegers.add(num);
                } else {
                    scanner.next(); 
                }
            }
            scanner.close();
            System.out.println("increasing order:");
            for (int num : sortedIntegers) {
                System.out.print(num + " ");
            }
            System.out.println(); 

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
