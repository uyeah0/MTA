package Array;

public class arrayTest_04 {

	public static void main(String[] args) {
		int intArray[]; // 배열 레퍼런스 변수 선언
		intArray = makeArray(); // 메소드로부터 배열 전달 받음
		for(int i =0; i < intArray.length; i++) {
			System.out.println(intArray[i] + " "); // 배열 모든 원소 출력
		}
	}
	public static int[] makeArray() {
		int temp[] = new int[4]; // 배열 생성
		for(int i =0; i < temp.length; i++) {
			temp[i] = i+1;
		}
		
		return temp;
	}

}
