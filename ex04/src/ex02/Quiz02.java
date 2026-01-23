package ex02;

import java.util.Scanner;

class QuizLogin {
	// 클래스 안에서 만드는 변수는 자동 초기화가 됨
	private String userId, userPwd;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public boolean login(String id, String pwd) {
		if (this.userId != null) {
			boolean idCheck = this.userId.equals(id);
			boolean pwdCheck = this.userPwd.equals(pwd);
			if (idCheck && pwdCheck) {
				return true;
			} else if (idCheck && !pwdCheck) {
//				System.out.println("비밀번호가 틀렸습니다.");
				return false;
			} else if (!idCheck && pwdCheck) {
//				System.out.println("아이디가 틀렸습니다.");
				return false;
			} else {
//				System.out.println("아이디와 비밀번호가 틀렸습니다.");
				return false;
			}
		} else {
//			System.out.println("등록된 회원이 없습니다.");
			return false;
		}

	}

	public boolean logout() {
//		System.out.println("로그아웃합니다.");
		return false;
	}
}

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = 0;
		String inputId = null, inputPwd = null;
		boolean bool = true;

		QuizLogin q = new QuizLogin();
		while (bool) {
			System.out.print("1. 로그인 2. 가입 3. 로그아웃(종료)\n>>>> ");
			num = input.nextInt();
			switch (num) {
			case 1:
				// 로그인 기능. 비교하는 기능은 QuizLogin 메소드 연산
				System.out.println("아이디를 입력하세요.");
				inputId = input.next();
				System.out.println("비밀번호를 입력하세요.");
				inputPwd = input.next();
				Boolean resLogin = q.login(inputId, inputPwd);
				System.out.println(resLogin ? "로그인에 성공하였습니다." : "로그인에 실패하였습니다.");

				break;
			case 2:
				// setter를 통해 QuizLogin에 저장
				System.out.println("아이디를 입력하세요.");
				inputId = input.next();
				System.out.println("비밀번호를 입력하세요.");
				inputPwd = input.next();
				q.setUserId(inputId);
				q.setUserPwd(inputPwd);
				break;
			case 3:
				// QuizLogin에서 로그아웃 기능을 만들고 bool을 false 처리
				bool = q.logout();
				break;

			}
		}
	}

}
