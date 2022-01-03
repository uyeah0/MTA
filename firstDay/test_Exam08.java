package firstDay;
import java.util.Scanner; // 입력받아야 하기 때문에 Scanner를 import 한다
public class test_Exam08 {

	public static void main(String[] args) {
		getBirthdate();

	}
	public static String getBirthdate() {
		System.out.println("생일을 MMDDYYYY 형식으로 입력하십시오");
		Scanner sc = new Scanner(System.in); // Scanner 사용
		String birthdate = sc.next(); // 입력받기
		sc.close(); // Scanner 닫기
		return birthdate;
	}

}
