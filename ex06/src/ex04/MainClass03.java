package ex04;

class AAA01 implements Army {
	@Override
	public void attack() {
		System.out.println("지상군이 공격합니다.");
	}
	@Override
	public void defense() {
		System.out.println("지상군이 방어합니다.");
	}

}

class BBB01 implements Army {
	@Override
	public void attack() {
		System.out.println("비행기가 공격합니다.");
	}

	@Override
	public void defense() {
		System.out.println("비행기가 방어합니다.");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		Army a01 = new AAA01();
		Army b01 = new BBB01();
		a01.attack();
		b01.defense();
	}
}
