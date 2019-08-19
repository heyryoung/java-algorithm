package study03;

import java.util.Scanner;

public class Student {
	// 1. BMI 2. Ranking 3. HowMuch 4.ReportCard

	Scanner scan = new Scanner(System.in);
	public void getBmi() {
		double height =0.0d, weight = 0.0d , BMI = 0.0d, yM = 0.0d;
		String eval = "";


		System.out.println(" >>>>> 몸무게를 입력하세요  :   ");
		weight = scan.nextDouble();

		System.out.println(">>>>> 키를 입력하세요 :   ");
		height= scan.nextDouble();
		yM = height*0.01;

		BMI = weight / yM*yM;

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
		System.out.println(String.format("BMI는 %.2f로 %S입니다 \n", BMI , eval));

	}

	public void getRank() {


		double[] score =new double[3];
		String[] player = {"A","B","C"};

		System.out.println("A, B, C 선수의 기록을 차례로 입력하세요 ");
		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextDouble();
		}

		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s 선수의 기록 : %f 초 \n " ,player[i],score[i] );
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
			System.out.printf(" %d등 : %s 선수 기록 (%f초 ) \n" , i+1 , player[i] , score[i]);
		}

	}

	public void getHowMuch() {
		int price,  total , dc, num  = 0;


		System.out.println("얼마입니까?   : ");
		price = scan.nextInt();

		System.out.println(String.format("%d원 입니다", price));

		System.out.println("몇개 드릴까요?   : ");
		num = scan.nextInt();

		System.out.println(String.format("%d개 주세요", num));

		total = num * price ;
		System.out.println(String.format("%d원 입니다", total));

		System.out.println("너무 비싸네요. 10% dc해주세요 ");

		dc = total/10;
		total = total - dc;
		System.out.println(String.format("%d원 입니다", total));

	}

	public void getReportCard() {

		int total =0, avg  = 0; 
		int arr[] = new int[3];
		String name ="" , eval= "";

		System.out.println(">>>>>>>이름을 입력하세요 :   ");
		name = scan.next();

		System.out.println(">>>>>국어 , 영어, 수학 점수를 차례로 입력하세요 :   ");
		for(int i = 0 ; i< arr.length ; i++) {

			arr[i] = scan.nextInt();
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

		System.out.println(" 학생           국어        영어        수학        총점        평균        합격여부");
		System.out.println(" =======================================================");
		System.out.println(String.format(" %s           %d         %d          %d          %d          %d         %s  " , name, arr[0],arr[1],arr[2], total , avg, eval));

	}

}


