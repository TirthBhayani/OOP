import java.text.SimpleDateFormat;
import java.util.*;
public class sleep extends Thread {
    public static void main(String args[])
    {
    System.out.println("Name: Tirth Bhayani");
    System.out.println("220170116004");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
    System.out.println();

        sleep a = new sleep("Thread A",1000);
        sleep b = new sleep("Thread B",2000);
        sleep c = new sleep("Thread C",3000);

        a.start();
        b.start();
        c.start();

        try{
            a.join();
            b.join();
            c.join();
        }catch(InterruptedException e)
        {
            System.out.println("Main thread interrupted");
        }
        System.out.println("completed");
    }
    String name;
    int time;

     sleep(String name,int time)
    {
        this.name = name;
        this.time = time;
    }
    public void run()
    {
        System.out.println(name + "stared");
        try{
            Thread.sleep(time);
        }catch(InterruptedException e)
        {
            System.out.println(name + "interrupted");
            return;
        }
        System.out.println(name+ " completed after " + time  +" ms");
    }
    
}
