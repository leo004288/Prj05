package ex05;

abstract class Pet {  // 한개 이상의 abstract 매소드가 있다면 abstract class
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다.");
	}
	abstract void sound();   // 함수의 {}가 없으면 abstract 필수
}

class Dog extends Pet{
//	코딩이 없는 함수를 상속받으면 자식이 코딩을 구현해야함 - 재정의(override)
// Add unimplemented method
	@Override
	void sound() {
		System.out.println(name + "(이)가 짖는다.");
		
	}
	
}

class Cat extends Pet{

	@Override
	void sound() {
		System.out.println(name + "(이)가 운다.");
		
	}
	
}

public class TestAnimal {

	public static void main(String[] args) {
		
//		Pet pet = new Pet();  // abstract가 있으면 new 불가능
		
		Dog dog = new Dog();
		work(dog,"츄");
//		dog.name = "츄";
//		dog.eat();
//		dog.sound();

		Cat cat = new Cat();
		work(cat,"네로");
//		cat.name = "네로";
//		cat.eat();
//		cat.sound();
		
	} //

	
//// work 한개로 통일 -------------------------------------------------------
//	자식클래스는 부모클래스 담을 수 있다. Pet pet = dog
	private static void work(Pet pet, String name) {
		pet.name = name;
		pet.eat();
		pet.sound();	
	}
	
	

////  방법1 - 함수의 오버로드기능 활용 --------------------------------------
//	private static void work(Dog dog, String name) {
//		dog.name = name;
//		dog.eat();
//		dog.sound();
//		
//	}
//	
//	private static void work(Cat cat, String name) {
//		cat.name = name;
//		cat.eat();
//		cat.sound();
//		
//	}
// ---------------------------------------------------------------------------

} //
