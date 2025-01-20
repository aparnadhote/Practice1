package stringsPractice;

import java.util.Arrays;

public class SortString {
	
	public static void main(String args[]) {
		
		String str = "Aparna";
		System.out.println(str.compareTo("Aparna"));
		
		System.out.println("Sorted String is: "+ SortString.sorted(str.toCharArray()));
		
	}
	
	public static String sorted(char[] str) {
		//StringBuilder sb = new StringBuilder(str);
		
		Arrays.sort(str);
		return new String(str);
	}

}
