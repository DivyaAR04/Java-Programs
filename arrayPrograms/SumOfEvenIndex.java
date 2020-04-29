package arrayPrograms;

public class SumOfEvenIndex {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {12,14,16,28,12,20,22};
		int sum=0;
		int size= arr.length;
		for(int i=0;i<size;i++)
		{
			if(i%2==0)
			{
				sum=sum+arr[i];
			}
		}
	System.out.println(sum);
	
	}
	
}
