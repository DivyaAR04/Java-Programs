import java.util.Scanner;

public class PrintDigit {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
	//	int digit=0;
		int len=0;
		
		while(num!=0)
		{	len++;
			num=num/10;
			
		}
		System.out.println(+len);
	}

}
