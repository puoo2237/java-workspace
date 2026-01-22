package ex03;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		// 배열 5개를 만들고 로그인 프로그램을 만드시오.
		// 1. 로그인 시
		// - 아이디가 없으면 존재하지 않는 아이디입니다.
		// - 비밀번호가 틀리면 비밀번호가 틀렸습니다.
		// - 아이디와 비밀번호가 일치하지 않습니다.
		// 2. 회원가입 시
		// - 동일한 아이디가 있으면 동일한 아이디가 존재합니다.
		// - 5개의 배열 모두 사용됐으면 더 이상 저장할 공간이 없습니다.
		// - 회원가입 성공시 가입을 축하합니다.
		// 3. 모든 회원 보기
		String[] id = new String[5];
		String[] pwd = new String[5];
		Scanner input = new Scanner(System.in);
		boolean check = true;
		for (int n = 0; check;) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원 보기");
			System.out.println("4. 종료");
			System.out.println(">>> : ");

			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("아이디를 입력해주세요.");
				String inputId = input.next();
				System.out.println("비밀번호를 입력해주세요.");
				String inputPwd = input.next();

				int idCheck = 0, pwdCheck = 0;
				for (int i = 0; i < id.length; i++) {

					if (!inputId.equals(id[i])) {
						idCheck++;
					}
					if (!inputPwd.equals(pwd[i])) {
						pwdCheck++;
					}

				}
				if ((idCheck + pwdCheck) == (id.length + pwd.length)) {
					System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
				} else if (idCheck == id.length) {
					System.out.println("존재하지 않는 아이디입니다.");
				} else if (pwdCheck == pwd.length) {
					System.out.println("비밀번호가 틀렸습니다.");
				} else {
					System.out.println("로그인에 성공하셨습니다.");
				}
				break;
			case 2:
				if (n == 5) {
					System.out.println("더 이상 저장할 공간이 없습니다.");
				} else {
					System.out.println("아이디를 입력해주세요.");
					String saveId = input.next();

					int memCheck = 0;
					for (String i : id) {
						if (saveId.equals(i)) {
							memCheck++;
						}
					}
					if (memCheck == 0) {
						id[n] = saveId;
						System.out.println("비밀번호를 입력해주세요.");
						String savePwd = input.next();
						pwd[n] = savePwd;
						n++;
						System.out.println("회원가입을 축하합니다.");
					} else {
						System.out.println("동일한 아이디가 존재합니다.");
					}
				}
				 
				break;
			case 3:
				int cnt = 0;
				for (int k = 0; k < id.length; k++) {
					if (id[k] != null) {
						cnt++;
						System.out.println(cnt + ". " + id[k]);
					}
				}
				if (cnt == 0) {
					System.out.println("회원이 없습니다.");
				}
				break;
			case 4:
				check = false;
				break;
			}

		}
	}
}
