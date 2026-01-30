package quiz;

import java.util.List;
import java.util.Scanner;

import quiz.exception.MemberDuplicateException;
import quiz.exception.MemberNotFoundException;

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
				try {
					boolean checkEg = ms.existReg(username);
					if (!checkEg) {
						System.out.println("비밀번호를 입력해주세요.");
						password = input.next();
						System.out.println("이름을 입력해주세요.");
						name = input.next();
						ms.addMem(username, password, name);
					}
				} catch (MemberDuplicateException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 2:
				System.out.println("username을 입력해주세요.");
				username = input.next();
				try {
					MemberDto user = ms.getMem(username);
					System.out.println(user);
				} catch (MemberNotFoundException e) {
//					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("username을 입력해주세요.");
				username = input.next();
				try {
					boolean checkEg = ms.existMem(username);

					if (checkEg) {
						System.out.println("수정할 비밀번호를 입력해주세요.");
						password = input.next();
						System.out.println("이름을 입력해주세요.");
						name = input.next();
						ms.addMem(username, password, name);
						System.out.println("수정할 이름을 입력해주세요.");
						name = input.next();
						ms.modMem(username, password, name);
					}
				} catch (MemberNotFoundException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 4:
				System.out.println("삭제할 username을 입력해주세요.");
				username = input.next();
				try {
					ms.delMem(username);
				} catch (MemberNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				List<MemberDto> mems = ms.getList();
				for (MemberDto mem : mems) {
					System.out.println("------------------------------");
					System.out.println(mem);
				}
				break;
			}
		}
	}
}
