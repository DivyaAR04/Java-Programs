package javaPractice;
/*
 * program to convert decimal to binary 
STEPS:
 int num =25
int out=0
while()
{
int rem=num%2;
out=out+rem;// this line is not correct 
num=num/2
}
while()=>true
rem=25%2=1;out=0+1=1;num=25/2=12;
while()=>true
rem=12%2=0;out=1+0=1
*/
public class Convert_Decimal_binary
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=25;
		int reminder=0;
		String bnum=" ";
		while(num!=0)
		{
			reminder=num%2;
			num=num/2;
		    bnum = reminder + bnum;
		}
		System.out.println(bnum);
	}

}
