package ch07.sec10.exam02;

public class AbstractMethodExample {

	public static void main(String[] args) {
	
		dog dog = new dog();
		dog.sound();
		
		Cat cat= new Cat();
		cat.sound();
		
		animalSound(new dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	

}
