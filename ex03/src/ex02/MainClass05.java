package ex02;

import java.util.ArrayList;
import java.util.HashMap;

public class MainClass05 {
	 public static void main(String[] args) {
		TestClass05 t01 = new TestClass05();
		
		System.out.println("======= 1번 =======");
		String name = "홍길동";
		t01.printName(name);
		
		System.out.println("======= 2번 =======");
		String[] names = {"홍길동", "김강우", "최가네"};
		t01.printNames(names);
		
		System.out.println("======= 3번 =======");
		int n1 = 24;
		int n2 = 25;
		t01.printSum(t01.intSum(n1, n2));
		
		System.out.println("======= 4번 =======");
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(n1);
		num.add(n2);
		t01.printSum(t01.arrSum(num));
		
		System.out.println("======= 5번 =======");
		HashMap<String, Integer> n = new HashMap<String, Integer>();
		n.put("num1", n1);
		n.put("num2", n2);
		t01.printSum(t01.mapSum(n));
	}
}
