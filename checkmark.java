import java.text.SimpleDateFormat;
import java.util.*;

public class checkmark {
    public static void main(String args[]) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        mark[] m = {
                new mark(1, 10),
                new mark(2, -10),
                new mark(3, 90)
        };

        for (mark M : m) {
            try {
                M.checkmark();
            } catch (IllegalMarkException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}

class mark {
    int regno;
    int mark;

    public mark(int regno, int mark) {
        this.regno = regno;
        this.mark = mark;
    }

    public void checkmark() throws IllegalMarkException {
        if (mark < 0) {
            throw new IllegalMarkException("Illegal Mark");
        } else if (mark >= 40) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }
}

class IllegalMarkException extends Exception {
    public IllegalMarkException(String s) {
        super(s);
    }
}