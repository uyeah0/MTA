package firstDay;
import java.util.Scanner; // �Է¹޾ƾ� �ϱ� ������ Scanner�� import �Ѵ�
public class test_Exam08 {

	public static void main(String[] args) {
		getBirthdate();

	}
	public static String getBirthdate() {
		System.out.println("������ MMDDYYYY �������� �Է��Ͻʽÿ�");
		Scanner sc = new Scanner(System.in); // Scanner ���
		String birthdate = sc.next(); // �Է¹ޱ�
		sc.close(); // Scanner �ݱ�
		return birthdate;
	}

}
