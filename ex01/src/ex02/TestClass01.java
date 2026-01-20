package ex02;

// int : 정수 표현 - 4bytes
// float, double : 실수 표현 - 4, 8bytes
// char : 문자 하나 표현 - 2bytes
// boolean : 참 거짓 표현 - 1byte
public class TestClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double body[] = { 100.0, 55.0, 170.3 };
		System.out.println("나의 무게: " + body[1] + "kg");
		System.out.println("나의 키: " + body[2] + "cm");
		System.out.println("변경: " + (body[0] + 100));

		char ch = 'a';
		int num = 5;
		int ret = ch + num;
		System.out.println("a + 5 = " + ret);
		System.out.println("a + 5 = " + (char) ret); // 아스키코드: f

		final int number = 200; // 상수화: 값 변경 불가능
		final String STR = "문자열";
		System.out.println("str : " + STR);
	}

}
