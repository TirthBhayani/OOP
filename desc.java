import java.util.*;
public class desc
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("enter integer x");
		int x = sc.nextInt();
		System.out.println("enter integer y");
		int y = sc.nextInt();
        System.out.println("enter integer z");
		int z = sc.nextInt();
        int temp;
		if(x < y)
		{
		   temp=x;
		   x=y;
		   y=temp;
		}
		if(z>y)
		{
		   if (z>x)
		   {
		      temp=z;
		      z=y;
		      y=x;
		      x=temp;
		   }
		   else
		   {
		      temp=z;
		      z=y;
		      y=temp;
		   }
		}
		System.out.println( + x + " " + y + " " + z);
	}
} 
