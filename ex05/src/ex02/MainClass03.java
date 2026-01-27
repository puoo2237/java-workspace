package ex02;

public class MainClass03 {
	public static void main(String[] args) {
		TestClass03 t01 = new TestClass03();
		t01.calc();
		t01.com();
		
		System.out.println("== upcasting");
		Calc calc = new TestClass03();
		calc.calc();
	}
}
