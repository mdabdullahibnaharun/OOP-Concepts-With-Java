package mainpackage;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalWork animal1 = new Dog("Roky", 4, "Black", 5);
		AnimalWork animal2 = new Cat("Minu", 4, "white", 3);

		List<AnimalWork> animals = new ArrayList<AnimalWork>();

		animals.add((AnimalWork) animal1);
		animals.add((AnimalWork) animal2);
		
		Animal a =  new Cat("Minu", 4, "white", 3);
		System.out.println(a.getClass() + "\n" +a.toString());

		System.out.println("Program Start *****************");

		for (int i = 0; i < animals.size(); i++) {
			animals.get(i).display();
			animals.get(i).eat();
			animals.get(i).walk();
			animals.get(i).sleep();
		}

		System.out.println("***************** Program End");
		info();
	}

	public static void info() {

		System.out.println("\nName : Md Abdullah Ibna Harun || Batch : 54  ||Section:O-1 ||Id: 193-15-13426");
		System.out.println("\nThank You!............\n#This Program is creat by me with little oop concepts:");
		System.out.println(
				"1)Inharitance(Animal->cat>dog)\n2)Encapsulation(Animal)\n3)methodOverloading(constructor with different parameters)\n4)methodOverriding(polymorphisom)\n5)Interface(AnimalWork)");

	}

}
