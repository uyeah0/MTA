package firstDay;
import java.util.Scanner;

public class test_Exam11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner("1 Ź�� 2 ��� 3 ��ȣ 4 �ҷ�");
		Object data1 = sc.next(); // ���� ������ ���� �а� �������� �ѱ��
		Object data2 = sc.next(); // ���� ������ ���� �а� �������� �ѱ��
		Object data3 = sc.nextInt(); // ���� ������ ���� �а� �������� �ѱ��
		Object data4 = sc.nextLine(); // ����Ű������ �Է��� �� ������ �´�
		
		System.out.println(data1);
		System.out.println(data2);
		System.out.println(data3);
		System.out.println(data4);
	}

}

