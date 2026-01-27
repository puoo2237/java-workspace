package ex02;

public class MainClass02 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30 };
		try {
			for (int i = 0; i < 3; i++) {
				System.out.println(arr[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		System.out.println("다음 문장들 실행");
	}
}
