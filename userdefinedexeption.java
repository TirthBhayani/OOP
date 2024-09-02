import java.util.*;
class userdefinedexeption
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("hall ticket ???");
        boolean s =sc.nextBoolean();

        if(s)
        {
            throw new hallticketexeption("allowed");
        }
        else{
            throw new hallticketexeption("not allowed");
        }
    }
}
class hallticketexeption extends RuntimeException
{
    hallticketexeption(String s)
    {
        super(s);
    }
}