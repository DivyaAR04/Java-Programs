package ArrayPrograms;
/*int [] ar={12,4,5};
output=>5
int[] ar2={1,78,36,3};
output=>23
int[] ar3={14,52,41,52,6,4,78};
output=>5039
int[] ar4={2,5};
output=1;
int[] ar5={126,456633325,41,4,1};
output=>119;
 * 
 * 
 * 
 * (length of array)!-1;
 * will be the answer
 */
public class ScenarioBasedQuestion {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] ar= {12,4,5};
		int size=ar.length;
		int result=factorial(size);
		System.out.println(result-1);
	}

	private static int factorial(int size) 
	{
		// TODO Auto-generated method stub
		int fact=1;
		for(int i=size;i>=1;i--)
		{
			fact=fact*i;
		}
		return fact;
	}

}
