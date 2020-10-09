

/*
 * Test.java
 * Yashar Nishaburi 
 * Comp sci Q1 Test #2 
 * 9th oct 2020 
 * 
 * IF NOT GIVEN A SEVEN BAD THINGS WILL HAPPEN 
 */


public class TestTR 
{
	
	public static void main (String[] args) 
	{
		System.out.println("");
		System.out.println("Yashar Nishaburi");
		int ns = 0;
		int np = 1;
		int n = IBIO.inputInt("Enter positive number less than 10: ");
		
		while (n >= 10 || n<1 )
		{
			System.out.println(">>>Error - Number non valid");
			n = IBIO.inputInt("Enter positive number less than 10: ");
		}
		for ( int i = 1 ; i <= n ; i++)
		{
			ns = i*i;
			if ( ns>=10 )
			{
				System.out.print(i + "   ");
			}
			else 
			{
				System.out.print(i + "    ");
			}
			np = np * n;
			System.out.print(ns+ " ");
			int c = 0;
			int k = 1;
			int t = 0;
			while (c != 1)
			{
				if (np/k >= 1)
				{
					t++;
				}
				else
				{
					c++;
				}
				k = k*10;
			}
			int space = 10 - t;
			for ( int j = 1 ; j <= space ; j++)
			{
				System.out.print(" ");
			}
			System.out.println(np);
			
		}
	}
}

