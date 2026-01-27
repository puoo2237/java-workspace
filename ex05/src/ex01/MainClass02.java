package ex01;

import member.Member;

public class MainClass02 {
	public static void main(String[] args) {
		TestClass02 t01 = new TestClass02();
		t01.test1();
		t01.test2();
		
		AAA aaa = new AAA();
		System.out.println(aaa.num);
		Member member = new Member();
		member.addr = "산골짜기";
		System.out.println(member.addr);
	}
}
