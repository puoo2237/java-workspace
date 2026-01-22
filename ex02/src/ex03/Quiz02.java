package ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		// 연락처 저장 프로그램 만들기
		// 1. ArrayList 이용 (이름 정보, 연락처 정보)
		// 2. 연락처 등록
		// - 이름, 연락처 (중복 허용 안됨)
		// 3. 이름 검색
		// - 등록되어 있지 않으면 목록에 없습니다.
		// 4. 연락처 삭제
		// - 목록에 없으면 목록에 없습니다.
		// 5. 모든 연락처 보기
		// - 등록되어 있는 목록 전부 출력

		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> phone = new ArrayList<String>();

		Scanner input = new Scanner(System.in);

		boolean start = true;
		while (start) {
			System.out.println("1. 연락처 등록");
			System.out.println("2. 이름 검색");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.println(">>> ");

			int num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("이름을 입력해주세요.");
				String inputName = input.next();
				System.out.println("연락처를 입력해주세요.");
				String inputNumber = input.next();
				if (name.contains(inputName)) {
					System.out.println("중복된 정보입니다.");
				} else {
					name.add(inputName);
					phone.add(inputNumber);
					System.out.println("등록이 완료되었습니다.");
				}
				break;
			case 2:
				System.out.println("검색할 이름을 입력해주세요.");
				int nameIdx = name.indexOf(input.next());
				if (nameIdx == -1) {
					System.out.println("목록에 없습니다.");
				} else {
					System.out.println("이름: " + name.get(nameIdx));
					System.out.println("연락처: " + phone.get(nameIdx));
				}
				break;
			case 3:
				System.out.println("삭제할 이름을 입력해주세요.");
				int removeNameIdx = name.indexOf(input.next());
				if (removeNameIdx == -1) {
					System.out.println("목록에 없습니다.");
				} else {
					System.out.println("이름: " + name.get(removeNameIdx));
					System.out.println("연락처: " + phone.get(removeNameIdx));
					System.out.println(">>>> 목록에서 삭제하였습니다.");
					name.remove(removeNameIdx);
					phone.remove(removeNameIdx);
				}
				break;
			case 4:
				int total = name.size();
				System.out.println("총 " + total + "개");
				for (int i = 0; i < total; i++) {
					System.out.println("---------------------------------------");
					System.out.println("이름: " + name.get(i));
					System.out.println("연락처: " + phone.get(i));
				}
				System.out.println("---------------------------------------");
				break;
			case 5:
				start = false;
				break;
			}

		}
	}
}
