package ex03;


// final이 붙으면 상속이 불가능함(오버라이딩 불가) => new 연산 이용
class Car02 {
	private int ye;

	public Car02(int ye) {
		this.ye = ye;
	}

	public int getYe() {
		return ye;
	}

	public void speed() {
		System.out.println(ye + "년식 자동차 속도: 300km");
	}
}
class NewCar02 extends Car02{
	public NewCar02(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드 실행");
	}
	// 부모가 가지고 있는 틀은 똑같이 쓰나 내용만 바뀐다고 보면 됨 => 업데이트
	@Override
	public void speed() {
		System.out.println(getYe() + "년식 자동차 속도: 400km");
	}
}

public class MainClass02 {
	public static void main(String[] args) {
		Car02 car = new Car02(2026);
		car.speed();
		
		NewCar02 newCar = new NewCar02(2027);
		newCar.speed();
		newCar.autoSystem();

	}
}
