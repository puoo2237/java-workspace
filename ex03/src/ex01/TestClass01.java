package ex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class TestClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("안녕");
		set.add("라면");
		set.add("안녕");
		set.add("김밥");
		System.out.println(set);

		set.remove("안녕");
		System.out.println(set);
		Iterator<String> it = set.iterator("라면");
		
		

		ArrayList<String> arr = new ArrayList<String>();
		arr.add("안녕");
		arr.add("라면");
		arr.add("안녕");
		arr.add("김밥");
		System.out.println(arr);

	}

}
