import java.util.*;
public class bmi
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of weight in pounds");
		double weight = sc.nextDouble();
		System.out.println("Enter the height in inches");
		double height = sc.nextDouble();
		double kiloweight = weight * 0.45359237;
		System.out.println("The weight in kilograms is :" + kiloweight);
		double meterheight = height * 0.0254;
		System.out.println("The height in meters :" + meterheight);
		double square = meterheight * meterheight ;
		System.out.println("the height in square meter:" + square);
		double BMI = kiloweight / square;
		System.out.println("your body mass index is : " + BMI);
		
	}
}
