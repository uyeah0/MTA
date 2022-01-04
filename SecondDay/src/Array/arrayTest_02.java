package Array;

public class arrayTest_02 {
	enum Week{월, 화, 수, 목, 금, 토, 일};
	public static void main(String[] args) {
		int[]num = {1,2,3,4,5};
		int sum = 0;
		for(int k : num) { // 반복될 때마다 k는 num[0], num[1] ..값으로 설정
			sum += k;
		}
		System.out.println("합은 " + sum);
		
		String names[] = {"사과", "배" , "바나나", "체리", "딸기", "포도"};
		for(String s: names) { // 반복할 때마다 s는 names[0], names[1], .. names[5]로 설정
			System.out.print(s + " ");
		}
		
		
		for( Week day: Week.values()) { // 반복될 때마다 day는 월, 화, 수, 목, 금, 토, 일로 설정
			System.out.println(day + "요일");
		}
		
	}

}
