package udemy05_OOP_Part2_composition;

public class dimensions {
	private int length;
	private int width;
	private int height;
	
	public dimensions(int length, int width, int height) {
		this.length = length;
		this.width =  width;
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		System.out.println("Height :" +this.height);
		return this.height;
	}

	public void setHeight(int height) {
		this.height = height;
		System.out.println("Height is set as :" +this.height);
	}

	
}
