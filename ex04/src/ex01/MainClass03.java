package ex01;

class TestClass03 {
	// 메모리 공간에 미리 올려두기 때문에
	// 객체 생성 없이 클래스 이름으로 바로 접근 가능
	// (프로그램이 종료될 때 삭제)
	public final static String MSG2 = "final"; 
	public static String MSG = "클래스 변수(static)"; 
	public String str = "인스턴스 변수";

	public static void staticFunc() {
		System.out.println("static 메소드");
	}

	public void func() {
		System.out.println("func 메소드");
	}
}

public class MainClass03 {
	public static void main(String[] args) {

		System.out.println(TestClass03.MSG);
		TestClass03.MSG = "다른 내용으로 변경";
		System.out.println(TestClass03.MSG); // 내용 수정이 가능
		
		System.out.println(TestClass03.MSG2); // 내용 수정이 불가능
		
		TestClass03.staticFunc();

		TestClass03 t = new TestClass03();
		System.out.println(t.str);
		t.func();
	}
}
