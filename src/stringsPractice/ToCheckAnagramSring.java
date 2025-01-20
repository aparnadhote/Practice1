package stringsPractice;

import java.util.Arrays;

public class ToCheckAnagramSring {
	
	public static void main(String args[]) {
	
	String str1 = "Listen";
	String str2 = "Silent";
	boolean b = false;
	System.out.println(ToCheckAnagramSring.anagram(str1.toLowerCase(),str2.toLowerCase(),b));
	
	
	}
	
	public static boolean anagram(String str1,String str2,boolean b) {
		
		//StringBuilder bd =  new StringBuilder(str1);
		char[] ch = str1.toCharArray();
		char[] ch1= str2.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);		
		for (int i=0;i<str1.length();i++) {
			if(ch[i]!=ch1[i]) {
				return false;
				
			}
		}
		return true;
		
		
	}
	

}
