
public class SecondLargeNumber {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[]= {20,10,5,25,22};
		int size=a.length;
		int first=a[0],second=a[0];
		for(int i=0;i<size;i++)
		{
			if(a[i]>first)
			{
				second=first;
				first=a[i];
			}
			else if(a[i]>second && a[i]<first)
			{
				second=a[i];
			}
			
		}
		System.out.println("second hightest number is "+second);
	
	}

}
