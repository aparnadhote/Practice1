package stringsPractice;

public class FindDuplicateChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="hackerearth";
		
		System.out.println((FindDuplicateChar.findit(s.toCharArray())));
	}
	
	public static String findit(char[] s) {
		StringBuilder sb = new StringBuilder();
			for (int i=0;i<=s.length;i++){
				
				for(int j=i+1;j<=s.length-1;j++) {
					
					if(s[i]==s[j]) {
						break;
					}
					else {
						sb.append(s[i]);
					}
				}
			}
		
		return sb.toString();
	}


}
