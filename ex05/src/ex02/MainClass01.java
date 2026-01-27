package ex02;

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t01 = new TestClass01();
		t01.num = 100;
		t01.arr.add("문자열");
		System.out.println(t01.num);
		System.out.println(t01.arr.get(0));
	}
}
