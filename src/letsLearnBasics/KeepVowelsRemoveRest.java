package letsLearnBasics;

public class KeepVowelsRemoveRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Hello World Aparna";
		System.out.println(KeepVowelsRemoveRest.removeVowel(input.trim()));

	}
	
	public static String removeVowel(String str) {
		
		StringBuilder result = new StringBuilder();
		String vowels = "AEIOUaeiou";
		for(char c :str.toCharArray()) {
			
			if(vowels.indexOf(c)!=-1) {
				result.append(c);
			}
		}
		
		return result.toString();
	}

}





