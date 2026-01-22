package ex01;

import java.util.HashMap;

public class TestClass02 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("num", "12345");
		map.put("이름", "홍길동");

		System.out.println(map);
		System.out.println(map.get("이름"));

		System.out.println(map.keySet());
		System.out.println(map.values());

		map.remove("이름");
		System.out.println(map);
	}
}
