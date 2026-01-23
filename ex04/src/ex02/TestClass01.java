package ex02;

public class TestClass01 {
	public int num = 12345;

	public void test() {
		// this: 메소드 안에서만 사용 가능 
		// (클래스에서 만든 변수 의미)
		int num = 1000;
		System.out.println("this num : " + this.num); // 12345
		
		// 내부에서 먼저, 값이 없으면 외부
		System.out.println("num: " + num); // 1000
	}
}
