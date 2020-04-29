package javaPractice;
// when the recursion has to be done above 10, it is better to 
public class While_Factorial 
{
	
public static void fact1(int a)
{
	int out1=1;
	while(a>1)
	{
		out1=out1*(a--);
	}
	System.out.println(a+"\t"+out1);
}

static int out2=1;
public static int fact2(int b)
{
	if(b>1)
	{
		out2=out2*b;
		b--;
		fact2(b);
	}
	return out2;
}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        fact1(4);
       int fa= fact2(4);
       System.out.println(fa);
	}

}
