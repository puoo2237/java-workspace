package ex01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass01 {
	public static void main(String[] args) {
//		long time = System.currentTimeMillis();
		Date time = new Date();
		System.out.println(time);

		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
		String s = simple.format(time);
		System.out.println(s);
		
		System.out.println("시작");
		try {
			Thread.sleep(500); // 0.5초
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("종료");
	}
}
