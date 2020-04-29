package javaPractice;

public class For_While2 {
/* Given a non-negative number compute the count of the occurrence of 8 as a digit 
 * except that an 9 with another 8 immediate to its left counts double, so 8818 yields 4
 * 1.count(8)->1
 * 2.count(818)-> 2
 * 3.count(8818)->4
 * 4.count(88188)->5
 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i=8818;
		int r=0;
		int count=0; 
		while(i!=0)
		{
			r=i%10;
			if(r==8)
			{
				count=count+1;
				if((i/10)%10==8)
				{
			      count=count+1;
				}
			}i=i/10;
		}
		
	System.out.println("The sum is" +count);	
		
	}
	

}

