import java.text.SimpleDateFormat;
import java.util.*;
public class PointTest {
    public static void main(String[] args) {


        System.out.println("Name: Tirth Bhayani");
		System.out.println("220170116004");
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(formatter.format(date));
        System.out.println();

        Point defaultPoint = new Point();
        System.out.println("Default Point:");
        defaultPoint.display();

        Point parameterizedPoint = new Point(10, 20);
        System.out.println("\nParameterized Point:");
        parameterizedPoint.display();

        Point copyPoint = new Point(parameterizedPoint);
        System.out.println("\nCopy Point:");
        copyPoint.display();

    }
}
class Point {
     int x;
     int y;

    public Point() {
        x = 5;
        y = 5;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void display() {
        System.out.println("Point (" + x + ", " + y + ")");
    }
}

