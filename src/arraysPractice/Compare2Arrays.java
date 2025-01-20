package arraysPractice;

import java.util.Arrays;

public class Compare2Arrays {
	public static void main(String args[]) {
		
		int a1[] = {1,2,3,4,5,6};
		int a2[]= {1,2,3,4,5,6};
		boolean b= true;
		
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("yes ");
		}
		System.out.println("not equal");
		
		
//		for(int i=0;i<a1.length;i++) {
//			
//			if(a1.length!= a2.length) {
//				b= false;
//				break;	
//			
//			}
//			
//				if(a1[i]!=a2[i]) {
//					b= false;
//					break;				}
//		
//		}
//		if(b) {
//			System.out.println("equal");
//		}
//		else {
//			System.out.println("Not equal");
//		}
		
	}
}
