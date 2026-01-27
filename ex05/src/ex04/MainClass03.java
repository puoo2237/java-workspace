package ex04;

import java.util.ArrayList;
import java.util.Scanner;

class MemDto03 {
	private String name;
	private int age;

	public MemDto03() {
	}

	public MemDto03(String name, int age) {
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

}

public class MainClass03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<MemDto03> list = new ArrayList<MemDto03>();
		int num;
		String name = null;
		int age = 0;
		while (true) {
			System.out.println("1.입력 2.출력 3.이름 비교");
			num = input.nextInt();
			switch (num) {
			case 1:
				System.out.println("이름 입력");
				name = input.next();
				System.out.println("나이 입력");
				age = input.nextInt();

				MemDto03 d = new MemDto03();
				d.setName(name);
				d.setAge(age);
				list.add(d);
				break;
			case 2:
				for (int i = 0; i < list.size(); i++) {
					MemDto03 dto = list.get(i);
					System.out.println(dto.getName());
					System.out.println(dto.getAge());
					System.out.println("------------");
				}
				break;
			case 3:
				System.out.println("찾을 이름 입력");
				name = input.next();
				MemDto03 mDto = null;
				for (int i = 0; i < list.size(); i++) {
					if (list.get(i).getName().equals(name)) {
						mDto = list.get(i);
						break;
					}
				}
				if (mDto != null) {
					System.out.println("이름: " + mDto.getName());
					System.out.println("나이: " + mDto.getAge());
				} else {
					System.out.println(name + "님은 존재하지 않음");
				}
//				System.out.println("mdto: " + mDto);
				break;
			}
		}
	}
}
