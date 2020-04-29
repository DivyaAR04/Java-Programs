package javaPractice;

/*Program to find whether given number is PERFECT NUMBER OR NOT
 * ************Perfect number is a number, where the sum of complete divisors of a given number is same as of the number given.
 *  e.g.: 6 is given no==> 1,2,3 are the numbers which completely divides 6
 *                         and if we add those numbers we get same number as of given number
 *                         that is  1+2+3=6 ********
 *
 *  
 * STEPS:
 *1. Assign value to a variable num
 *2. Call function isPerfect by passing num as argument
 *3. Use FOR loop to having counter as i assigned with 1, 
 *4. should loop till i<num  
 *5. divide num by i to find the complete divisor of num
 *6. if the division of num%i==0
 *7. add that complete divisor to sum  
 *8. use a flag variable which will be initially assigned to 'fasle'
 *9. flag variable is assigned to 'true' in-case the num == sum
 *10. return the flag value to calling function 
 *11. depending on return value, display the answer
 *
 */

public class Perfect_Num 
{
	static boolean isPerfect(int num) 
	{  
	boolean flag=false;	
	int Sum = 0 ;
	for(int i = 1 ; i < num  ; i++) 
	{
		if(num % i == 0)  
		{
			Sum = Sum + i;
		}
	}
	if (Sum == num && num != 1) 
    { 
		flag=true;
	    return flag;
	  } 
	else
	{
        return flag; 
	}
}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int n=10;
        if (isPerfect(n)) 
        {       
        	System.out.println("The number "+ n +" is perfect number"); 
        }
        else
        {
        	System.out.println("The number "+ n +" is not perfect number");
        }
	}
}

/****************OUTPUT*********************************
 * The number 10is not perfect number
 * The number 6 is perfect number
 */
