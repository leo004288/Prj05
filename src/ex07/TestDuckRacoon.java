package ex07;

interface Duck {
	void swim();
}

interface Racoon {
	void dig();
}

class DuckRacoon implements Duck, Racoon {

	@Override
	public void dig() {
		System.out.println("땅을 판다");
		
	}

	@Override
	public void swim() {
		System.out.println("헤엄친다");
		
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon dr = new DuckRacoon();
		dr.dig();
		dr.swim();
		System.out.println(dr.hashCode());
		System.out.println(dr.toString());
		System.out.println(dr.getClass());
		
		
		
		
		
		
		
//		모든 자바의 class는 Objct class를 상속받아 만들어짐
//		Object obj = new Object();
//		System.out.println(obj.toString());     16진수
//		System.out.println(obj.hashCode());     heap메모리 위치
//		System.out.println(obj.getClass());     class java.lang.Object
	} //

} //
