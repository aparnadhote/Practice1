package letsLearnBasics;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "Hello World argjeeiouytgh \n";
		System.out.println(RemoveVowels.removeVowels(input));
		
		

	}
	public static String removeVowels(String str) {
		
		String vowels="AEIOUaeiou";
		
		StringBuilder result= new StringBuilder();
		for (char c : str.toCharArray()) {
			if(vowels.indexOf(c)==-1) {
				result.append(c);
				
			}
		}
		return result.toString();
		
		
	}

}
