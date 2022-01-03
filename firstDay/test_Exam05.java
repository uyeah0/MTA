package firstDay;

public class test_Exam05 {

	public static void main(String[] args) {
		int anum = 55;
		for(int cnt = 0; cnt < 10; cnt++) { 
			add(anum); // 55만 전달된다
		}
		// System.out.println(cnt); // cnt는 반복문이 끝나면 사라진다

	}
	public static void add(int anum) { // void 타입이므로 1증가후 값이 반환되지 않는다
		anum++; // 56으로 끝난다
	}

}
