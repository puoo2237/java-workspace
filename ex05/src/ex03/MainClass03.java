package ex03;

import java.util.ArrayList;

class Test03 {
	int num = 100;
	String name = "홍길동";

	public void test() {

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + num + "]";
	}

}

public class MainClass03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		System.out.println("aaa".getClass());
		System.out.println(t.getClass());

		System.out.println(t.toString());
		System.out.println(t);

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("111");
		arr.add("222");
		System.out.println(arr.toString());
		System.out.println(arr);

		int[] arr2 = new int[] { 111, 222 };
		System.out.println(arr2.toString());
		System.out.println(arr2);
	}
}
