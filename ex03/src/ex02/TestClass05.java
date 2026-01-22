package ex02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestClass05 {
	// 1. 이름을 입력받아 출력하는 프로그램
	public void printName(String name) {
		System.out.println("이름: " + name);
	}

	// 2. 3개의 이름을 입력받아 출력(배열 활용; 입출력; main 기능)
	public void printNames(String[] names) {
		for (String name : names) {
			this.printName(name);
		}
	}

	// 3. 두 수의 합을 입, 출, 연산, main 기능으로 만들기
	public void printSum(int num) {
		System.out.println("두 수의 합은 " + num);
	}

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
	public int mapSum(HashMap<String, Integer> num) {
		int sum = 0;
		for (int v:num.values()) {
			sum += v;
		}
		return sum;
	}

}
