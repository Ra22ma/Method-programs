import java.util.Scanner;
class CountOfFactorsUsingMethods
{
	public static int countOfFactors(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(countOfFactors(num));

		
	}
}
