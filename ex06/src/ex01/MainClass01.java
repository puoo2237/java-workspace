package ex01;

public class MainClass01 {
	public static void main(String[] args) {
		MainDto01 dto01 = new MainDto01();
		dto01.setName("연습");
		dto01.setAge(20);
		System.out.println(dto01);
		System.out.println(dto01.getName());
		System.out.println(dto01.getAge());
		
		
		MainDto01 dto02 = new MainDto01("연습1", 30);
		System.out.println(dto02);
		System.out.println(dto02.getName());
		System.out.println(dto02.getAge());
	}
}
