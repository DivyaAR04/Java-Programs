package arrayPrograms;

public class SumOfArray {
	public static void main(String[] args)
	{
		int arr[]= {10,20,2,5,3};
		int size=arr.length;
		int sum=0;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
