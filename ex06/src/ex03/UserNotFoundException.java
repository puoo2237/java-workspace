package ex03;

// 기본 예외를 상속 받아서 예외를 새롭게 만들어서 사용할 수 있음 
public class UserNotFoundException extends RuntimeException {
	public UserNotFoundException(String msg) {
		super(msg);
	}
}
