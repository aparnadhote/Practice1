package letsLearnBasics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String playerName = "Tim";
		int position = 0;
		int scores[]= {1500,1000,500,100,25};
		
		for(int a:scores) {
			
			position = calculateHighScorePosition(a);
			displayHighSchoolPosition(playerName, position);
		}
		

	}
	
	public static void displayHighSchoolPosition(String playerNmae, int position) {
		
		System.out.println(playerNmae+" managed to get into position "+ position 
				+" on the highschool score list");
		
		
	}
	public static int calculateHighScorePosition(int pScore) {
		
		if (pScore>=1000) {
			
			return 1;
		}
		else if(pScore>=500 && pScore<1000){
			return 2;
			
		}
		else if (pScore>=100 &&pScore<500) {
			return 3;
			
		}
			return 4;
		
	}

}
