package ex04;

import java.util.ArrayList;

class MemberDto {
	private String name;
	private int age;

	public MemberDto() {
	}

	public MemberDto(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "[" + name + ", " + age + "]";
	}

}

public class MainClass02 {
	public static void main(String[] args) {
		ArrayList<MemberDto> list = new ArrayList<MemberDto>();
		ArrayList<String> str = new ArrayList<>();
		str.add("111");
		str.add("222");
//		System.out.println(str.get(0));

		for (String s : str) {
			System.out.println(s);
		}

		System.out.println("=====================");
		MemberDto dto01 = new MemberDto();
		dto01.setName("홍길동");
		dto01.setAge(20);
		list.add(dto01);
//		System.out.println(list.get(0));
//		System.out.println(list.get(0).getName());
//		System.out.println(list.get(0).getAge());

		MemberDto dto02 = new MemberDto("김개똥", 30);
		list.add(dto02);
//		System.out.println(list.get(1));
//		System.out.println(list.get(1).getName());
//		System.out.println(list.get(1).getAge());

		for (MemberDto data : list) {
//			System.out.println(data);
			System.out.println("이름: " + data.getName());
			System.out.println("나이: " + data.getAge());
		}

	}
}
