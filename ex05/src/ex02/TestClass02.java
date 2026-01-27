package ex02;

import java.util.ArrayList;

// 기존에 있던 기능을 상속하여 바로 사용할 수 있음
public class TestClass02 extends ArrayList<String> {
	public void test() {
		System.out.println("test 실행");
	}
}
