package ex04;

import java.util.HashMap;
import java.util.Scanner;

public class MemberService {
	private String name, userName;
	private int kor, eng, math;
	MemberDTO dto;
	Scanner input;

	public MemberService() {
		dto = new MemberDTO();
		input = new Scanner(System.in);
	}

	public void setInitial() {
		dto.setName(null);
		dto.setKor(0);
		dto.setEng(0);
		dto.setMath(0);
		dto.setSum(0);
		dto.setGrade(null);
	}

	public boolean checkMember() {
		userName = dto.getName();
		if (userName == null) {
			return false;
		} else {
			return true;
		}
	}

	public void updateInfo(int updateNum) {
		switch (updateNum) {
		case 1:
			// 1) 이름 수정
			System.out.println("이름을 입력해주세요.");
			name = input.next();
			dto.setName(name);
			break;
		case 2:
			// 2) 국어 점수 수정
			System.out.println("국어 점수를 입력해주세요.");
			kor = input.nextInt();
			dto.setKor(kor);
			break;
		case 3:
			// 3) 영어 점수 수정
			System.out.println("영어 점수를 입력해주세요.");
			eng = input.nextInt();
			dto.setEng(eng);
			break;
		case 4:
			// 4) 수학 점수 수정
			System.out.println("수학 점수를 입력해주세요.");
			math = input.nextInt();
			dto.setMath(math);
			break;
		default:
			System.out.println("1~4번까지 눌러주세요.");
			break;
		}
		dto.setMember();

	}
	
	public void registerMember() {
		// 1. 학생 등록 (한명만)
		// - 이름, 국어, 영어, 수학, 합계, 등급(A, B, C)
		System.out.println("이름을 입력해주세요.");
		name = input.next();
		dto.setName(name);
		
		System.out.println("국어 점수를 입력해주세요.");
		kor = input.nextInt();
		dto.setKor(kor);
		
		System.out.println("영어 점수를 입력해주세요.");
		eng = input.nextInt();
		dto.setEng(eng);
		
		System.out.println("수학 점수를 입력해주세요.");
		math = input.nextInt();
		dto.setMath(math);
		
		dto.setSum();
		dto.setGrade();
		dto.setMember();
	}
	
	public void printMember() {
		HashMap<String, String> member = dto.getMember();
		System.out.println("이름: " + member.get("name"));
		System.out.println("--------------------");
		System.out.println("국어: " + member.get("kor"));
		System.out.println("영어: " + member.get("eng"));
		System.out.println("수학: " + member.get("math"));
		System.out.println("--------------------");
		System.out.println("합계: " + member.get("sum") + ", 평균: " + member.get("avg"));
		System.out.println("--------------------");
		System.out.println("등급: " + member.get("grade"));
	}


	public void display() {
		boolean run = true;
		while (run) {
			System.out.print("1. 학생 등록 2. 학생 보기 3. 정보 수정 4. 회원 탈퇴 5. 나가기\n>>> ");
			int num = input.nextInt();
			switch (num) {
			case 1:
				if (checkMember()) {
					System.out.println("이미 학생 등록이 완료되었습니다.");
				} else {
					registerMember();
				}
				break;
			case 2:
				// 2. 학생 보기
				// - 저장되어 있는 모든 값 출력
				if (checkMember()) {
					printMember();
				} else {
					System.out.println("학생 등록을 해주세요.");
				}
				break;
			case 3:
				// 3. 정보 수정
				// * 이름 수정을 제외한 나머지 국어, 영어, 수학 점수 중 하나라도 수정이 되면
				// 합, 등급도 같이 수정이 되어야 함
				if (checkMember()) {
					System.out.print("1. 이름 수정 2. 국어 점수 수정 3. 영어 점수 수정 4. 수학 점수 수정\n>>> ");
					int updateNum = input.nextInt();
					updateInfo(updateNum);
				} else {
					System.out.println("학생 등록을 완료해주세요.");
				}
				break;
			case 4:
				// 4. 회원 탈퇴
				// - 모든 값을 null과 0으로 초기화
				if (checkMember()) {
					setInitial();
				} else {
					System.out.println("학생 등록을 완료해주세요.");
				}
				break;
			case 5:
				run = false;
				break;
			default:
				System.out.println("1~5번까지 눌러주세요.");
				break;
			}

		}
	}
}
