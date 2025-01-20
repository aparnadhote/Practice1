package letsLearnBasics;

public class ToPrnt_evenLengthWordsonlyinString {
	
	public static void main(String args[]) {
		
		String s = "This is a Java language program";
		
		for(String w: s.split(" ")) {
			
			if(w.length()%2==0) {
				System.out.println(w);
			}
		}
	}

}
