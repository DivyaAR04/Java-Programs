package arrayPrograms;

public class MinimumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20,3,2,5,6,8};
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
		
	}

}
