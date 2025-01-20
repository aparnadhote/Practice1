package stringsPractice;

public class palindromstring {
	
	public static void main ( String args[]) {
		
		palindromstring.pal("I a I");
		palindromstring.pal("Geeks");
		
	}
	public static void pal(String s) {
		
		StringBuilder s1= new StringBuilder(s);
		s1=s1.reverse();
		if (s.equals(s1.toString())) {
			System.out.println("pal");
		}
		else
			System.out.println("not pal");
		
	}
}
