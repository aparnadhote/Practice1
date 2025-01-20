package letsLearnBasics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] {1,2,6,4,5,9,}));
		Set<Integer> b= new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] {0,9,3,6,7,2,4,8,7,}));
		Set <Integer> union = new HashSet<Integer>(a);
		union.removeAll(b);
		System.out.println(union);
		

	}

}
