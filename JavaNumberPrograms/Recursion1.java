package javaPractice;

public class Recursion1 
{
	public static void test()
	{
		int a=0;
		if(a<5)
		{
		System.out.println("test");
		test();
		a++;
		}
		
		}
	public static void main(String[] args)
	{
		System.out.println("Started");
		test();
		System.out.println("end");
	}
}
/*
This will lead to infinit loop
because the test() will be repeatedly called 
the compliler will not be allowed to increment the 'a'
before incrementing 'a' it will keep on calling the function
TO AVOID THAT WE CAN CALL THE METHOD LIKE BELOW

public static void test(int a)
{
   if(a<5)
     {
       System.out.println("test");
       a++;
       test(a);
     }
}

 points to be kept in mind
 1. recusive statement should be inside conditional statement
 2. any statement after recusive statement will not get executed if there is no conditional
    statement
 3. values used for conditional statement should be passed as an argument to that recursive function

*/