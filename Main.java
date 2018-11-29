package udemy05_OOP_Part2_composition;

public class Main {

	public static void main(String[] args) {
	
		dimensions beddimensions = new dimensions(7,4,2);
		bed bed1 = new bed("King",2,10,beddimensions);
		Bedroom room1 = new Bedroom(true,'H',false,10,bed1);
		
		beddimensions.getHeight();
		
		
		//room1.chgwaterlvl(40);
		//room1.getBed1().setBedsize("Queen");
		//room1.getBed1().getBedsize();
		
		//System.out.println(room1.isSetfanswitch());
		
		//room1.getBed1().getBedsize();
		
		//room1.getBed1().getBeddimensions().getHeight();
		
		room1.getBed1().Beddimensions().setHeight(10);
		room1.getBed1().Beddimensions().setHeight(4);
		beddimensions.getHeight();
		System.out.println(room1.isSetfanswitch());
		System.out.println(room1.getBed1().getNoofpillows());
		room1.getBed1().Beddimensions().setHeight(20);
		room1.getBed1().Beddimensions().getHeight();
	}
	
	
}
