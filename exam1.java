import java.text.SimpleDateFormat;
import java.util.*;
public class exam1{
    public static void main(String[] args) {
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        
        subject OS = new subject(70);
        subject OOPJ = new subject(80);
        subject COA = new subject(45);

        double percentage = ((OS.mark + OOPJ.mark + COA.mark)/300)*100;
        double spi = (percentage + 0.5)/10;

        System.out.println("RESULT");
        System.out.println();

        System.out.println("OS : "+ OS.pass());
        System.out.println("grade : "+OS.grade());
        System.out.println();

        System.out.println("OOPJ : "+ OOPJ.pass());
        System.out.println("grade : "+OOPJ.grade());
        System.out.println();


        System.out.println("COA : "+ COA.pass());
        System.out.println("grade : "+COA.grade());
        System.out.println();

        System.out.println("SPI : " +spi);
       }
}
interface Exam {
    boolean pass();
}
interface Classify {
    String grade();
}

class subject implements Exam, Classify {
    double mark;
    public subject(int mark)
    {
        this.mark = mark;
    }
    
    public boolean pass() {
        return this.mark >= 50;
    }

    public String grade() {
        if(mark>=90)
        {
            return "AA";
        }
        else if(mark>=75 && mark<=89)
        {
            return "BB";
        }
        else if(mark>=51 && mark<=74)
        {
            return "CC";
        }
        else
        {
            return "FF";
        }
    }

}

