package firstDay;

public class test_Exam10 {

	public static void main(String[] args) {
		int number = 1;
		//String text1 = '' + number; // ''�� char���̴� String�� ""�� ����Ѵ�
		String text2 = "" + number;
		//String text3 = number.toString(); 
		// number�� Integer�̸� �����ϰ� int�̸� �Ұ����ϴ�. 
		String text4 = String.valueOf(number);
		// valueOf�� ���ڿ��� �������·� ��ȯ�� �� ����ϴ� �������̴�.
		System.out.println(text2);
		System.out.println(text4);
	}

}
