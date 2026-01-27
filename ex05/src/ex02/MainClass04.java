package ex02;

class Test04 {
	public Test04(String name) {
		System.out.println(name + " test04 부모 생성자");
	}
}

class TestClass04 extends Test04 {
	// 부모를 상속하면 생성자 역시도 상속되어 실행됨
	public TestClass04() {
		super("값 전달"); // 부모 생성자에게 값 전달
		System.out.println("TestClass04 자식 생성자");
	}

	public TestClass04(String n) {
		super(n); // 부모 생성자에게 넘겨 받는 값
		System.out.println("값 받는 자식 생성자");
	}
}

public class MainClass04 {
	public static void main(String[] args) {
		TestClass04 t01 = new TestClass04();
		TestClass04 t02 = new TestClass04("전달사항");

	}
}
