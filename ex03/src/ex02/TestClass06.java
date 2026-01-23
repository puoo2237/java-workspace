package ex02;

public class TestClass06 {
	// 메소드 오버로딩
	public void test() {
		System.out.println("기본 test 실행");
	}

	public void test(int n) {
		System.out.println("int test");
	}

	public void test(String n) {
		System.out.println("String test");
	}

	public void test(int n1, int n2) {
		System.out.println(n1 + n2);
	}
}
