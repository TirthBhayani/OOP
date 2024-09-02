import java.text.SimpleDateFormat;
import java.util.*;
public class employees
{
    public static void main(String args[])
    {   
        System.out.println("Name: Tirth Bhayani");
        System.out.println("220170116004");
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        System.out.println();

        employee e1 = new employee(1, "Tirth", 10000);
        HOD h1 = new HOD(11, "Tirthbhayani", 100000, "IT");

        System.out.println("___ EMPLOYEE INFO__ ");
        e1.display();

        System.out.println("__HOD INFO__");
        h1.display();
    }
}

class employee {
    int EmpId;
    String name;
    double salary;

        public employee(int EmpId,String name,double salary)
        {
            this.EmpId = EmpId;
            this.name = name;
            this.salary = salary;
        }
        public void display()
        {
            System.out.println("employee id : "+this.EmpId);
            System.out.println("employee name : "+this.name);
            System.out.println("employee salary : "+this.salary);
        }
}
class HOD extends employee
{
    
    private String department;
    public HOD(int EmpId, String name, double salary, String department)
    {
        super(EmpId,name,salary);
        this.department = department;
    }
    public void display()
    { 
        super.display();
        System.out.println("department name : "+this.department);
    }
}
