package homework04_grade;

public class Grade {

	private int kor, eng, math ;
	private double total, avg ;
	
	
	
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
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
	@Override
	public String toString() {
		return String.format("점수 "
				+ "=====================\n"
				+ "국어 : %d \n"
				+ "영어 : %d \n"
				+ "수학 : %d \n",  kor,eng,math );
	}
}
