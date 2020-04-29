package arrayPrograms;

public class ArrayInReverse {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[]= {10,20,30,9,45,50,20,25};
		int size=arr.length;
		for(int i=size-1 ; i>=0 ; i--)
		{
			System.out.println(arr[i]);
		}
	}

}
