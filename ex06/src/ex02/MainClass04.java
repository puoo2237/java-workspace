package ex02;

class AAA {
}

class BBB extends AAA {
	public void test(Object num) {
		System.out.println("test: " + num);
	}
}

// 업캐스팅: 자식으로 만들고 부모로 생성
// 예시: AAA a = new BBB()
// Object는 모든 것들의 최상위이므로 모든 타입을 다 받을 수 있음
public class MainClass04 {
	public static void main(String[] args) {
		BBB b = new BBB();
		AAA a = new BBB();
		b.test(100);
		b.test("1000");

		Object obj = 1.111;
		System.out.println(obj);

		int[] arr = { 10, 20, 30 };
		int x = 10, y = 0, result = 0;
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(arr[i]);
			}
			result = x / y;
			System.out.println("result: " + result);
			return;
		} catch (RuntimeException e) { // 프로그램 실행 중 발생하는 문제
			System.out.println(e);
			System.out.println(e.getMessage());
		} finally {
			System.out.println("무조건 실행되는 코드");
		}
		System.out.println("다음 문장 실행");
	}
}
