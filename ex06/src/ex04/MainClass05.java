package ex04;

interface Test05 {
	public String test(int num, String msg);
}

public class MainClass05 {
	public static void main(String[] args) {
		Test05 t01 = new Test05() {

			@Override
			public String test(int num, String msg) {
				return num + msg;
			}
		};
		String result = t01.test(100, "안녕");
		System.out.println(result);

		Test05 t02 = (n, s) -> {
			return n + s;
		};
		result = t02.test(200, "안녕");
		System.out.println("lambda: " + result);
		
		Test05 t03 = (n, s) -> n + s;
		result = t03.test(300, "안녕");
		System.out.println("lambda2: " + result);
	}
}
