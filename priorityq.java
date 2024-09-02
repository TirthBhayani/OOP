import java.text.SimpleDateFormat;
import java.util.PriorityQueue;
import java.util.*;

public class priorityq {
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        PriorityQueue<String> q1 = new PriorityQueue<>();
        q1.add("George");
        q1.add("Jim");
        q1.add("John");
        q1.add("Blake");
        q1.add("Kevin");
        q1.add("michael");

        PriorityQueue<String> q2 = new PriorityQueue<>();
        q2.add("George");
        q2.add("katie");
        q2.add("Kevin");
        q2.add("Michelle");
        q2.add("Ryan");

        System.out.println("Union set           "+union(q1,q2));
        System.out.println("Diffrence of set    "+difference(q1,q2));
        System.out.println("intersection of set "+intersection(q1,q2));
    }
    static <T> PriorityQueue<T> union(PriorityQueue<T> set1, PriorityQueue<T> set2)
    {
        PriorityQueue<T> union = new PriorityQueue<>(set1);
        union.addAll(set2);
        return union;
    }
    static <T>PriorityQueue<T> difference(PriorityQueue<T> set1, PriorityQueue<T> set2)
    {
        PriorityQueue<T> difference = new PriorityQueue<>(set1);
        difference.removeAll(set2);
        return difference;
    }
    static <T>PriorityQueue<T> intersection(PriorityQueue<T> set1, PriorityQueue<T> set2)
    {
        PriorityQueue<T> intersection = new PriorityQueue<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}
