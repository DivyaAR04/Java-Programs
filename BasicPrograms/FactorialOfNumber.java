import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int num=0,fact=1;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int temp=num;
		
	for(int i=1;i<=temp;i++)
		{
			fact=fact*i;
		}
	System.out.println("The factorial of a given number is "+fact);
	}

}
