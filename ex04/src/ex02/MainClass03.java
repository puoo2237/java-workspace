package ex02;

import java.util.Scanner;

class TestClass03 {
	private String name;
	private int age;

	public String getName() {
		return name; 
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	
}

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name;
		int age;
		System.out.println("이름 입력");
		name = input.next();
		System.out.println("나이 입력");
		age = input.nextInt();

		TestClass03 t = new TestClass03();
		t.setName(name);
		System.out.println(t.getName()); 
		t.setAge(age);
		System.out.println(t.getAge()); 
		
	}
}
