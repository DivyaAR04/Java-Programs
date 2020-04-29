package arrayPrograms;

public class SumOfFirstHalf {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int arr[]= {12,15,30,20,17,25,14,16};
		int size=arr.length;
		int half=size/2;
		int sum=0;
		for(int i=0;i<half;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
