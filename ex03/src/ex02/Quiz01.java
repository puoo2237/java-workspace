package ex02;

import java.util.Scanner;

class Cal {

	public int getInt() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}

	public double getDouble() {
		Scanner input = new Scanner(System.in);
		return input.nextDouble();
	}

	public int getMax(int n1, int n2) {
		if (n1 > n2) {
			return n1;
		} else if (n2 > n1) {
			return n2;
		} else {
			System.out.println("큰 값이 없습니다.");
			return n1;
		}
	}

	public boolean isOdd(int n) {
		return n % 2 == 0 ? true : false;
	}

	public boolean isProd3(int n) {
		return n % 3 == 0 ? true : false;
	}

	public boolean isPrime(int n) {
		int cnt = 0;
		for (int i = n; i > 1; i--) {
			if (n % i == 0) {
				cnt++;
			}
		}
		return cnt == 1 ? true : false;
	}

	public int getAbs(int n) {
		return n >= 0 ? n : -n;
	}

	public int getReverse(int n) {
		int newN = 0;
		while (n > 0) {
			newN = newN * 10 + (n % 10);
			n = n / 10;
		}
		return newN;
	}

	public void print(String s, int n) {
		System.out.println(s + n);
	}

	public void print(String s, Boolean b) {
		System.out.println(s + b);
	}

}

public class Quiz01 {
	public static void main(String[] args) {
		Cal cal = new Cal();

		System.out.println("--------------------");
		System.out.println("1. 두 수를 입력하여라");
		System.out.println("--------------------");
		int n11 = cal.getInt();
		int n12 = cal.getInt();
		int res1 = cal.getMax(n11, n12);
		cal.print("가장 큰 값은 ", res1);

		System.out.println("--------------------");
		System.out.println("2. 수를 입력하여라");
		System.out.println("--------------------");
		int n2 = cal.getInt();
		boolean res2 = cal.isOdd(n2);
		cal.print("짝수인가? ", res2);

		System.out.println("--------------------");
		System.out.println("3. 수를 입력하여라");
		System.out.println("--------------------");
		int n3 = cal.getInt();
		boolean res3 = cal.isProd3(n3);
		cal.print("3의 배수인가? ", res3);

		System.out.println("--------------------");
		System.out.println("4. 소수를 입력하여라");
		System.out.println("--------------------");
		int n4 = cal.getInt();
		boolean res4 = cal.isPrime(n4);
		cal.print("소수인가? ", res4);

		System.out.println("--------------------");
		System.out.println("5-1. 양수를 입력하여라");
		System.out.println("--------------------");
		int n51 = cal.getInt();
		int res51 = cal.getAbs(n51);
		cal.print("절대값은? ", res51);
		System.out.println("--------------------");
		System.out.println("5-2. 음수를 입력하여라");
		System.out.println("--------------------");
		int n52 = cal.getInt();
		int res52 = cal.getAbs(n52);
		cal.print("절대값은? ", res52);

		System.out.println("--------------------");
		System.out.println("6. 수를 입력하여라");
		System.out.println("--------------------");
		int n6 = cal.getInt();
		int res6 = cal.getReverse(n6);
		cal.print("다음 숫자의 자릿값을 리버스하여라: ", res6);
	}
}
