package javaPractice;

public class Decimal_To_Octal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=215;
		int reminder=0;
		String bnum=" ";
		while(num!=0)
		{
			reminder=num%8;
			num=num/8;
		    bnum = reminder + bnum;
		}
		System.out.println(bnum);
	}

}
