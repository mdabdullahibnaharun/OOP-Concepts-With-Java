package mainpackage;

public abstract class Animal {
	protected String nameString;
	private int legs;
	private String colorString;

	public Animal(String nameString, int legs, String colorString) {
		this.nameString = nameString;
		this.legs = legs;
		this.colorString = colorString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}

	public String getColorString() {
		return colorString;
	}

	public void setColorString(String colorString) {
		this.colorString = colorString;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println("----------------Animal---------------");
		return "Name : " + this.nameString + " legs : " + this.legs + " Color : " + this.colorString;
	}

}
