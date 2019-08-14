package homework02;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
		/**
		To 개발자님

		클라이언트에서 프로그램 개발 요청이 왔습니다.
		이름과 연봉을 입력받아서
		연봉 ***만원을 받으시는 XXX님께서 납부할 세금은 ???만원입니다.
		로 출력하는 프로그램을 만들어 주세요.
		단) 세율이 정책이 바뀔 때 마다 변하니,
		관리자가 쉽게 적용가능하도록 만들어 주세요.
		현재는 세율이 9.7프로라고 합니다.
		*/

		

		double rate = 9.7d;
		
		while(true) {
			

			double tax , income = 0.0d;
			String name = "";
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("프로그램을 진행하시려면 1번, 종료하시려면 0번을 입력하세요   : ");
			int flag = sc.nextInt();
			switch (flag) {
			case 1: break;
			case 0: System.out.println("프로그램 종료"); return;
			}

			System.out.print("세율 계산은 1번, 세율을 변경 하시려면 0번을 입력하세요   : ");
			int flag2 = sc.nextInt();
			
			if(flag2 == 1) {
				System.out.println(">>> 성함과 연봉을 순서대로 입력하세요    :   ");
				name = sc.next();
				income = sc.nextDouble();
				tax = income * (rate*0.01);
				
				System.out.println(String.format("연봉 %f만원을 받으시는 %s님께서 납부할 세금은 %f만원입니다.", income, name, tax));
				
			}else if(flag2 == 0){
				System.out.println("변경할 세율을 입력하세요  : ");
				rate = sc.nextDouble();
				
				System.out.println(String.format("입력받은 세율은 %f입니다", rate));
			}else {
				System.out.println("잘못입력하였습니다.");
			}
			
		}
		
	}

}
