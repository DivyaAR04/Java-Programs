package stringPrograms;

public class SplitLineToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s1="welcome to ty";
			String[] s2;
			String rev=" ";
			s2=s1.split(" ");
			int count=s2.length;
			for(int i=count-1;i>=0;i--)
			{
				rev=rev+" "+s2[i];
			}
				
			System.out.println(rev);
	}

}
