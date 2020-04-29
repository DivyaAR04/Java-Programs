package javaPractice;

public class Recursion3 {
	//print the value 987654321
public static void printdec(int a)
{
	if(a>=1)
	{
		System.out.println(a);
		a--;
		printdec(a);
	}
}

//23456789
public static void printinc(int a)
{
	if(a<=9)
	{
		System.out.println(a);
		a++;
		printinc(a);
	}
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		printdec(9);
		printinc(2);
	}

}
