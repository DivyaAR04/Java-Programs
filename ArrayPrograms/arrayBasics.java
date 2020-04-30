package ArrayPrograms;

public class arrayBasics 
{
	public static void main(String[] args)
	{
	int[] ar=new int[3];
	ar[0]=41;
	ar[2]=12;
	ar[1]=13;
	
	System.out.println("size="+ar.length);
	for(int i=0;i<ar.length;i++)
	{
		System.out.println(ar[i]);
	}
System.out.println("for each loop");
for(int a:ar)
{
	System.out.println("output from foreach"+a);
	
}
	int[] ar2= {12,34,44,24};
	System.out.println("size of an array "+ar2.length);
	for(int a:ar2)
	{
		System.out.println(a);
	}
	
	}
		
		
	


}

/*FOREACH LOOP
 * for(DataType name: array/collection ref)
 * {
 * System.out.println(name);
 * }
 * this is supported from java 1.8
 * */ 
