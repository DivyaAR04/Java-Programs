package ArrayPrograms;

public class Max_In_Array {
/* program for finding maximum number in an array*/
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int ar[]= {14,2,4,36,12};
		int max=ar[0];
		max(ar,max);
	}
	
	public static void max(int[] ar,int max)
	{
		int index=0;
		for(int i=1;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
				index=i;
			}
		}
		System.out.println("the max value is "+max+ "it is present in "+index );
	
	}

}
