package ex08;

public class TestException {

	public static void main(String[] args) {
//		int n1 = 7;
//		int n2 = 2;
//		int n2 = 0;
//		int n  = n1 / n2;
//		
//		System.out.println(n);
//		System.out.println("프로그램 종료");

//		예외처리 (Exception Handling)
//		예외 - 실핼중에 발생하는 오류
		try {
			int n1 = 7;
			int n2 = 0;
			int n  = n1/n2;
			System.out.println(n);
		} catch(ArithmeticException e) {           //오류발생시 실행
			System.out.println("계산오류:" + e);
		} catch(Exception e) {
			System.out.println("오류발생:" + e);
		} finally {                                //오류와 상관없이 실행
			System.out.println("프로그램 종료");
		}
		
		
		
	} //

} //
