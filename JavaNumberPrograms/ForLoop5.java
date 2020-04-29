package javaPractice;
// factorial of given number using recursion
public class ForLoop5 
{
	public static int factorial(int n) 
	{
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));	
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int fact=0;
		int number=4;
		fact=factorial(number);
		System.out.println(number+ "\t" +fact);
	}
}
