import java.text.SimpleDateFormat;
import java.util.*;
public class runnabledemo{

    public static void main(String[] args) {
    System.out.println("Name: Tirth Bhayani");
    System.out.println("220170116004");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
    System.out.println();
        Runnable task1 = new MyRunnable("task 1");
        Runnable task2 = new MyRunnable("task 2");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
        System.out.println("Main thread exiting.");
    }
}
class MyRunnable implements Runnable {

    private String taskName;
    public MyRunnable(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println(taskName + " started.");

        try {
           
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(taskName + " interrupted.");
            return; 
        }
        System.out.println(taskName + " completed.");
    }
}
