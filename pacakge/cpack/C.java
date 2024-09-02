
package cpack;
import apack.A;

public class C {
    public void display() {
        A objA = new A();
        System.out.println("Protected variable from class A: " + objA.getprotectedv());
	System.out.println("Private variable from class A:" + objA.getprivatev());
        System.out.println("Public variable from class A: " + objA.publicv);
    }
}
