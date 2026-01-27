package ex02;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t01 = new TestClass02();
		t01.test();
		
		t01.add("문자열 입력");
		System.out.println(t01.get(0));
	}
}
