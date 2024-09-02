package dpack;
import java.text.SimpleDateFormat;
import java.util.*;

import bpack.B;
import cpack.C;

public class MainDemo {
    public static void main(String[] args) {
	 System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();
        B objB = new B();
        objB.display(); // Display method in class B
        
        C objC = new C();
        objC.display(); // Display method in class C
    }
}
