package ex03;

public class TestClass01 {
	public static void main(String[] args) {
		// 산술 연산자
		System.out.println("=== 산술 연산자 ===");
		int n1 = 9, n2 = 2;
		System.out.println(n1 / n2);
		System.out.println((double) n2);
		System.out.println(n1 / (double) n2); // 정수 / 실수 => 실수
		System.out.println(n1 % n2); // 나머지 연산자

		// 복합 연산자
		System.out.println("=== 복합 연산자 ===");
		n1 = n2 = 5;
		n1 += 1;
		System.out.println(n1);
		n1 -= 1;
		System.out.println(n1);
		n1 *= n2;
		System.out.println(n1);
		n1 %= n2;
		System.out.println(n1);

		// 관계 연산자
		System.out.println("=== 관계 연산자 ===");
		n1 = 5;
		n2 = 4;
		System.out.println(n1 > n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);

		// 논리 연산자
		System.out.println("=== 논리 연산자 ===");
		int n3 = 10;
		n1 = 5;
		n2 = 7;

		System.out.println("--- AND ---");
		System.out.println(n1 > n2 && n1 > n3);
		System.out.println(n1 < n2 && n1 < n3);
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);

		System.out.println("--- OR ---");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);

		System.out.println("--- NOT ---");
		System.out.println(!true);
		System.out.println(!false);

		System.out.println("=== 증감 연산자 ===");
		n1 = 10;
		n2 = 20;
		System.out.println("변경 전 n1: " + n1);
		n1--;
		System.out.println("변경 후 n1: " + n1);

		System.out.println("변경 전 n2: " + n2);
		--n2;
		System.out.println("변경 후 n2: " + n2);

		n1 = n2 = 10;
		System.out.println("변경 전 n1 : " + n1);
		n3 = n1++ + 100 * 2;
		System.out.println("변경 후 n1 : " + n1);
		System.out.println("n3 : " + n3);

		System.out.println("변경 전 n2 : " + n2);
		n3 = ++n2 + 100 * 2;
		System.out.println("변경 후 n2 : " + n2);
		System.out.println("n3 : " + n3);

		System.out.println("=== 삼항 연산자 ===");
		n1 = 20;
		n2 = 10;
		String result = (n1 > n2) ? "n1이 n2보다 크다" : "거짓";
		System.out.println(result);
	}
}
