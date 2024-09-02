import java.text.SimpleDateFormat;
import java.util.*;
public class syncho {

    public static void main(String[] args) throws InterruptedException {
        
    System.out.println("Name: Tirth Bhayani");
    System.out.println("220170116004");
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    Date date = new Date();
    System.out.println(formatter.format(date));
    System.out.println();

        IntegerWrapper sum = new IntegerWrapper(0);
        Thread[] threads = new Thread[10];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(() -> {
                for(int j=0;j<100;j++){
                synchronized (sum) {
                    sum.increment();
                }
            }
            });
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println("Sum with synchronization: " + sum.getValue());
    }

    static class IntegerWrapper {
         int value;
        public IntegerWrapper(int initialValue) {
            this.value = initialValue;
        }
        public synchronized void increment() {
            this.value++;
        }
        public int getValue() {
            return this.value;
        }
    }
}
