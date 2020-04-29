package javaPractice;

public class ForLoop3 {
	/* we have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks
	 * the next row has 3 blocks, and so on. compute the total number of blocks in such a triangle
	 * with the given number of rows
	 * 
	 * 1. tiangle(0)->0
	 * 2. triangle(1)->1
	 * 3. triangle(2)->3
	 * 4. triangle(3)->6
	 * 5. triangle(4)->10
	 */

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int count=0;
		for(int i=1;i<=3;i++)
		{
	       count=count+i;
		}
		System.out.println("the total number of blocks are "+count);
	}

}
