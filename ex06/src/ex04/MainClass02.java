package ex04;

class AA01 {
	public void attack() {
		System.out.println("지상군이 공격합니다.");
	}

	public void defense() {
		System.out.println("지상군이 방어합니다.");
	}

}

class BB01 {
	public void attack() {
		System.out.println("비행기가 공격합니다.");
	}

	public void defense() {
		System.out.println("비행기가 방어합니다.");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		AA01 a01 = new AA01();
		BB01 b01 = new BB01();
		a01.attack();
		b01.defense();
	}
}
