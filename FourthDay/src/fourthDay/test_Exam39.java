package fourthDay;

public class test_Exam39 {

	public static void main(String[] args) {
		try {
			int x  = 1/0;
			System.out.println("try");
		}catch (ArithmeticException e) { // ������ 0���� ������ �� ��Ÿ���� exception
			// exception ���� �߿� ���� �� ���� �ֱ�
			System.out.println("catch ArithmeticException");
		}catch (Exception e) {
			System.out.println("catch Exception");
		}finally {
			System.out.println("finally");
		}

	}

}
