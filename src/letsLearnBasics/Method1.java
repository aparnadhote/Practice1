package letsLearnBasics;

public class Method1 {
	
	    
	     public static void main (String[] args) {
	        /* code */
			checkNumber(0);
	        checkNumber(5);
	        checkNumber(-5);
	        
	    }
	    
	    public static void checkNumber(int number){
	        
	        if(number>0){
	            System.out.println("positive");
	        }
	        else if(number<0){
	        System.out.println("negative");
	        }
	        else{
	            System.out.println("zero");
	        }
	        System.out.println(2500%1024);
	        
	        
	    }
	
	}

