import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class demo{
 public static void main(String[] args) {
 
 try {
 int var;
 int len;
 int k = 0;
 File fileObj = new File("x.txt");
 fileObj.createNewFile();

 FileWriter fileWriter = new FileWriter("demo1.txt");
 for (int i = 0; i < 100; i++) {
 var = (int) (Math.random() * 100000);
 String st = String.valueOf(var);
 fileWriter.write(st + " ");
 }
 ArrayList<Integer> list = new ArrayList<>();
 Scanner sc = new Scanner(fileObj);
 while (sc.hasNextLine()) {
 String temp = sc.nextLine();
 String b[] = temp.split("\\s+");
 for (int i = k; i < b.length; i++) {
 Integer temp2 = Integer.parseInt(b[i]);
 list.add(temp2);
 }
 }
 list.sort(Comparator.naturalOrder());
 System.out.println(list);
 ;
 sc.close();
 } catch (FileNotFoundException e) {
 e.printStackTrace();
 } catch (IOException s) {
 s.printStackTrace();
 }
 }
 }
