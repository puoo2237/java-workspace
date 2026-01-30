package quiz;

import java.util.List;
import java.util.Optional;

import quiz.exception.MemberDuplicateException;
import quiz.exception.MemberNotFoundException;

public class MemberService extends MemberRepository {
	// repository 연동 후 결과 받아옴
	// 결과를 통해 문제가 있다면 예외 발생
	// - 없으면 연산 or main으로 결과 전달
	// 예외 클래스 생성
	private MemberRepository mr;

	public MemberService() {
		mr = new MemberRepository();
	}

	public List<MemberDto> getList() {
		return mr.findAll();
	}

	public void delMem(String username) {
		boolean checkDel = mr.deleteByUsername(username);

		if (!checkDel) {
			throw new MemberNotFoundException("삭제할 사용자 없음");
		}
	}

	public void modMem(String username, String password, String name) {
		mr.findByUsername(username).ifPresent((mem) -> {
			mem.setName(name);
			mem.setPassword(password);
		});
	}
	
	public boolean existMem(String username) {
		boolean checkEg = mr.existsByUsername(username);
		if (!checkEg) {
			throw new MemberNotFoundException("해당하는 사용자 없음");
		}
		return checkEg;
	}

	public boolean existReg(String username) {
		boolean checkEg = mr.existsByUsername(username);
		if (checkEg) {
			throw new MemberDuplicateException("이미 가입한 회원입니다.");
		}
		return checkEg;
	}
	public MemberDto getMem(String username) {
		Optional<MemberDto> user = mr.findByUsername(username);
		return user.orElseThrow(MemberNotFoundException::new);
	}

	public void addMem(String username, String password, String name) {
		MemberDto user = mr.getMemberDto(username, password, name);
		mr.save(user);
	}
}
