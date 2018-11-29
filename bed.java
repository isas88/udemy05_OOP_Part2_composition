package udemy05_OOP_Part2_composition;

public class bed {

	private String bedsize;
	private int noofpillows;
	private int noofwoodslacks;
	private dimensions beddimensions;
	
	public bed(String bedsize, int noofpillows, int noofwoodslacks, 
			dimensions beddimensions) {
		this.bedsize= bedsize;
		this.noofpillows = noofpillows;
		this.noofwoodslacks = noofwoodslacks;
		this.beddimensions = beddimensions;
	}
	
	public void printbed() {
		System.out.println("bedsize :" +bedsize);
		System.out.println("noofpillows :" +noofpillows);
		System.out.println("noofwoodslacks :" +noofwoodslacks);
	}

	public String getBedsize() {
		System.out.println("Bed Size :" +this.bedsize);
		return bedsize;
	}

	public void setBedsize(String bedsize) {
		this.bedsize = bedsize;
		System.out.println("Bed Size set as:" +this.bedsize);
	}

	public int getNoofpillows() {
		return noofpillows;
	}

	public void setNoofpillows(int noofpillows) {
		this.noofpillows = noofpillows;
	}

	public int getNoofwoodslacks() {
		return noofwoodslacks;
	}

	public void setNoofwoodslacks(int noofwoodslacks) {
		this.noofwoodslacks = noofwoodslacks;
	}

	public dimensions Beddimensions() {
		return this.beddimensions;
	}
	
}
