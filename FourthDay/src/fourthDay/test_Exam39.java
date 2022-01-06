package fourthDay;

public class test_Exam39 {

	public static void main(String[] args) {
		try {
			int x  = 1/0;
			System.out.println("try");
		}catch (ArithmeticException e) { // 정수를 0으로 나눴을 때 나타나는 exception
			// exception 순서 중요 작은 것 부터 넣기
			System.out.println("catch ArithmeticException");
		}catch (Exception e) {
			System.out.println("catch Exception");
		}finally {
			System.out.println("finally");
		}

	}

}
