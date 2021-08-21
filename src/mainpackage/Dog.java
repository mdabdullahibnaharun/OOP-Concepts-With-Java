package mainpackage;

public class Dog extends Animal implements AnimalWork {

	int age;

	public Dog(String nameString, int legs, String colorString) {
		super(nameString, legs, colorString);
		// TODO Auto-generated constructor stub
	}

	// overloading
	public Dog(String nameString, int legs, String colorString, int age) {
		super(nameString, legs, colorString);
		this.age = age;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(super.getNameString() + " Is walking");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println(super.getNameString() + " Is sleeping");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(super.getNameString() + " Is eating");
	}

	public void display() {
		System.out.println(super.toString() + " Age :  " + this.age);
	}

}
