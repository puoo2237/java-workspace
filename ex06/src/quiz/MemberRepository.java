package quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemberRepository {
	private List<MemberDto> list;

	public MemberRepository() {
		list = new ArrayList<MemberDto>();
		for (int i = 0; i < 3; i++) {
			list.add(new MemberDto("aaa" + i, "pwd" + i, "홍길동" + i));
		}
	}

	public MemberDto getMemberDto(String username, String password, String name) {
		MemberDto user = new MemberDto();
		user.setName(name);
		user.setPassword(password);
		user.setUsername(username);
		
		return user;
	}
	public List<MemberDto> findAll() {
		return list;
	}

	public Optional<MemberDto> findByUsername(String username) {
		return list.stream().filter(data -> data.getUsername().equals(username)).findFirst();
	}

	public boolean existsByUsername(String username) {
		return list.stream() // anyMatch : 조건이 맞는게 하나라도 있으면 true
				.anyMatch(data -> data.getUsername().equals(username));
	}

	// 회원 가입
	public boolean save(MemberDto memberDTO) {
		return list.add(memberDTO);
	}

	// 수정
	public boolean save(String username, MemberDto memberDTO) {
		return list.stream().filter(data -> data.getUsername().equals(username)).findFirst().map(found -> {
			int index = list.indexOf(found);
			list.set(index, memberDTO);
			return true;
		}).orElse(false);
	}

	
	public boolean deleteByUsername(String username) {
		return list.removeIf(data -> data.getUsername().equals(username));
	}
}
