package stringsPractice;

public class Countcharacter {
	public static void main(String[] args) {
		String s= "I have an amazing offer";
		Countcharacter c= new Countcharacter();
		c.Charcount(s.toCharArray());

	}
	 public void Charcount(char[] ch) {
		 for(char c1:ch) {
			 System.out.println(c1);
		 }
		 
	 }
	

}
