package ex04;

import java.util.ArrayList;

class Test01<E> {
	public E test(E n1, E n2) {
		System.out.println(n1);
		System.out.println(n2);
		return n1;
	}
}

class Dto {
	private String name;
}

public class MainClass01 {
	public static void main(String[] args) {
		Test01<Integer> t01 = new Test01<>();
		int re01 = t01.test(100, 200);
		System.out.println("int return: " + re01);

		Test01<String> t02 = new Test01<>();
		t02.test("홍길동", "김개떡");

		Test01<Dto> t03 = new Test01<>();
		Dto d01 = new Dto();
		Dto d02 = new Dto();
		t03.test(d01, d02);
		
		Integer num = 100; // class타입의 integer
		int num2 = 200;
		System.out.println(num);

		ArrayList<Integer> arr;
		
//		기본형(primitive)와 래퍼(wrapper)
//		참 또는 거짓
//		- boolean => Boolean
//		정수 표현: 2bytes, 4bytes, 8bytes
//		- short => Short
//		- int => Integer
//		- long => Long
//		실수 표현: 4bytes, 8bytes
//		- float => Float
//		- double => Double
//		문자 표현: 1byte, 2bytes
//		- byte => Byte
//		- char => Character


	}
}
