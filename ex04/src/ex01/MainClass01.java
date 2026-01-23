package ex01;

public class MainClass01 {

	public static void main(String[] args) {
		// 지역변수
		int num = 100;
		int sum = 0;
		if (true) {
			int ifNum = 12345;
			sum = num + 100;
			System.out.println("ifNum: " + ifNum);
			System.out.println("if num: " + num);
			;
			num += 100;
		}
		if (true) {
			sum = sum - 100;
		}
		System.out.println("main num: " + num);
	}

}
