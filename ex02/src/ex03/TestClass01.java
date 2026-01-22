package ex03;

public class TestClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[5];
		System.out.println(arr[0]);
		System.out.println(arr[4]);
		arr[2] = 12345;
		System.out.println(arr[2]);

		double arrDou[] = new double[] { 1.1, 2.2, 123.123 };
//		double arrDou[] = { 1.1, 2.2, 123.123 };
		System.out.println(arrDou.length);
		for (int i = 0; i < arrDou.length; i++) {
			System.out.println(arrDou[i]);
		}

		String[] str = { "문자열1", "문자열2" };
		for (String a : str) {
			System.out.println(a);
		}
		System.out.println("========");
		String[] str1 = new String[2];
		System.out.println(str1[0]);

		int[] arrInt = { 1, 2, 3, 4 };
		double[] arrDouble = { 1.1, 2.2, 3, 4 };
		String[] arrString = { "1", "2", "3", "4" };

		for (int a : arrInt) {
			System.out.println(a);
		}
		
		for (double a : arrDouble) {
			System.out.println(a);
		}
	}

}
