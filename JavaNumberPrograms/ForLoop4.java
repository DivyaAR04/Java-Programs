package javaPractice;
/* We have bunnies standing in a line, numbeered 1,2,....The odd bunnies(1,3,...)
 * have the normal 2 ears. The even bunnies(2,4,...) we will say have 3 ears return 
 * the number of "ears" in the bunny line 1,2,....n
 */

public class ForLoop4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int bunnies=6;
		int count=0;
	
		for(int i=0;i<=6;i++)
		{
			if(i%2==0)
			{
				count=count+3;
			}
 			else if(i%2!=0)
 			{
 				count=count+3;
 			}
		}
		
		System.out.println("Total number of ears "+count);
	}

}
