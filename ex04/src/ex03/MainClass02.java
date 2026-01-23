package ex03;

class Test02 {
	private String msg;
	
	// 생성자를 만들지 않으면, 아래 생성자가 기본으로 실행 
	public Test02() {
		
	}
	public Test02(String msg, int num) {
		System.out.println(msg);
		System.out.println(num);
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		Test02 t01 = new Test02("aaa", 1000);
		Test02 t02 = new Test02();

	}
}
