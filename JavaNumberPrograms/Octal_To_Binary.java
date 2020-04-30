
public class Octal_To_Binary {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		boolean res=false;
       int octal=02532;
       if (res==true)
    	   convert(octal);
       else
    	   System.out.println("this is not octal");
	}
	private static int power(int num, int pos) 
	{
		// TODO Auto-generated method stub
		int out=1;
		for(int i=0;i<=pos;i++)
		 {
			out=out*num;
		 }
		return out;
	}	
	public static void convert(int num)
	{
		int count=0;
		int out=0;
		while(num!=0)
		{
		int rem=num%10;
		out=out+(rem*power(8,count++));
		num=num/10;
		}
		System.out.println(out);
	}
	public static boolean isOctal(int num)
	{
		while(num!=0)
		{
			int rem=num%10;
			if(rem>7)
			{
				return false;
			}
			num=num/10;
		}
		return true;
	}
}
