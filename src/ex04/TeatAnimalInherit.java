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

class Tiger extends Pet {
	void cry() {
		System.out.println(name + "(이)가 어흥");
	}
}


public class TeatAnimalInherit {

//	inherit(상속) - 자바에서는 extends
//	상속은 한개만 가능 -> java, c#
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		work(dog, "츄");
//		dog.name = "츄";
//		dog.eat();
//		dog.bark();
		
		Cat cat = new Cat();
		work(cat, "네로");
//		cat.name = "네로";
//		cat.eat();
//		cat.meow();
		
		Tiger tiger = new Tiger();
		work(tiger, "타이거");
		
		Pet pet = new Pet();
		pet.name = "뻐끔이";
		pet.eat();		
		
//		pet = dog;
//		pet.eat();
//		pet.bark();
//		
//		dog = (Dog) pet;
//		dog.eat();
		
		
	} //

private static void work(Pet pet, String name) {
	pet.name = name;
	pet.eat();
	
	if (pet instanceof Dog) 
		((Dog) pet).bark();
	if (pet instanceof Cat)
		((Cat) pet).meow();
	if (pet instanceof Tiger)
		((Tiger) pet).cry();
}
	
	
//---------------------
//private static void work(Cat cat, String name) {
//	cat.name = name;
//	cat.eat();
//	cat.meow();
//}
//
//private static void work(Dog dog, String name) {
//	dog.name = name;
//	dog.eat();
//	dog.bark();
//}
//	-------------------

} //
