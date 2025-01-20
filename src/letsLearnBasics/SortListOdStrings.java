package letsLearnBasics;

import java.util.Arrays;

public class SortListOdStrings {
	
	public static void main (String args[]) {
		
		String[] inputString = {"jan","feb","mar","Apr","may","Jun","Jul","aug"};
		//SortListOdStrings.showlist(inputString);
		Arrays.sort(inputString,String.CASE_INSENSITIVE_ORDER);
		Arrays.toString(inputString);
		
		//System.out.println(inputString.toString());
		
		SortListOdStrings.showlist(inputString);
	
	
	}
	public static void showlist(String[] inputString) {
		
		for (String s :inputString) {
			System.out.println(s+" ");
			
		}
		
	}

}
