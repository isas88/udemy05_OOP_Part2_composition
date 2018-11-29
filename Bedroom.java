package udemy05_OOP_Part2_composition;

public class Bedroom {

	public Bedroom(boolean setfanswitch, char lightintensity, 
			boolean dresser, int waterdispenserlevel, bed bed1) {
		this.setfanswitch = setfanswitch;
		this.lightintensity = lightintensity;
		this.dresser = dresser;
		this.waterdispenserlevel = waterdispenserlevel;
		this.bed1 = bed1;
	}

	private boolean setfanswitch;
	private char lightintensity;
	private boolean dresser;
	private int waterdispenserlevel;
	private int noofdoors=4;
	private bed bed1;
		
	
	public void chglight(char intensity) {
		this.lightintensity = intensity;
		System.out.println("Light Intensity is :" +this.lightintensity);
	}
	
	public void chgwaterlvl(int level) {
		this.waterdispenserlevel = level;
		System.out.println("Water dispenser lvl :" +waterdispenserlevel);
	}

	
	public boolean isSetfanswitch() {
		return setfanswitch;
	}

	public void setSetfanswitch(boolean setfanswitch) {
		this.setfanswitch =  setfanswitch;
		System.out.println("Fan is set to :" +this.setfanswitch);
	}

	public int getNoofdoors() {
		return noofdoors;
	}

	public boolean isDresser() {
		return dresser;
	}

	public bed getBed1() {
		return bed1;
	}



}
