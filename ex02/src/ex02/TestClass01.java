package ex02;

public class TestClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("다음 문장들 실행");
		int j = 1;
		for (; j <= 10; j++) {
			if (j % 2 == 0) {
				System.out.println("짝수: " + j);
			}
		}

		int k = 1;
		for (; k <= 10; ) {
			System.out.println(k);
			k++;
		}
	}
}
