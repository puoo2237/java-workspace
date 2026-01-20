package ex03;

import java.util.Scanner;

public class TestClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner input = new Scanner(System.in);
//		int num;
//		System.out.print("수 입력");
//		num = input.nextInt();
//		if (num % 2 == 0) {
//			System.out.println("짝수: " + num);
//		}
//		System.out.println("다음 문장들 실행...");

		int n = 12;
		if (n % 3 == 0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("배수 아님");
		}
		System.out.println("다음 문장들 실행");

			
		int num = 110;
		if (num > 100) {
			System.out.println("100보다 큰 값");
		} else if (num > 80) {
			System.out.println("80보다 큰 값");
		} else {
			System.out.println("그 외의 값");
		}

	}

}
