package ex02;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.print("당신의 이름은 무엇입니까? ");
		String name = input.next();
		System.out.print(name + " 님의 국어 점수: ");
		int kor = input.nextInt();
		System.out.print(name + " 님의 영어 점수: ");
		int eng = input.nextInt();
		System.out.print(name + " 님의 수학 점수: ");
		int mat = input.nextInt();

		System.out.println("===========");
		System.out.println("이 름 : " + name);
		System.out.println("===========");
		System.out.println("국 어 : " + kor);
		System.out.println("영 어 : " + eng);
		System.out.println("수 학 : " + mat);
		System.out.println("===========");
		System.out.println("합 계 : " + (kor + eng + mat));
		System.out.println("===========");
	}

}
