import java.util.Scanner;

public class ArmStrongNo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("enter any number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int len=0;
		//int sum=1;
		int dig=0;
		int arm=0;
		int t1=num;
		int t2=num;
		
		while(t1!=0)
		{	
			len=len+1;
			t1=t1/10;
		}

		while(t2!=0)
		{
			int sum=1;
			dig=t2%10;

			for(int i=1;i<=len;i++)
			{
				sum=sum*dig;
							
			}
			arm=arm+sum;
			t2=t2/10;
			
		}
	if(num==arm)
	{
	System.out.println("number is an armstrong number");	
	}
	else
	{
		System.out.println("number is not an armstrong number");
		
	}
	
	
	}
	

}
