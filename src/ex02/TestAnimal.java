package ex02;

abstract class Animal {
	String name;
	int    age;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	abstract void sound();
}

class Dog extends Animal {
	void sound() {
		System.out.println(name + "(이)가 멍멍");
	}
}

class Cat extends Animal{
	void sound() {
		System.out.println(name + "(이)가 애옹");
	}
	
}

class Rabbit extends Animal{
	void sound() {
		System.out.println(name + "(이)가 깡총");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog    dog    = new Dog();
		work(dog, "dog");
		
		Cat    cat    = new Cat();
		work(cat, "cat");
		
		Rabbit rabbit = new Rabbit();
		work(rabbit, "rabbit");

	}

	private static void work(Animal animal, String name) {
		animal.name = name;
		animal.eat();
		animal.sound();
		
	}


} //
