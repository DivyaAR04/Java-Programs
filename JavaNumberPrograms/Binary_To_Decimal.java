/* WAP to conver binary to decimal
 * int num=11001;
 *  1*(2 to power of 4) 
 *   +1*(2 to power of 3)
 *   +0*(2 to power of2)
 *   + 0*(2 to power of 1)
 *   +1*(2 to the power of 0)
 * 
 * STEP: 
 * 1. Extract the last digit
 * 2. multiply with 2^ of place of the digit in given number
 * 3. add it to the result variable to output variable
 * 4. eliminate the last digit
 * 5. repeat steps 1 to 4 till num==0
 * 6. display the out put variable
 * 
 */
public class Binary_To_Decimal 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		convert(11);
	}

	private static int power(int num, int pos) 
	{
		// TODO Auto-generated method stub
		int out=1;
		for(int i=0;i<=pos;i++)
		 {
			out=out*num;
		 }
		return out;
	}	
	public static void convert(int num)
	{
		int count=0;
		int out=0;
		while(num!=0)
		{
		int rem=num%10;
		out=out+(rem*power(2,count++));
		num=num/10;
		}
		System.out.println(out);
	}
}

/* In java we have following number types
 * 1. binary number represented as=>>>0b101
 * 2. Octal number represented as=>>>>025===>base will be 8
 * 3. Hexa decimal number represented=>>> 0xb6
 * 4. Decimal number represented as =>>>25
 */
