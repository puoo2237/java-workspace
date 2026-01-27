package ex04;

interface Test06{
	public String test();
}
// 인터페이스를 매개변수로 쓰이는 경우
class TestClass06{
	public void testClass(Test06 t) {
		System.out.println(t.test());
	}
}
public class MainClass06 {
	public static void main(String[] args) {
		Test06 t01 = new Test06() {
			
			@Override
			public String test() {
				return "리턴-값";
			}
		};
		
		TestClass06 tc01 = new TestClass06();
		tc01.testClass(t01);
		
		Test06 t02 = () -> "안녕하세요.";
		tc01.testClass(t02);
	
		tc01.testClass(() -> "직접 설정");
	}
}
