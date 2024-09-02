import java.text.SimpleDateFormat;
import java.util.*;
public class t{
    public static void main(String args[])
    {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();  
        
        Time T1= new Time();
        Time T2= new Time();
        Time T3= new Time();
        T1.initialize();
        T1.display();

        T2.initialize();
        T2.display();

        T3.sum(T1,T2);
        T3.display();
    }
}
class Time
{
    int hours;
    int minutes;

    public void initialize()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter hours");
        this.hours= sc.nextInt();

        System.out.println("enter minutes");
        this.minutes=sc.nextInt();
    }
    public void display()
    {
        System.out.println(" time = " + this.hours + " hours" +this.minutes + "minutes" );
    }
    public void sum(Time T1,Time T2)
    {
        this.hours = T1.hours + T2.hours;
        this.minutes = T1.minutes + T2.minutes;
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes %= 60;
        }
    }
}
