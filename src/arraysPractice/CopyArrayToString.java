package arraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyArrayToString {
	public static void main(String[] args) {
		
	
	int a[]= {1,4,5,0,0,6,0,2};
	int[] temp = new int[a.length];
	int j=0;
	for(int i=0;i<=a.length-1;i++) {
		if(a[i]!=0) {
			
			a[j++]=a[i];
		}
	}
		while(j<a.length) {
			a[j++]=0;
		}
	System.out.println(a);

	}
}
