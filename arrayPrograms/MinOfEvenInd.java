package arrayPrograms;

public class MinOfEvenInd {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {10,2,4,6,8,20,40,25};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				if(arr[i]<min)
				{
					min=arr[i];
				}
			}
		}
		System.out.println(min);
	}

}
