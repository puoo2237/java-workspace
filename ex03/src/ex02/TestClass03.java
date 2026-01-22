package ex02;

import java.util.Scanner;

public class TestClass03 {
	// 메소드: 함수가 class 안에서 작동하는 것
	
	public void test() {
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		num = input.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + "합 : " + sum);
	}
}
