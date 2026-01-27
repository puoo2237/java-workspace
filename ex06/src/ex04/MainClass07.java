package ex04;

class MyClass07 {
	int num = 1234;
}

interface Test07 {
	public MyClass07 test();
}

class TestClass07 {
	public void testClass(Test07 t) {
		MyClass07 mc = t.test();
		System.out.println("출력: " + mc.num);
	}
}

public class MainClass07 {
	public static void main(String[] args) {
		Test07 t01 = new Test07() {

			@Override
			public MyClass07 test() {
//				MyClass07 mc = new MyClass07();
				return new MyClass07();
			}
		};
		TestClass07 tc01 = new TestClass07();
		tc01.testClass(t01);

		Test07 t02 = () -> new MyClass07();
		tc01.testClass(t02);

		tc01.testClass(() -> new MyClass07());

		tc01.testClass(MyClass07::new);
	}
}
