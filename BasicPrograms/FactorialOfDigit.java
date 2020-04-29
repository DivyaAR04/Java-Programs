// program to find sum of the factorial of each digits of  given number

import java.util.Scanner;

public class FactorialOfDigit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		
		int digit=0;
		int sum=0;
		
		while(num!=0)
		{
			digit=num%10;
			System.out.println("digit value"+digit);
			int fact=1;
			for(int i=1;i<=digit;i++)
			{
				fact=fact*i;
				//System.out.println("factorial is"+fact);
			}
			sum=fact+sum;
			//System.out.println("sum of number is"+sum);
			num=num/10;
			//System.out.println("number is "+num);
			//System.out.println("factorial of digit "+digit+"is" +fact);
		}
		
		System.out.println(sum);
	}

}
