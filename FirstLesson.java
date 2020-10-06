/*
 * FirstLesson.java
 * 
 * Copyright 2020 Yashar Nishaburi <yasharnishaburi@10-72-120-145.wifi.8.s.pas.ofs.edu.sg>
 * 
 * This program is not a free software cuz its amazing and you're too much of a pesant to be accessing this masterpiece for free 
 * Copyright included 
 * If reused you will regret using it 
 * Bill gates once asked me for this code and I refused to give this to him
 * Same goes with elon musk
 * So dont even think about using this code for personal uses.
 * 
 */
 

// \n = new line 
// \t = tab (usually four spaces)

public class FirstLesson
{
	
	public static void main (String[] args) 
	{
		System.out.println("\n");
		System.out.println("Hello mens");
		System.out.print("How");
		System.out.print(" are you?\nI dont really care.\n");
		int age = IBIO.inputInt("How old are you?");
		
		System.out.println(age+"?");
		if ( age < 18)
		{
			System.out.println("Oh no you are underage");
		}
		
		System.out.print("how much can you count to? ");
		int n = IBIO.inputInt();
		
		for (int i=1 ; i<=n ; i++)
		{
			System.out.println(i);
		}
	}
}

