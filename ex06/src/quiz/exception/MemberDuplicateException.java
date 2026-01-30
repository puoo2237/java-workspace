package quiz.exception;

public class MemberDuplicateException extends RuntimeException {
	public MemberDuplicateException() {
	}

	public MemberDuplicateException(String msg) {
		super(msg);
	}
}
