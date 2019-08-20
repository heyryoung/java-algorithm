package study05;

public class Member {

	private String userName ,userId, userPW, userBD, userBt;
	private double height , weight, sal;
	private boolean adult;
	
	private int kor, eng, mat;
	
	
	
	
	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
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

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPW() {
		return userPW;
	}

	public void setUserPW(String userPW) {
		this.userPW = userPW;
	}

	public String getUserBD() {
		return userBD;
	}

	public void setUserBD(String userBD) {
		this.userBD = userBD;
	}

	public String getUserBt() {
		return userBt;
	}

	public void setUserBt(String userBt) {
		this.userBt = userBt;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isAdult() {
		return adult;
	}

	public void setAdult(boolean adult) {
		this.adult = adult;
	}

	
	@Override
	public String toString() {
		return String.format("회원정보 \n"
				+ "=====================\n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈액형 : %s \n"
				+ "키 : %.2f \n"
				+ "무게 : %.2f \n"
				+ "연봉  :  %.0f \n"
				+ "국어점수 :  %d \n"
				+ "영어점수 :  %d \n"
				+ "수학점수 :  %d \n", userName ,userId, userPW, userBD, userBt,height , weight, sal , kor,eng,mat );
	}
	
	
	
	
}
