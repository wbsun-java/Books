package com.sun;

import java.util.*;

public class BeerSong {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable p = new Variable();
		p.rintThisLine("Count the number of bottle beers on the wall: ");
		String word = "bottles";
		Scanner scanner = new Scanner(System.in);
		int beerNum = scanner.nextInt();
		
		while (beerNum > 0) {	
			p.rintNextLine(beerNum + " " + word + " of beer on the wall, take one down, pass it around.");
			beerNum = beerNum - 1;

			if (beerNum == 1) {
				word = "bottle";
			}//end if (beerNum == 1) loop;
				
		}//end (beerNum > 0) while loop;
		
		if (beerNum == 0) {
			p.rintNextLine("No more bottl beer on the wall");
		}//end if (beerNum == 0) loop;
	
	}//end main method;
	
	
}//end class;
