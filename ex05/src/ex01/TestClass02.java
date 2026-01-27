package ex01;

//하나의 페이지에서는 public을 두 개이상 쓸 수 없음
// default의 경우 같은 패키지 내에서만 사용 가능
class AAA { 
	int num = 1234;
}

public class TestClass02 {
	int num;
	public void test1() {
		System.out.println("test1");
	}

	void test2() {
		System.out.println("test2");
	}
}
