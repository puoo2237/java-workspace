package ex02;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String saveId = null, savePwd = null, inputId = null, inputPwd = null;
		int num = 0;
		// 로그인 시: 인증 성공, 인증 실패, 회원가입 먼저
		// 회원가입 시: 가입 성공, 이미 가입
		Scanner input = new Scanner(System.in);
		while (num < 3) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 나가기");
			System.out.println(">>>");

			num = input.nextInt();
			if (num == 3) {
				System.out.println("나가기");
				break;
			} else if (saveId == null && num != 2) {
				System.out.println("회원 가입을 먼저 하세요.");
			} else {
				switch (num) {
				case 1: {
					System.out.println("아이디를 입력하세요.");
					inputId = input.next();
					System.out.println("비밀번호를 입력하세요.");
					inputPwd = input.next();
					boolean res1 = inputId.equals(saveId);
					boolean res2 = inputPwd.equals(savePwd);
					if (res1 && res2) {
						System.out.println("인증에 성공하였습니다.");
					} else {
						System.out.println("인증에 실패하였습니다.");
					}
					break;
				}
				case 2: {
					if (saveId != null) {
						System.out.println("이미 가입된 회원입니다.");
					} else {
						System.out.println("가입할 아이디를 입력하세요.");
						saveId = input.next();
						System.out.println("가입할 비밀번호를 입력하세요.");
						savePwd = input.next();
						break;
					}
				}
				case 3:
					System.out.println("나가기");
					break;
				}

			}
		}

	}

}
