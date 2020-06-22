package abstraction;

public class Test {

	public static void main(String[] args) {
		
		Sports sp = new Cricket();
		
		sp.play();
		
		sp.player();
		
		sp.equipment();
		
	    sp.diet();
	    
	Cricket ck = new Cricket();
	
	ck.format();
	
	
	Game gm = new Cricket();
	gm.rules();
	
	
	
	
	}

}
