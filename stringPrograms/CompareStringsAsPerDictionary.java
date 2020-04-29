package stringPrograms;

public class CompareStringsAsPerDictionary {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("divya".compareTo("viprava"));
		// gives negative number bcz divya comes before viprava 
		System.out.println("viprava".compareTo("divya"));
		// gives possitive number bcz viprava comes after divya
		System.out.println("Krupa".compareTo("Kruti"));
		// gives negative number after comparing each and every character
		System.out.println("lohita".compareTo("siri"));
	}

}
