package homework01;

import java.util.Scanner;

public class TimeCalc {

	public static void main(String[] args) {
		/*
		 * To.개발자님께 초단위로 알려주는 시험이 있는데 이 값을 몇시간 몇분 몇초인지 계속 계산해야 해서요. 
		 * 혹시 초값을 입력받으면 자동으로
		 * 계산되는 프로그램을 만들어 줄 수 있을까요? 그러니까 500초 이면 뭐 몇시간 몇분 몇초라고 보여주면 좋겠죠.
		 */
		
		int num = 0;
		int ss =0;
		int mm = 0;
		int hh =0;
		int temp=0;
		
		System.out.print(">>>>>>계산하고 싶은 초단위를 입력하세요   : ");
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		ss = num % 60;
		temp = num / 60 ; 
		
		mm = temp % 60 ;
		temp = temp / 60;
		
		hh = temp;
		
		System.out.println(String.format("입력하신 초단위 %d는 %d시간 %d분 %d초 입니다. ", num, hh,mm,ss));
		
		
		
	}

}
