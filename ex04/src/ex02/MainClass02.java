package ex02;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t = new TestClass02();
		System.out.println(t.getNum()); // 1234
		t.setNum(888);
		System.out.println(t.getNum()); // 1000
	}
}
