
package javaPractice;
/* LCM of 2 numbers
 * int a=3; 3,6,9,12,15,18,21,24
 * int b=5; 5,10,15,20,25,30
 * 
 * the first of common number which is divisible by both
 * number is 15
 * 
 *  int a=2; 2,4,6,8,10
 *  int b=4; 4,8,12,16
 *  lcm=4
 *      
 *  Steps:
 *  1. 3%a==0 true>multiple
 * 2. 4%a==0  false>not a multiple
 * 3. 5%a==0  false>not a multiple
 * 4. 6%a==0  true>multiple   
 * 
 * 
 * 5%b==0 true>multiple
 * 6%b==0 false>not a multiple
 * 7%b==0 false>not a multiple
 * 
 */
public class LCM 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int a=3,b=5;
		int max=a;
		if(b>a)
		{
			max=b;
		}
		int temp=max;
		while(true)
		{
			if(max%a==0 && max%b==0)
			{
				System.out.println(max);
				break;
			}
			max=max+temp;
		}
	 }	
}
