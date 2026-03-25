package ex06;

class Duck {
	void swim() {
		System.out.println("헤엄을 친다");
	}
}

// 모든 항목이 abstract인 class는 interface 문법으로 변경
// extends 클래스 implements 인터페이스1,인터페이스2
interface Racoon {
	void dig();
}

class DuckRacoon extends Duck implements Racoon{

	@Override
	public void dig() {
		System.out.println("땅을 판다");
	}
	
}

public class TestDuckRacoon {

	public static void main(String[] args) {
		
		DuckRacoon dr = new DuckRacoon();
		dr.swim();
		dr.dig();
		
	} //

} //
