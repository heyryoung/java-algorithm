package homework01;

import java.util.Scanner;

public class MonthEndDay {

	public static void main(String[] args) {
		/**
		 To. 개발자님
		월을 입력하면 해당 월이 몇일까지인지
		알려주는 프로그램을 작성해 주세요.
		단) 2월은 윤년을 따지지 않고 무조건 29일입니다.
		출력문장 : "??월은 **일 까지 입니다."
		 */
		int month = 0;
		int days=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(">>>>>>>>>>월을 입력하세요  :");
		month = sc.nextInt();
		
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
		
		System.out.println(String.format("입력하신 %d월의 말일은 %d입니다.", month, days));
		
		
	}

}
