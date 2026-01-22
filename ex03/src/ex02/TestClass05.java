package ex02;

import java.util.ArrayList;
import java.util.Iterator;

public class TestClass05 {
	// 1. 이름을 입력받아 출력하는 프로그램
	public void getName(String n) {
		System.out.println(n);
	}

	// 2. 3개의 이름을 입력받아 출력(배열 활용; 입출력; main 기능)
	public void getNames(String s1, String s2, String s3) {
		String[] name = {s1, s2, s3};
		for (String s : name) {
			this.getName(s);
		}
	}

	// 3. 두 수의 합을 입, 출, 연산, main 기능으로 만들기
	public int intSum(int n1, int n2) {
		return n1 + n2;
	}

	// 3. 두 수의 합을 입, 출, 연산, 메인 기능으로 만들기
	// 4. 3번의 내용을 ArrayList로 만들기
	public int arrSum(ArrayList<Integer> num) {
		int sum = 0;
		Iterator<Integer> it = num.iterator();
		for (; it.hasNext();) {
			sum += it.next();
		}
		return sum;
	}

	// 3. 두 수의 합을 입, 출, 연산, 메인 기능으로 만들기
	// 5. 3번의 내용을 Map을 각 기능별로 만들기
	public int mapSum() {

		return 0;
	}
}
