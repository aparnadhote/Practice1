package arraysPractice;

public class PutzeroatEnd {
	public static void main(String[] args) {
		
	
	Integer[] a = {1,5,0,6,0,2,0,0,8};
	int[] temp = new int[a.length];
	int count=0;
	for(int i=0;i<=a.length-1;i++) {
		
		if(a[i]!=0) {
			temp[count]=a[i];
			count++;
			
		}
	
	}
	
	for(int j=count;j<temp.length;j++) {
		temp[j]=0;		
	}

	for(int i:temp) {
		System.out.println(i);
	}
	
	
	}

}
