
package bpack;
import apack.A;

public class B extends A {
    public void display() {
        System.out.println("Protected variable from class A: " + getprotectedv());
	System.out.println("Private variable from class A:" + getprivatev());
        System.out.println("Public variable from class A: " + publicv);
    }
}
