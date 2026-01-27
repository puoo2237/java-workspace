package ex02;

public class MainClass03 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		int x = 10, y = 0, result = 0;
		try {
			for (int i = 0; i < 333; i++) {
				System.out.println(arr[i]);
			}
			result = x / y;
			System.out.println("result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 벗어남");
		}
		System.out.println("다음 문장 실행");
	}
}
