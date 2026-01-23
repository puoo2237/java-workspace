package ex04;

import java.util.HashMap;

public class MemberDTO {
	private String name, grade;
	private int kor, eng, math, sum;
	HashMap<String, String> member;

	public MemberDTO() {
		member = new HashMap<String, String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setSum() {
		this.sum = this.kor + this.eng + this.math;
	}

	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setGrade() {
		double avg = this.sum / 3;
		if (avg >= 80) {
			this.grade = "A";
		} else if (avg >= 60) {
			this.grade = "B";
		} else {
			this.grade = "C";
		}
	}

	public void setMember() {
		String userName = this.getName();
		int userKor = this.getKor();
		int userEng = this.getEng();
		int userMath = this.getMath();
		int userSum = this.getSum();
		String userGrade = this.getGrade();

		this.member.put("name", userName);
		this.member.put("kor", "" + userKor);
		this.member.put("eng", "" + userEng);
		this.member.put("math", "" + userMath);
		this.member.put("sum", "" + userSum);
		this.member.put("avg", "" + (userSum / 3));
		this.member.put("grade", userGrade);
	}

	public HashMap<String, String> getMember() {

		return this.member;
	}
}
