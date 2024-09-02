import java.text.SimpleDateFormat;
import java.util.*;
public class emp
{
    private String name;
    private double salary;

    public void getdata()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter employee name:");
        this.name = sc.nextLine();

        System.out.println("enter employee salary:");
        this.salary = sc.nextDouble();
    }

    public void putdata()
    {
        System.out.println("employee name " +name);
        System.out.println("employee salart "+salary);
    }
    public static void main(String[] args) {
         System.out.println("Name: Tirth Bhayani");
         System.out.println("220170116004");
         SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
         Date date = new Date();
         System.out.println(formatter.format(date));
         System.out.println();
         
        emp e1 = new emp();
        e1.getdata();
        e1.putdata();
    }
}