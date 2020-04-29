package arrayPrograms;

public class MaxOf2Int {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {100,30,25,35,20,15};
		int max1=arr[0];
		int max2=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max1 < arr[i])
			{
				max2=max1;
				max1=arr[i];
			}
			else if(max1!=max2 && max2<arr[i])
				{
					max2=arr[i];
				}
		}
		System.out.println(max2);
	}

}
