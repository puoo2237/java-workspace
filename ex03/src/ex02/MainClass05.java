package ex02;

import java.util.ArrayList;

public class MainClass05 {
	 public static void main(String[] args) {
		TestClass05 t01 = new TestClass05();
		
		System.out.println("======= 1번 =======");
		t01.getName("홍길동");
		
		System.out.println("======= 2번 =======");
		t01.getNames("홍가", "김가", "최가");
		
		System.out.println("======= 3번 =======");
		int n1 = 24;
		int n2 = 25;
		int res3 = t01.intSum(n1, n2);
		System.out.println(res3);
		
		System.out.println("======= 4번 =======");
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(n1);
		num.add(n2);
		int res4 = t01.arrSum(num);  
		System.out.println(res4);
	}
}
