package ex02;

class QuizSt {
	private int kor, eng, math, sum;

	private double avg;

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

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public double getAvg() {
		return avg;
	}

}

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 100, e = 90, m = 80;
		int sum = k + e + m;
		double avg = sum / 3;

		// 객체 생성, 각각 setter를 통해 변수에 값 저장
		QuizSt q = new QuizSt();
		q.setKor(k);
		q.setEng(e);
		q.setMath(m);
		q.setSum(sum);
		q.setAvg(avg);
		
		// getter를 이용하여 값 출력 (국, 영, 수, 합, 평균)
		System.out.println("국어 점수: " + q.getKor());
		System.out.println("영어 점수: " + q.getEng());
		System.out.println("수학 점수: " + q.getMath());
		System.out.println("합계: " + q.getSum());
		System.out.println("평균: " + q.getAvg());
	}

}
