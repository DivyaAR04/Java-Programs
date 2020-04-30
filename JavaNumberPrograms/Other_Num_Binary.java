
public class Other_Num_Binary {
public static boolean isBinary(int num)
{
	while(num!=0)
	{
		int rem=num%10;
		if(rem>1)
		{
			return false;
		}
		num=num/10;
	}
	return true;
}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=12;
		boolean res=isBinary(num);
		if(res)
		{
			convert(num);
		}
		else
		{
			System.out.println("cannot convert the number to binary");
		}	
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
		out=out+(rem*power(2,count++));
		num=num/10;
		}
		System.out.println(out);
	}
}
