package stringsPractice;

public class SwapPairofCharacter {
	
	public static void main( String args[]) {
		
		String str = "vinayaparna";
		System.out.println(("str is: "+ SwapPairofCharacter.swap1(str)));
		
	}
	
	public static String swap1(String str) {
		if(str ==null|| str.isEmpty()) {
			return str;
		}
		StringBuilder sb = new StringBuilder();
		for(int i =0; i<str.length()-1;i+=2) {
			sb.append(str.charAt(i+1));
			sb.append(str.charAt(i));
			
		}
		if(str.length()%2!= 0)
			sb.append(str.charAt(str.length()-1));
		System.out.println(sb.toString());
		
		return sb.toString();
	}

}
