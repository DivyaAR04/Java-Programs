package ArrayPrograms;

/* program to find the numbers missing in between 2 numbers
 * of array
 * e.g.:ar={14,18,23,25,30}
 *  here no. missing are 15,16,17=> between 14,18 
 *  here no. missing are 19,20,21,22,=> between 18,23
 * */
 
public class Display_Missing_Number {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] ar= {14,18,23,25,30};
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar[i]+1;j<ar[i+1];j++)
			   {System.out.println(j);}
			
		}
		
	}

}
