package thirdDay;

class A{
	public A() {
		System.out.println("������A");
	}
	public A(int x) {
		System.out.println("�Ű����� ������ A");
	}
	
}
class B extends A{
	public B() {
		System.out.println("������ B");	
	}
	public B(int x) {
		System.out.println("�Ű����� ������ B");
	}
}
public class test_01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b;
		b = new B(5);
	}

}
