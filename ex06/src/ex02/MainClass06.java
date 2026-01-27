package ex02;

public class MainClass06 {
	public static void main(String[] args) {
		// 강제 예외
		int age = 0;
		System.out.println("나이 입력");
		try {
			age = -200;
			if(age < 1 || age > 100)
				throw new Exception("에러 메세지");
			System.out.println("당신 나이: " + age);
		}catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getMessage());
		}
	}
}
