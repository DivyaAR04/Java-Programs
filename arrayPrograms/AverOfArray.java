package arrayPrograms;

public class AverOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {16,14,12,10,8,6};
		int sum=0,avg=0;
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
			sum=sum+arr[i];
		}
		avg=sum/size;
		System.out.println(avg);

	}

}
