package ex04;

import java.util.Scanner;

public class LoginService02 {
	private String inputId, inputPwd, userId, userPwd;
	LoginDto02 dto;
	Scanner input;

	public LoginService02() {
		dto = new LoginDto02();
		input = new Scanner(System.in);
	}

	public boolean checkMember() {
		userId = dto.getUsername();
		return userId == null ? false : true;
	}

	public int login(String inputId, String inputPwd) {
		userId = dto.getUsername();
		userPwd = dto.getPassword();

		if (inputId.equals(userId)) {
			if (inputPwd.equals(userPwd)) {
				// 로그인 성공
				return 0;
			} else {
				// 비밀번호가 틀렸습니다.
				return 1;
			}
		} else {
			// 존재하지 않는 id 입니다.
			return -1;
		}
	}

	public void removeMember() {
		dto.setUsername(null);
		dto.setPassword(null);
	}

	public void registerMember() {
		System.out.println("아이디를 입력해주세요.");
		inputId = input.next();
		System.out.println("비밀번호를 입력해주세요.");
		inputPwd = input.next();

		dto.setUsername(inputId);
		dto.setPassword(inputPwd);
	}

	public void display() {
		boolean run = true;
		while (run) {

			System.out.print("1. 로그인 2. 회원가입 3.탈퇴 4.종료\n>>> ");
			int num = input.nextInt();
			switch (num) {
			case 1:
				// 1. 로그인
				// - 저장되어 있는 값이 없으면 회원가입을 먼저 하세요.
				// - 아이디가 틀리면 존재하지 않는 id 입니다.
				// - 비밀번호가 틀리면 비밀번호가 틀렸습니다.
				// - id, pwd가 일치하면 인증 통과
				if (checkMember()) {
					System.out.println("아이디를 입력해주세요.");
					inputId = input.next();
					System.out.println("비밀번호를 입력해주세요.");
					inputPwd = input.next();

					int resLogin = login(inputId, inputPwd);
					switch (resLogin) {
					case 0:
						System.out.println("로그인 되었습니다.");
						break;
					case 1:
						System.out.println("비밀번호가 틀렸습니다.");
						break;
					case -1:
						System.out.println("존재하지 않는 id 입니다.");
						break;
					}
				} else {
					System.out.println("회원가입을 먼저 하세요.");
				}
				break;
			case 2:
				// 2. 회원가입
				// - 등록된 값이 없으면 id, pwd 등록
				// - 등록된 값이 있으면 사용자가 존재합니다. 탈퇴 후에 진행하세요.
				userId = dto.getUsername();
				if (userId == null) {
					registerMember();
					System.out.println("회원가입이 완료되었습니다.");
				} else {
					System.out.println("사용자가 존재합니다. 탈퇴 후에 진행하세요.");
				}
				break;
			case 3:
				// 3. 탈퇴
				// - 등록된 값이 없으면 회원가입 먼저 진행하세요.
				// - 등록된 값이 있으면 id, pwd는 null 초기화
				userId = dto.getUsername();
				if (userId == null) {
					System.out.println("회원가입 먼저 진행하세요.");
				} else {
					removeMember();
				}
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("1~4번까지 눌러주세요.");
				break;
			}
		}

	}
}
