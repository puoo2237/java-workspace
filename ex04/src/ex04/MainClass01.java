package ex04;

import java.util.Scanner;

class MainClass01 {
	public static void main(String[] args) {
		// DTO (Data Transform Object)
		// setter, getter의 모임
		// Controller(App.js) Service(Container) Repository(DB 연동코드) DTO

		Scanner input = new Scanner(System.in);
		Service01 s01 = new Service01();
		Service001 s001 = new Service001();
		int num;
		while (true) {
			System.out.println("1. 학생관리 2. 급식관리");
			num = input.nextInt();
			switch (num) {
			case 1:
				s01.display();
				break;
			case 2:
				s001.display();
				break;
			}
		}
	}

}
