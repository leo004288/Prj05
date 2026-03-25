package ex04;

class Pet {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
}

class Dog extends Pet {       // = Pet + Dog
	void bark() {
		System.out.println(name + "(이)가 짖는다");	
	}
	
}

class Cat extends Pet {
	void meow() {
		System.out.println(name + "(이)가 운다");	
	}
	
}


public class TeatAnimalInherit {

//	inherit(상속) - 자바에서는 extends
//	상속은 한개만 가능 -> java, c#
	public static void main(String[] args) {
		
		Pet pet = new Pet();
		pet.name = "뻐끔이";
		pet.eat();
		
		Dog dog = new Dog();
		dog.name = "츄";
		dog.eat();
		dog.bark();
		
		Cat cat = new Cat();
		cat.name = "네로";
		cat.eat();
		cat.meow();
		
		
	} //

} //
