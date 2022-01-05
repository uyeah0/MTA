package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListTest_01 {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		//ArrayList<String> a = new ArrayList<>();나 
		//var b = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		for(int i =0; i < 4; i++) {
			System.out.print("이름을 입력하세요 >>> "); 
			String s = sc.next(); // 키보드로부터 입력
			a.add(s); // 리스트 컬렉션에 삽입
		}
		// ArrayList에 들어 있는 모든 이름 출력
		for(int i =0;i < a.size(); i++) {
			// ArrayList의 i 번째 문자열 얻어오기
			String name = a.get(i);
			System.out.print(name + " ");
		}
		// 가장 긴 이름 출력
		int longsetIndex = 0;
		for(int i = 1; i < a.size(); i++) {
			if(a.get(longsetIndex).length() < a.get(i).length())
				longsetIndex = i;
		}
		System.out.println("가장 긴 이름은 : " + a.get(longsetIndex));

		sc.close();
	}

}
