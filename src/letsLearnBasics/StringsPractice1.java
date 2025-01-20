package letsLearnBasics;

public class StringsPractice1 {
	
	public static void main(String args[]) {
		String name = "AParna";		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		System.out.println(name.trim().concat("d"));
		System.out.println(name.contains("n"));
		String s2 = name.concat("Vinay");
		System.out.println(s2);
	}

}
