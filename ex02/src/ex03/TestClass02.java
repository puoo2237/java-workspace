package ex03;

import java.util.ArrayList;

public class TestClass02 {
	public static void main(String[] args) {
		// <E: 어떤 자료형을 사용할 것인지 명시>
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("안녕");
		arr.add("111");
		arr.add("222");

		String s = arr.get(1);
		System.out.println(s);

		for (int i = 0; i < arr.size(); i++) {
			s = arr.get(i);
			System.out.println(s);
		}

		System.out.println("--- foreach ---");
		for (String a : arr) {
			System.out.println(a);
		}

		System.out.println(arr.get(0));

		System.out.println(arr.contains("안녕"));
		System.out.println(arr.contains("없는 값"));
		boolean bool = arr.contains("안녕");
		if (bool) {
			System.out.println("해당 값이 존재합니다.");
		} else {
			System.out.println("해당 값이 존재하지 않습니다.");
		}

		System.out.println("삭제 전 arr: " + arr);
		arr.remove(1); // true, false 값을 반환
		System.out.println("삭제 후 arr: " + arr);
		
		System.out.println("삭제 전 arr: " + arr);
		arr.remove("안녕"); // true, false 값을 반환
		System.out.println("삭제 후 arr: " + arr);
		
		
		arr.add("안녕");
		arr.add("111");
		arr.add("222");
		System.out.println("arr 추가 후: " + arr);
		System.out.println(arr.indexOf("안녕")); // 1: 1번째에 존재함
		System.out.println(arr.indexOf("안녕111")); // -1: 존재하지 않음
		
		
		int idx = arr.indexOf("안녕");
		arr.set(idx, "안녕하세요.");
		System.out.println(arr);
	}
}
