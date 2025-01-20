package letsLearnBasics;

public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double var1 =20.00;
		double var2 = 80.00;
		double total= (var1 +var2)*100;
		double reminder = total%40;
		
		boolean b = (reminder==0)?true:false;
		System.out.println(b);
		if(!b) {
			System.out.println("got some reminder");
		}
		
		
		
		
		
	}

}
