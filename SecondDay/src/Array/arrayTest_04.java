package Array;

public class arrayTest_04 {

	public static void main(String[] args) {
		int intArray[]; // �迭 ���۷��� ���� ����
		intArray = makeArray(); // �޼ҵ�κ��� �迭 ���� ����
		for(int i =0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " "); // �迭 ��� ���� ���
		}
	}
	public static int[] makeArray() {
		int temp[] = new int[4]; // �迭 ����
		for(int i =0; i < temp.length; i++) {
			temp[i] = i+1;
		}
		
		return temp;
	}

}
