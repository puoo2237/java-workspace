package quiz;

import java.util.List;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		// while, switch 회원가입, 검색, 수정 ,삭제, 모든 목록 출력
		// service에서 받아온 값을 화면에 표현
		// service의 예외를 받아주는 try, catch도 진행
		MemberService ms = new MemberService();
		Scanner input = new Scanner(System.in);
		String username, password, name;
		while (true) {
			System.out.print("1.회원가입 2.검색 3.수정 4.삭제 5.모든 목록 출력\n>>> ");
			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("username을 입력해주세요.");
				username = input.next();
				System.out.println("비밀번호를 입력해주세요.");
				password = input.next();
				System.out.println("이름을 입력해주세요.");
				name = input.next();
				ms.addMem(username, password, name);
				break;
			case 2:
				System.out.println("username을 입력해주세요.");
				username = input.next();
				MemberDto user = ms.getMem(username);
				System.out.println(user);
				break;
			case 3:
				System.out.println("username을 입력해주세요.");
				username = input.next();
				boolean resGet = ms.existMem(username);
				if (resGet) {
					System.out.println("수정할 비밀번호를 입력해주세요.");
					password = input.next();
					System.out.println("수정할 이름을 입력해주세요.");
					name = input.next();
					ms.modMem(username, password, name);
				}
				break;
			case 4:
				System.out.println("삭제할 username을 입력해주세요.");
				username = input.next();
				ms.delMem(username);
				break;
			case 5:
				ms.getList();
				break;
			}
		}
	}
}
