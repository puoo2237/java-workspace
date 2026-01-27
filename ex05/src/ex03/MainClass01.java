package ex03;

import java.util.ArrayList;

class TestClass01 extends ArrayList<String> {
	// 오버라이딩: 부모가 원래 갖고 있는 기능이 아닌 새롭게 만든 기능을 실행
	@Override
	public boolean add(String e) {
		// TODO Auto-generated method stub
		e += "추가의 연산";
		System.out.println(e + ": 내가 만든 add 기능");
		return true;
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return "내가 만든 get 전달";
	}

}

public class MainClass01 {
	public static void main(String[] args) {
		TestClass01 t01 = new TestClass01();
		t01.add("111");
		System.out.println(t01.get(0));
	}
}
