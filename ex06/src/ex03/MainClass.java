package ex03;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		List<User> list = memberService.getList();
		System.out.println(list);

//		if(user == null) {
//			System.out.println("찾는 회원 없음");
//		}else {
//			System.out.println(user.getUsername());
//			System.out.println(user.getPassword());
//		}

//		String username = "aa";
//		try {
//			User user = memberService.getOne(username);
//			System.out.println(user.getUsername());
//			System.out.println(user.getPassword());
//		} catch (RuntimeException e) {
////			System.out.println("찾는 회원 없음");
//			System.out.println(e.getMessage());
//		}
		
		String username = "aa";
		try {
			User user = memberService.getOne(username);
			System.out.println(user.getUsername());
			System.out.println(user.getPassword());
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
}
