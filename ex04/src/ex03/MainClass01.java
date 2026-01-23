package ex03;

class Test01 {
	private String officeName;

	public Test01() {
		System.out.println("기본 생성자 실행");
	}

	public Test01(String officeName) {
		System.out.println(officeName + " 생성자 실행");
		this.officeName = officeName;
	}
	
	public String getOfficeName() {
		return this.officeName;
	}
	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}
	
}

public class MainClass01 {
	public static void main(String[] args) {
		// 생성자
		// 클래스명과 동일하게 설정해야 하며 
		// 반환 타입이 없음
		// 변수 초기화 목적
		Test01 t01 = new Test01();
		String office = "내 회사";
		t01.setOfficeName(office);
		System.out.println(t01.getOfficeName());

		office = "회사 이직";
		Test01 t02 = new Test01(office);
		System.out.println(t02.getOfficeName());
	}
}
