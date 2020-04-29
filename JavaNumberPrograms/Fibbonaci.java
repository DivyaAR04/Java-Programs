package javaPractice;

public class Fibbonaci 
{
/* fabbonaci serties 
 * int a=0
 * int b=1
 * 1. a=0;b=1;c=0+1=1
 * 2. a=1;b=1;c=a+b;
 * 3. a=1;b=2;c=1+2=2
 * 
 * while()
 * {
 * int c=a+b;
 * sop(c);
 * a=b;
 * b=c;
 *  }
 *  
 *  */
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a=0;int b=1;
		int count=2;
		System.out.println(a);
		System.out.println(b);
		while(count!=10)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			count++;
		}
	}

}
