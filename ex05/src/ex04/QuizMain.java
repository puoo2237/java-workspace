package ex04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {

		QuizService sv = new QuizService();
		Scanner input = new Scanner(System.in);

		String name, stNum;
		int num, age;
		QuizDto dto;

		while (true) {
			System.out.print("1. 사용자 저장 2. 사용자 검색 3. 사용자 삭제 4. 사용자 정보 수정 5. 사용자 목록 출력 \n>>>");
			num = input.nextInt();

			switch (num) {
			case 1:
				// 사용자의 정보 입력 후 service 전달
				// - 서비스에서는 저장만
				System.out.println("사용자의 학번을 입력해주세요.");
				stNum = input.next();
				if (sv.getIdx(stNum) >= 0) {
					System.out.println("이미 존재하는 학번입니다.");
				} else {
					System.out.println("사용자명을 입력해주세요.");
					name = input.next();
					System.out.println("사용자의 나이를 입력해주세요.");
					age = input.nextInt();
					dto = sv.setMem(name, name, age);
					sv.addMemList(dto);
				}
				break;
			case 2:
				// 검색할 stNum 입력 후 service 전달
				// - 서비스에서 검색 후 return dto
				// 메인에서 return 값 받아서 출력
				// - 존재하는 학생 정보 또는 없음
				System.out.println("검색할 사용자의 학번을 입력해주세요.");
				stNum = input.next();
				dto = sv.getMem(stNum);
				if (dto != null) {
					System.out.println("학번: " + dto.getStNum());
					System.out.println("이름: " + dto.getName());
					System.out.println("나이: " + dto.getAge());
				} else {
					System.out.println("존재하는 학생 정보 없음");
				}
				break;
			case 3:
				// stNum 입력 후 service 전달 및 삭제
				// - return 성공, 실패
				System.out.println("삭제할 사용자의 학번을 입력해주세요.");
				stNum = input.next();

				boolean removeRes = sv.removeMem(stNum);
				if (removeRes) {
					System.out.println("삭제 완료");
				} else {
					System.out.println("해당 학번이 존재하지 않음");
				}
				break;
			case 4:
				// 수정할 대상 stNum값 및 이름, 나이 입력 후 service 전달
				// 서비스에서 set(index, dto) 특정 위치의 값 변경
				System.out.println("수정할 사용자의 학번을 입력해주세요.");
				stNum = input.next();
				System.out.println(stNum + "의 수정할 사용자명을 입력해주세요.");
				name = input.next();
				System.out.println(stNum + "의 수정할 사용자의 나이를 입력해주세요.");
				age = input.nextInt();
				boolean modifyRes = sv.modifyMem(stNum, name, age);
				if (modifyRes) {
					System.out.println("수정 완료");
				} else {
					System.out.println("해당 학번이 존재하지 않음");
				}
				break;
			case 5:
				// 서비스에서 return으로 list를 받은 후 메인에서 출력
				ArrayList<QuizDto> mems = sv.listMem();
				Iterator<QuizDto> it = mems.iterator();
				if (it.hasNext()) {
					for (QuizDto mem : mems) {
						System.out.println("==========================");
						System.out.println("학번: " + mem.getStNum());
						System.out.println("이름: " + mem.getName());
						System.out.println("나이: " + mem.getAge());
					}
				} else {
					System.out.println("사용자 정보 없음");
				}

				break;
			}
		}
	}
}
