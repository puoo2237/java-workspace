package ex02;

import java.util.ArrayList;

public class TestClass04 {

	public void sumFunc(int num) {
		System.out.println("sumFunc");
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + " 합 : " + sum);
	}

	public int sumFunc1(int num) {
		System.out.println("sumFunc1");
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("1~" + num + " 합 : " + sum);
		return sum;
	}

	public String[] test() {
		String[] arr = {"11", "222", "33"};
		return arr;
	}

	public String test01() {
		return "리턴";
	}

	public double test02() {
		return 1.111;
	}

	public int[] test03() {
		int[] arr = {};
		return arr;
	}

	public ArrayList<String> test04() {
		ArrayList arr = new ArrayList<String>();
		return arr;
	}

}
