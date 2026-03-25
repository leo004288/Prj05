package ex03;

class Dog {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void bark() {
		System.out.println(name + "(이)가 짖는다");	
	}
	
}

class Cat {
	String name;
	void eat() {
		System.out.println(name + "(이)가 먹는다");
	}
	void meow() {
		System.out.println(name + "(이)가 운다");	
	}
	
}

public class TestAnimal01 {

	public static void main(String[] args) {
		Dog chu = new Dog();   //생성자 호출 -> 생정자가 없는 상황: 자바가 기본생성자 생성
		chu.name = "츄";
		chu.eat();
		chu.bark();
		
		Cat nero = new Cat();
		nero.name = "네로";
		nero.eat();
		nero.meow();
		
		
		
	} //

} //
