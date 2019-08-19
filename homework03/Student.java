package homework03;

import java.util.Scanner;

public class Student {
	Scanner sc = new Scanner(System.in);
	String result = "";
	
	public String getArithmeticCalculator(String op, int a, int b, int eval , int nam){

		switch (op) {
		case "+": eval = a+b;			
		break;
		case "-": eval = a-b;	
		break;
		case "*": eval = a*b;	
		break;
		case "/": eval = a/b; nam = a%b; 	
		break;
		}

		if(op.equals("/")) {
			result = String.format("%d %s %d = %d[%d]",a, op ,b, eval, nam);		
		}else {
			result = String.format("%d %s %d = %d", a, op ,b, eval);
		}
		
		return result;

	}

	public String getBMI(double weight , double height ) {
		double yM= 0.0, BMI = 0.0;
		String eval= "";

		yM = height*0.01;

		BMI = weight /(yM*yM);

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
		result = String.format("BMI는 %.2f로 %S입니다 ", BMI , eval);
		
		return result;
	}


	public void getHowMuch() {
		int price,  total , dc, num  = 0;


		System.out.println("얼마입니까?   : ");
		price = sc.nextInt();

		System.out.println(String.format("%d원 입니다", price));

		System.out.println("몇개 드릴까요?   : ");
		num = sc.nextInt();

		System.out.println(String.format("%d개 주세요", num));

		total = num * price ;
		System.out.println(String.format("%d원 입니다", total));

		System.out.println("너무 비싸네요. 10% dc해주세요 ");

		dc = total/10;
		total = total - dc;
		System.out.println(String.format("%d원 입니다", total));

	}


	public String  getJoin(String userId , String userPW, String userName, String userBD, boolean adult , double height , double weight, String userBt) {

		result = String.format("		=== 회원정보 ===\n 아이디 : %s \n 비밀번호 : %s \n이름 : %s \n생년월일(예) : %s \n성인여부(성인true,미성년false) : %s \n 키(소수점 첫째자리까지) : %.1f cm \n몸무게(소수점 첫째자리까지) : %.1f kg\n 혈액형(A) :  %s형" , userId,userPW,userName,userBD, ((adult)? "성인":"미성년"), height, weight, userBt );
		return result;

	}

	public String getLeapYear(int temp) {
		String yr ="";	

		yr = (temp % 4==0 && temp %100 !=0) || (temp % 400 ==0) ? "윤년" : "평년" ; 

		result = String.format("%d는 %s입니다", temp ,yr );

		return result;
	}

	public String getMonthEndDay(int month) {
		int days=0;

		if(month ==2) {

			days = 29;

		}else if(month<7) {

			if(month%2==1) {
				days = 31;
			}else {
				days = 30;
			}

		}else {

			if(month%2==1) {
				days = 30;
			}else {
				days = 31;
			}

		}
		result = String.format("입력하신 %d월의 말일은 %d입니다.", month, days);
		return result;
	}

	public String getPassOrFail(String name,int arr[]) {
		int total =0, avg  = 0; 
		String eval= "";

		System.out.println(">>>>>>>이름을 입력하세요 :   ");
		name = sc.next();

		System.out.println(">>>>>국어 , 영어, 수학 점수를 차례로 입력하세요 :   ");
		for(int i = 0 ; i<3 ; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}

		avg = total / 3;

		if(avg < 70) {
			eval = "불합격";
		}else if(70<=avg && avg <90 ) {
			eval = "합격";
		}else if (90<=avg ) {
			eval = "장학생";
		}


		result +=" 학생           국어        영어        수학        총점        평균        합격여부\n";
		result +=" =======================================================\n";
		result += String.format(" %s           %d         %d          %d          %d          %d         %s  " , name, arr[0],arr[1],arr[2], total , avg, eval);
		return result;

	}

	public String getRanking(double[] score ) {
		String[] player = {"A","B","C"};

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s 선수의 기록 : %.2f 초 \n " ,player[i],score[i] );
		}

		for (int i =0 ; i < score.length-1; i++) {
			for (int j = i+1; j < score.length; j++) {
				if(score[i]> score[j]) {
					double temp = 0.0d;
					String tempName = "";

					temp = score[i];
					score[i] = score[j];
					score[j] = temp;

					tempName = player[i];
					player[i] = player[j];
					player[j] = tempName;


				}//선택정렬
			}
		}

		for (int i = 0; i < player.length; i++) {
			result +=String.format("%d등 : %s 선수 기록 (%.2f초 ) \n" , i+1 , player[i] , score[i]);
		}
		
		return result;
	}

	public String getScoreCalc(String[] arry) {
		int num = Integer.parseInt(arry[0]);
		int  Acc= Integer.parseInt(arry[1]) ,loop = Integer.parseInt(arry[2]);
		String AccString= arry[3];
		
			if (arry[0].equals("-1")) {
				AccString = AccString.substring(0, AccString.length()-1);
				result = String.format("현재까지의 누적값은 %s = %d점 이고, 평균은 %d점 입니다.", AccString , Acc , Acc/loop);
				return result;
			} else {
				return result;
			}

	}

	public String getTax(String name, double income) {

				double rate = 9.7d;

				double tax = income * (rate*0.01);

				result = String.format("연봉 %.0f만원을 받으시는 %s님께서 납부할 세금은 %.0f만원입니다.", income, name, tax);
				return result;

	}

	public String getTimeCalc(int num) {
		int  ss =0, mm = 0, hh =0, temp=0 ;

		// 초 구하기
		ss = num % 60 ;
		temp = num / 60 ; 

		//분 구하기
		mm = temp % 60 ;
		temp = temp / 60 ;

		// 시간 구하기 
		hh = temp;

		result = String.format("입력하신 초단위 %d는 %d시간 %d분 %d초 입니다. ", num, hh, mm, ss);
		return result ;

	}


}




