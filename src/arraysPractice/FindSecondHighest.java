package arraysPractice;

import java.util.Arrays;

public class FindSecondHighest {
	
	public static void main(String[] args) {
		
		int a[] = {7,1,5,9,6};
		
		//Solution 1
		
		Arrays.sort(a);
			System.out.println(a[a.length-2]);
			
			//Solution 2
int highest=0;
			
			for(int i=0;i<a.length-1;i++) {
				for(int j=1;j<a.length-1;i++) {
					
					if(a[i]>a[j]) {
						highest =a[i];
						
					}
					else {
						highest = a[j];
					}
					
				}
			}
				
	
			System.out.println(highest);
	}
}
