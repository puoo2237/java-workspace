package ex03;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

//		// 1.
//		// 1-1. 입력한 데이터가 3의 배수인 경우
//		System.out.println("1-1. 입력한 데이터가 3의 배수인 경우");
//		int num = input.nextInt();
//		System.out.println(num % 3 == 0 ? "입력한 데이터가 3의 배수입니다." : "\"입력한 데이터가 3의 배수가 아닙니다.\"");
//
//		// 1-2. 입력한 수의 절대값을 구하는 프로그램
//		System.out.println("1-2. 입력한 수의 절대값을 구하는 프로그램");
//		num = input.nextInt();
//		System.out.println(num >= 0 ? num : -num);
//
//		// 1-3. 두 수를 입력 받아 큰 수를 출력
//		System.out.println("1-3. 두 수를 입력 받아 큰 수를 출력");
//		int num1 = input.nextInt();
//		int num2 = input.nextInt();
//		if (num1 > num2) {
//			System.out.println(num1);
//		} else {
//			if (num2 > num1) {
//				System.out.println(num2);
//			}
//		}
//
//		// 1-4. 세 수를 입력 받아 큰 수를 출력
//		System.out.println("1-4. 세 수를 입력 받아 큰 수를 출력");
//		int n1 = input.nextInt();
//		int n2 = input.nextInt();
//		int n3 = input.nextInt();
//		if (n1 > n2) {
//			if (n1 > n3) {
//				System.out.println(n1);
//			} else if (n3 > n1) {
//				System.out.println(n3);
//			}
//		} else {
//			if (n2 > n3) {
//				System.out.println(n2);
//			} else if (n3 > n2) {
//				System.out.println(n3);
//			}
//		}
//
//		// 1-5. 두 수를 입력 받아 큰 수가 짝수이면 출력
//		System.out.println("1-5. 두 수를 입력 받아 큰 수가 짝수이면 출력");
//		num1 = input.nextInt();
//		num2 = input.nextInt();
//		if (num1 > num2) {
//			if (num2 % 2 == 0) {
//				System.out.println(num1 + "은 짝수입니다.");
//			}
//		} else if (num2 > num1) {
//			if (num2 % 2 == 0) {
//				System.out.println(num2 + "은 짝수입니다.");
//			}
//		}
//
//		// 1-6. 두 수를 입력 받아 합이 짝수이고 3의 배수인 수 출력
//		System.out.println("1-6. 두 수를 입력 받아 합이 짝수이고 3의 배수인 수 출력");
//		num1 = input.nextInt();
//		num2 = input.nextInt();
//		if ((num1 + num2) % 2 == 0) {
//			if (num1 % 3 == 0 ) {
//				System.out.println(num1 + "는 3의 배수");
//			}
//		} else {
//			if (num2 % 3 == 0) {
//				System.out.println(num2 + "는 3의 배수");
//			}
//		}
//
//		// 2.
//		// 2-1. 수를 입력 받아 5의 배수인지 아닌지 구분
//		System.out.println("2-1. 수를 입력 받아 5의 배수인지 아닌지 구분");
//		int num = input.nextInt();
//		System.out.println(num % 5 == 0 ? "5의 배수" : "5의 배수가 아님");
//
//		// 2-2. 수를 입력 받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력
//		System.out.println("2-2. 수를 입력 받아 0보다 크고 100보다 작으면 정상, 아니면 비정상으로 출력");
//		num = input.nextInt();
//		System.out.println((num > 0) && (num < 100) ? "정상" : "비정상");
//
//		// 2-3. 수를 입력 받아 짝수이면서 3의 배수이면 출력
//		System.out.println("2-3. 수를 입력 받아 짝수이면서 3의 배수이면 출력");
//		num = input.nextInt();
//		if (num % 6 == 0) {
//			System.out.println(num + "은 짝수이면서 3의 배수");
//		}
//
//		// 2-4. 세 수를 입력 받아 가장 큰 수, 두 번째 큰 수, 마지막 수 출력
//		System.out.println("2-4. 세 수를 입력 받아 가장 큰 수, 두 번째 큰 수, 마지막 수 출력");
//		int n1 = input.nextInt();
//		int n2 = input.nextInt();
//		int n3 = input.nextInt();
//		if (n1 > n2) {
//			if (n1 > n3) {
//				if (n3 > n2) {
//					System.out.println(n1 + " > " + n3 + " > " + n2);
//				} else if (n2 > n3) {
//					System.out.println(n1 + " > " + n2 + " > " + n3);
//				}
//			} else if (n3 > n1) {
//				System.out.println(n3 + " > " + n1 + " > " + n2);
//			}
//		} else if (n2 > n1) {
//			if (n2 > n3) {
//				if (n3 > n1) {
//					System.out.println(n2 + " > " + n3 + " > " + n1);
//				} else if (n1 > n3) {
//					System.out.println(n2 + " > " + n1 + " > " + n3);
//				}
//			} else if (n3 > n2) {
//				System.out.println(n3 + " > " + n2 + " > " + n1);
//			}
//		}
//
//		// 3.
//		// 3-1. 커피의 개당 가격은 2000원.
//		// 10개 초과하면 초과하는 양에 대해서만 개당 1500원씩.
//		// 커피의 개수를 입력 받아 금액 출력
//		System.out.println("커피의 개수를 입력해주세요.");
//		int num = input.nextInt();
//		System.out.println(num > 10 ? (num * 2000 * 10 + (num - 10) * 1500) + "원입니다.": num * 2000 + "원입니다.");
//
//		// 3-2. 정수를 입력 받아 아래와 같이 출력
//		// 1) 3의 배수이면서, 4의 배수에 해당
//		// 2) 3의 배수에만 해당
//		// 3) 4의 배수에만 해당
//		// 4) 3의 배수도 4의 배수도 해당 안됨
//		// 5) 0은 잘못 입력
//		System.out.println("1 이상의 수를 입력해주세요.");
//		int num = input.nextInt();
//		if (num == 0) {
//			System.out.println("잘못 입력하셨습니다. 1 이상의 수를 입력해주세요.");
//		} else if ((num % 3 == 0) && (num % 4 == 0)) {
//			System.out.println(num + "은 3의 배수이면서, 4의 배수");
//		} else if ((num % 3 != 0) && (num % 4 == 0)) {
//			System.out.println(num + "은 4의 배수에만 해당");
//		} else if ((num % 3 == 0) && (num % 4 != 0)) {
//			System.out.println(num + "은 3의 배수에만 해당");
//		}

		// 4.
		// 4-1. usb 1개에 5000원.
		// 한번에 10개 이상을 사면 전체 금액의 10% 할인.
		// 100개 이상을 사면 전체 금액의 12% 할인.
		// X개의 usb를 사려면 얼마가 있어야 하는가?
		System.out.println("4-1. 몇 개의 usb를 구입하시겠나요?");
		int num = input.nextInt();
		if(num >= 100) {
			System.out.println("12% 할인율이 적용되어, 총 가격은 " + num*5000*(1-0.12) + "원입니다.");
		}else if(num >= 10) {
			System.out.println("10% 할인율이 적용되어, 총 가격은 " + num*5000*(1-0.10) + "원입니다.");
		}else {
			System.out.println("총 가격은 " + num*5000 + "원입니다.");
		}

		// 4-2. 국, 영, 수 점수를 입력 받아 평균이 60점 이상이고 각 점수가 40점 이상이면 합격
		// 아니면 평균 불합격인지, 과목 불합격인지 사유 출력
		// 평균이 90이상이면 'A', 80이상이면 'B'. 70이상이면 'C', 60이상이면 'D', 60미만이면 'F'
		System.out.println("4-2. 국, 영, 수 평가");
		System.out.println("국어 점수를 입력하세요.");
		int kor = input.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = input.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int mat = input.nextInt();
		
		double avg = (kor + eng + mat) / 3.0;
		String avg_res = (avg >= 60) ? "평균 합격" : "평균 불합격";
		String sub_res = (kor >= 40) && (eng >= 40) && (mat >= 40) ? "과목 합격" : "과목 불합격";
		
		System.out.println("======================");
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("평균: " + avg);
		System.out.println("----------------------");
		System.out.println(avg_res + ", " + sub_res);
		if (avg >= 90) {
			System.out.println("등급: A");
		} else if (avg >= 80) {
			System.out.println("등급: B");
		} else if (avg >= 70) {
			System.out.println("등급: C");
		} else if (avg >= 60) {
			System.out.println("등급: D");
		} else {
			System.out.println("등급: F");
		}
		System.out.println("======================");
		
		// 4-3. 비행기를 타는데 30분 거리까지의 기본 요금은 30000원
		// 10분 단위로 추가요금 5000원씩 부가
		// 비행기 탈 시간(분 단위)을 입력하여 요금 계산기 생성
		System.out.println("4-3. 비행기 이동 시간을 입력하세요.");
		int mins = input.nextInt();
		System.out.println(mins > 30 ? (mins - 30) / 10 * 5000 + 30000 + "원입니다." : 30000 + "원입니다.");

	}
}
