package stringsPractice;

public class insertStringIntoAnotherSTring {
	
	public static void main(String args[]) {
		
		insertStringIntoAnotherSTring i = new insertStringIntoAnotherSTring();
		
		
		String result =i.insertWord("GeeksGeeks",4, "for");
		System.out.println(result);
		
	}
	public String insertWord(String Original, int i,String tobeinserted) {
		//By using substring method
		
	//	String s = Original.substring(0, i+1) + " " +tobeinserted+" " + Original.substring(i+1);
		
		//By using String Buffer
		StringBuffer s= new StringBuffer(Original);
		s.insert(i+1, tobeinserted);
		
		return s.toString();
	}
	
}
