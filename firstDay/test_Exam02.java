package firstDay;

public class test_Exam02 {
	private int id = 3; // �� Ŭ������ ����ֱ� ������ private���� �������
	public static void main(String []args)
	{
		test_Exam02 customer = new test_Exam02(); 
		customer.id = 5; // customer. �����縦 �߰��ؾ� id�� showId()�� ������ �� �ִ�.
		customer.showId();
	}
	protected void showId(){ // �� Ŭ������ ����ֱ� ������ public���� �������� �ʾƵ� �������
		System.out.println(id);
	}
	

}
