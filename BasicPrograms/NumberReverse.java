import java.util.Scanner;

public class NumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		
		int digit=0;
		
		while(num!=0)
		{
			
			digit=digit*10;
		/*	System.out.println("digit"+digit);
			System.out.println("number"+num);*/
			digit=digit+num%10;
		/*	System.out.println(digit);*/
			num=num/10;
		/*	System.out.println(num);
			System.out.println("========");*/
			
		}
	
	System.out.println(+digit);
	
	sc.close();
	}

}
