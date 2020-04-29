package javapractice;

public class LCD 
{
	public static void main(String[] args) {

        int n1 = 72, n2 = 120, max;

        // maximum number between n1 and n2 is stored in lcm
        max = (n1 > n2) ? n1 : n2;

        // Always true
        while(true)
        {
            if( max % n1 == 0 && max % n2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, max);
                break;
            }
            ++max;
        }
    }
}
