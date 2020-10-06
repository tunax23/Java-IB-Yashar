/*
 * Mock.java
 * 
 * Copyright 2020 Yashar Nishaburi <yasharnishaburi@10-72-120-145.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Mock 
{
	public static void main (String[] args) 
	{
		int n2 = 1;
		while (n2 != 0)
		{
			System.out.println("Yashar Nishaburi");
			int n1 = IBIO.inputInt("Input base: ");
			 n2 = IBIO.inputInt("Input exponent: ");
			if (n1 == 0)
			{
				System.out.println("Base = zero. Nothing to do.");
				System.exit(0);
			}	
			if (n2 < 0)
			{
				System.out.println("Warning: exponent should be positive");
				//System.exit(0); For Q 5 
			}
			int ans = n1;
			if (n2 >0)
			{
				for ( int i = 1 ; i < n2 ; i++)
				{
					ans = ans * n1;
				}
				System.out.println( n1 + " to the power of " + n2 + " = " + ans);
			}
			if (n2 <0)
			{
				for ( int i = n2+1 ; i < 0 ; i++)
				{
					ans = ans * n1;
				}
				System.out.println( n1 + " to the power of " + n2 + " = 1/" + ans);
				double decans = 1.0 / ans;
				System.out.println( "  1" );
				System.out.println("---- = " + decans);
				System.out.println( " " + n2 );
			}
		}
		System.out.println("Program ended");
	}
}

