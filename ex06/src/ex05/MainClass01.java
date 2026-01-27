package ex05;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import ex03.User;
import ex03.UserNotFoundException;

class MemberService01 {
	ArrayList<User> arr;

	public MemberService01() {
		arr = new ArrayList<User>();
		User user1 = new User("aaa", "111");
		User user2 = new User("bbb", "222");
		arr.add(user1);
		arr.add(user2);
	}

	// List => ArrayList 부모
	public List<User> getList() {
		return arr;
	}

	public User getOne(String username) {
//		Stream<User> str = arr.stream().filter((t) -> t.getUsername().equals(username));
//
//		// null point exception 방지 목적
//		Optional<User> optional = str.findFirst();
//		return optional.orElse(null);

		return arr
				.stream()
				.filter((t) -> t.getUsername().equals(username))
				.findFirst()
				.orElseThrow(()->new UserNotFoundException("사용자 없음"));
	}

	public User modify(String username, String changePwd) {
		User user = arr
				.stream()
				.filter((dto) -> dto.getUsername().equals(username))
				.findFirst()
				.map(member -> {
					member.setPassword(changePwd);
					return member;
				})
				.orElseThrow(() -> new UserNotFoundException("수정 사용자 없음"));
		return user;
	}

	public void deleteUser(String username) {
		boolean bool = arr.removeIf(dto -> dto.getUsername().equals(username));
		if(!bool) {
			throw new UserNotFoundException("삭제 사용자 없음");
		}
	}
	
	public void insert(User user) {
		arr
		.stream()
		.filter(dto -> dto.getUsername().equals(user.getUsername()))
		.findFirst()
		.ifPresentOrElse(
				// filter 조건이 참인 경우
				m -> {
					throw new MemberDuplicateException("동일한 id 있음");
				},
				// 거짓인 경우
				() -> {
					arr.add(user);
				});	}
}

public class MainClass01 {
	public static void main(String[] args) {
		MemberService01 ms = new MemberService01();
		System.out.println(ms.getList());

		String username = "aaa";
		try {
			User user = ms.getOne(username);
			System.out.println(user);

		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		User user = null;
		try {
			user = ms.modify("aa", "수정 비번");
			System.out.println("수정 후 user: " + user);
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("수정 후 확인");
		System.out.println(ms.getList());
		
		
		try {
			ms.deleteUser("bb");
		} catch (UserNotFoundException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("삭제 후 확인");
		System.out.println(ms.getList());
		
		try {
			ms.insert(new User("aaab", "444"));
		}catch(MemberDuplicateException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("추가 후 확인");
		System.out.println(ms.getList());
	}
}
