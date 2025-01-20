package stringsPractice;

public class RemoveLeadigZeros {
	
	public static void main(String args[]) {
		
		String s= "000123456";
		
		System.out.println("Corrected String is:" + RemoveLeadigZeros.removed(s));
		
	}
	
	public static String removed(String s) {
		
		char[] ch = s.toCharArray();
		String s1;
		int j=0;
		
		
		for(int i=0;i<s.length();i++) {
			
			if(ch[i]!='0') {
				j=i;
				break;
			}
		}
		s1=s.substring(j);
		 return s1;
	}

}
