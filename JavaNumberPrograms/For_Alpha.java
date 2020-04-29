package javaPractice;

public class For_Alpha {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		/*char c;

        for(c = 'A'; c <= 'Z'; c=(char) (c+2))
        {       System.out.print(c + " ");
        }*/
		
		//sir has given like this
		for(char ch='A';ch<='Z';ch++)
		{
			System.out.print("\t"+ch);
			ch++;
		}
	}

}
