package ex02;

public class TestClass02 {
	// 정보 은닉: private 
	private int num = 1234; // 내부에서만 접근

	// setter : set + 변수 이름
	// getter : get + 변수 이름
	public void setNum(int n) {
		num = n;
	}
	
	public int getNum() {
		return num;
	}
}
