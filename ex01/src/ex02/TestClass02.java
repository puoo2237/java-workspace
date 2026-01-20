package ex02;

import java.util.Scanner;

public class TestClass02 {

	public static void main(String[] args) {
		int k = 0, e = 0, m = 0;
		int sum;
		sum = k + e + m;
		System.out.println("합:" + sum);

		char ch = 0;
		double dou = 0;
		String str = null;
		
	}

	public static void test(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

//		int num;
//		String name;
		System.out.print("이름 입력 : ");
		String name = input.next();

		System.out.print("수 입력 : ");
		int num = input.nextInt();

		System.out.println("이름 : " + name);
		System.out.println("수 : " + num);
	}

}
