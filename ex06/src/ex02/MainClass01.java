package ex02;

import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		// 예외처리
		Scanner input = new Scanner(System.in);
		int x, y, result = 0;
		System.out.println("수 입력");
		x = input.nextInt();
		y = input.nextInt();

		try {
			result = x / y;
			System.out.println("결과: " + result);
		} catch (ArithmeticException e) {
			System.out.println("0 입력 ㄴㄴ");
			System.out.println(e);
			System.out.println();
		}
		System.out.println("다음 문장들 실행...");
	}
}
