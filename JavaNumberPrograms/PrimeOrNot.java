package javaPractice;

/*Program to find whether given number is PRIME OR NOT
 * ************Prime number is a number which is divisible by 1 and itself. e.g.: 3, 5, 7, 13 etc********
 * STEPS:
 *1. Assign value to a variable num
 *2. Divide that num, by using for loop
 *3. Loop should loop through, till it reaches num/2. 
 *4. if before loop reaches num/2, and num % i, reminder is 0, break the for loop
 *5. use a flag variable which will be initially assigned to 'fasle'
 *6. flag variable is assigned to 'true' in-case the num is not prime
 *7. return the flag value to calling function 
 *7. depending on return value, display the answer
 */

public class PrimeOrNot 
{
	public static boolean primeNot(int num)
	{
		boolean flag = false;
		if(num!=1)
		{
        for(int i = 2; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
		}
		else
			System.out.println("number 1 can't be considered as prime number");
        return flag;
    }
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=7;
		boolean flag=primeNot(num);
		  if (!flag)
	            System.out.println("The given number is a prime number");
	        else
	            System.out.println("The given number is not a prime number");
	}

}

/********************out put*****************
 * WHEN THE GIVEN NUMBER IS 5
 * The given number is a prime number
 * WHEN THE GIVEN NUMBER IS 12
 * The given number is not a prime number
 */
