package ex01;

public class TestClass03 {
	public static void main(String[] args) {
		String str1;
		String str2 = new String();
		String str3 = "test Abb";
		String str4 = new String("test");
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());

		str3 = "Java";
		if (str3.toLowerCase().equals("java")) {
			System.out.println("JAVA 선택");
		}

		str3 = "	test	";
		System.out.println(str3);
		System.out.println(str3.trim());
		System.out.println(str3.trim().equals("test"));

		String addr = "01233 서울시 노원구 동일로";
		String[] s = addr.split(" ");
		for (String ss : s) {
			System.out.println(ss);
		}

		addr = addr.replace(" ", "/");
		System.out.println(addr);
	}
}
