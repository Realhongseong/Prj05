package ex08;

public class TestException {

	public static void main(String[] args) {
		/*
		 * int n1 = 7; //int n2 = 2; int n2 = 0; int n = n1 / n2; // 정수/정수 -> 정수 3
		 
		 * Exception in thread "main" java.lang.ArithmeticException: / by zero at
		 * ex08.TestException.main(TestException.java:9)
		 
		 * //9라인에서 프로그램 장제종료, 이후 코드는 실행되지 않음.
		 
		 * System.out.println( n ); System.out.println("프로그램 종료");
		 */
		// 예외처리 (Exception Handling)
		// 예외 - 실행중에 발행하는 오류

		try {
			int n1 = 7;
			int n2 = 0;	
			int n = n1 / n2;
			System.out.println(n);
		} catch(ArithmeticException e) {	// 오류 발생시 처리 방법
			System.out.println("계산오류:" + e);
		} catch (Exception e) {
			System.out.println("오류발생:" + e);
		} finally {	// 오류에 상관없이 무조건 실행
			System.out.println("프로그램 종료");
		}
		
	}

}
