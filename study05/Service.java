package study05;

public class Service {

	
	public String getBMI(Member mb) {
		double yM= 0.0, BMI = 0.0;
		String eval= "";
		yM = mb.getHeight()*0.01;

		BMI = mb.getWeight()/(yM*yM);

		if(BMI<=18.5) {
			eval = "저체중";
		}else if(18.5<BMI&&BMI<=23.0) { 
			eval = "정상";
		}else if(23.0<BMI && BMI<=25.0) {
			eval = "과체중";
		}else if(25.0<BMI && BMI<=30.0) {
			eval = "비만";
		}else if(30.0<BMI) {
			eval = "고도비만";
		}
		String result = String.format("BMI는 %.2f로 %S입니다 ", BMI , eval);
		return result;
	}
	
	public String getReportCard(Member mb) {
		String result = "";
		
		int total =0, avg  = 0 ; 
		String  eval= "";

		int kor = mb.getKor(); 
		int eng = mb.getEng();
		int mat = mb.getMat();
		total = (kor+eng+mat); 
		avg = (kor+eng+mat) / 3;

		if(avg < 70) {
			eval = "불합격";
		}else if(70<=avg && avg <90 ) {
			eval = "합격";
		}else if (90<=avg ) {
			eval = "장학생";
		}

		System.out.println(" 학생           국어        영어        수학        총점        평균        합격여부");
		System.out.println(" =======================================================");
		System.out.println(String.format(" %s           %d         %d          %d          %d          %d         %s  " , mb.getUserName() , kor, eng,mat,total , avg, eval));

		
		return result;
		
	}
	
	
	public String getTax(Member mb) {

		double rate = 9.7d;

		double tax = mb.getSal() * (rate*0.01);

		String result = String.format("연봉 %.0f만원을 받으시는 %s님께서 납부할 세금은 %.0f만원입니다.", mb.getSal(), mb.getUserName(), tax);
		return result;

}
	
	
	
}
