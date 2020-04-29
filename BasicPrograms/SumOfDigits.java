import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter some number");
		Scanner sc=new Scanner(System.in);
		
		int digit=0;
		int sum=0;
		
		int num=sc.nextInt();
		while(num!=0)
		{
			digit=num%10;
			System.out.println("digit is "+digit);
			sum=sum+digit;
			System.out.println("sum  is "+sum);
			num=num/10;
			System.out.println("the number is "+num);
			
		}
	System.out.println(sum);
	
	
	}

}
