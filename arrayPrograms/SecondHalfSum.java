package arrayPrograms;

public class SecondHalfSum 
{

	public static void main(String[] args)
	{
		int arr[]= {25,35,12,14,15,16,75};
		int size=arr.length;
		int half=size/2;
		int sum=0;
		for(int i=half;i<size;i++)
		{
			sum=sum+arr[i];
		}
				
		System.out.println(sum);
		}
}
