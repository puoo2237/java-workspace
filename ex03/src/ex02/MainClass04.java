package ex02;

import java.util.ArrayList;

public class MainClass04 {
	public static void main(String[] args) {

		TestClass04 t01 = new TestClass04();
		t01.sumFunc(20);
		int res = t01.sumFunc1(30);
		System.out.println(res);

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("문자열");
		t01.sumFunc(res);

		String[] n = t01.test();
		System.out.println(n);

		String n1 = t01.test01();
		System.out.println(n1);

		double n2 = t01.test02();
		System.out.println(n2);

		int[] n3 = t01.test03();
		System.out.println(n3);

		ArrayList<String> n4 = t01.test04();
		System.out.println(n4);
	}
}
