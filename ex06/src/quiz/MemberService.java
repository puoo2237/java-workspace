package quiz;

import java.util.List;
import java.util.Optional;

public class MemberService {
	// repository 연동 후 결과 받아옴
	// 결과를 통해 문제가 있다면 예외 발생
	// - 없으면 연산 or main으로 결과 전달
	// 예외 클래스 생성
	private MemberRepository mr;

	public MemberService() {
		mr = new MemberRepository();
	}

	public void getList() {
		List<MemberDto> mems = mr.findAll();
		for(MemberDto mem:mems) {
			System.out.println("------------------------------");
			System.out.println(mem);
		}
	}

	public void delMem(String username) {
		boolean resDel = mr.deleteByUsername(username);

		if (!resDel) {
			throw new RuntimeException("삭제할 사용자 없음");
		}
	}

	public void modMem(String username, String password, String name) {
		mr.findByUsername(username).ifPresentOrElse((mem) -> {
			mem.setName(name);
			mem.setPassword(password);
		}, () -> new RuntimeException("수정할 대상 없음"));
	}
	
	public boolean existMem(String username) {
		boolean resGet = mr.existsByUsername(username);
		if (!resGet) {
			throw new RuntimeException("해당하는 사용자 없음");
		}
		return resGet;
	}
	
	public MemberDto getMem(String username) {
		Optional<MemberDto> user = mr.findByUsername(username);
		return user.orElseThrow(() -> new RuntimeException("해당하는 사용자 없음"));
	}
	
	public void addMem(String username, String password, String name) {
		try {
			MemberDto user = new MemberDto();
			user.setName(name);
			user.setPassword(password);
			user.setUsername(username);
			
			mr.save(user);
		}
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}
