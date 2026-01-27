package ex04;

// 상속
// 1. 클래스 상속 (extends)
// - 부모가 가지고 있는 것을 그대로 사용해도 무방
// 2. 인터페이스 상속 (implements)
// - 메소드는 존재하지만 실질적인 코드가 없는 것 => 추상화
// - 상속받은 곳에서 메소드 정의를 해야 함 (오버라이딩)
// - 업캐스팅: 코드를 합칠 때, 필요한 기능만 합칠 수 있는 장점이 있음
// - 기능 이름 단일화
interface A01 {
	public void test();
}

class AAA{
	public void aaa() {
		System.out.println("부모 기능");
	}
}

class B01 extends AAA implements A01 {
	public void b01() {
		System.out.println("b01 메소드");
	}

	@Override
	public void test() {
		System.out.println("오버라이드 test");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		A01 a01 = new B01();
		B01 b01 = new B01();
		b01.test();
	}
}
