/* WAP to conver number inside String to numeric*/

/**************PROGRAM WITHOUT USING METHOD************/
/* public class String_To_Numeric 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String cnum="5672";
		int intcc=0;
		int outcc=0;
		
		for(int i=0;i<cnum.length();i++)
		{
			char cc=cnum.charAt(i);
			intcc=cc-48;
			outcc=outcc*10+intcc;
		}
		
		System.out.println(outcc);
	}

}*/

/********************PROGRAM USING METHOD***********************/
public class String_To_Numeric 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String cnum="5672";
		int intcc=0;
		int outcc=0;
		
		for(int i=0;i<cnum.length();i++)
		{
			outcc=Convert_Str_Num(cnum.charAt(i),intcc,outcc);
		}
		
		System.out.println(outcc);
	}

public static int Convert_Str_Num(char cc,int intcc,int outcc)
   {
      intcc=cc-48;
      outcc=outcc*10+intcc;
      return outcc;
   }
}


//'A' to 'Z'=====>unicode range will be 65 to 90
//'a' to 'z'=====>unicode range will be 97 to 122
//'0' to '9'=====>unicode range will be 48 to 57 

/* * input==> String ="5672"
 * out==>number=5672
 * int res=Integer.parseInt("5672"); THIS IS INBUILT 
 * 
 * length
 * charAt
 * toChar
 * are 3 methods that are allowed to use in interviews
 * 
 * THE USERDEFINED WILL BE
 * STEPS:
 * 1. extract each and ever digit
 * 2. char c1=s1.charAt(i++);==>c1='5';
 * 3. convert this char to num
 * 4. c1 will be stored as 53
 * 5. int res=c1-48;res='5'-48=53-48=5(numeric)
 * out=out*10+res;
 * out=+5=5
 */
