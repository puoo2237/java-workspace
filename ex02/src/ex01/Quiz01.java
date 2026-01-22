package ex01;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0, newNum = 0;
		String home = null, office = null;
		boolean check = true;
		for (;check;) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			num = input.nextInt();

			if ((newNum > 0) || (newNum == 0 && num == 1)) {
				if (num < newNum) {
					if (newNum <= 2) {
						System.out.println((newNum + 1) + "을 눌러주세요.");
					} else {
						System.out.println("등록이 완료되었으니 등록 보기를 눌러주세요.");
					}
				}else if((newNum+1) == num){
					newNum = num;
					switch (num) {
					case 1:
						System.out.println("우리집 주소를 입력해주세요.");
						home = input.next();
						System.out.println((num+1) + "번을 눌러주세요.");
						break;
					case 2:
						System.out.println("회사 주소를 입력해주세요.");
						office = input.next();
						System.out.println((num+1) + "번을 눌러주세요.");
						break;
					case 3:
						System.out.println("우리집 : " + home);
						System.out.println("회사 : " + office);
						check = false;
						break;
					}
				}
				else {
					System.out.println((newNum+1) + "을 눌러주세요.");
					
				}
			} else {
				newNum = 0;
				System.out.println("1번을 눌러주세요.");
			}

		}
	}

}
