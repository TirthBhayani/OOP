class ArrayAvg
{
	public static void main(String args[])
	{
		double numbers [] = {10.5,11.2,12,44,34,32,55,74,89,75,54};
		
	
		double sum=0,avg;
		
		System.out.println("list of numbers is");
		for(int ctr=0;ctr<10;ctr++);
		{
			System.out.println(numbers[ctr]);
			sum= sum + numbers[ctr];
		}
		double Avg = sum/10;
		System.out.println("\nAverage of above numbers is"+ avg);
	}
}