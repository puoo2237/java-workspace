package ex02;

class AAA01 {
	public void test01() throws InterruptedException {
		System.out.println("test11");
		test02(); 

	}

	// 예외 전가
	public void test02() throws InterruptedException {
		System.out.println("test22");
		Thread.sleep(1000);
		System.out.println("test22 종료");
	}
}

public class MainClass05 {
	public static void main(String[] args) throws InterruptedException {
		AAA01 a = new AAA01();
		a.test01();
	}
}
