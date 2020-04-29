package collectionsProg;

import java.util.ArrayList;

public class ArrayListOfArrayList {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(150);
		
		al.add(a1);
		al.add(a2);
		
	System.out.println(	al.get(1).get(1));
		
		
	}

}
