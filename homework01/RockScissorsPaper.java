package homework01;

import java.util.Random;
import java.util.Scanner;

public class RockScissorsPaper {

	public static void main(String[] args) {
		/**
		 * 가위바위보에서 Random(3)+1 을 사용하면 1 ~ 3까지 나옵니다. 컴퓨터가 만든 값이 1이면 가위를 낸 것이고 2이면 바위를 낸
		 * 것이고 3이면 보를 낸 것으로 할 때, 사용자측이 가위, 바위, 보를 냈을 때 승패를 결정하는 프로그램을 작성하시오
		 */

		Scanner sc = new Scanner(System.in);

		Random ran = new Random();
		int com = ran.nextInt(3) + 1;
		String computer = "";
		String user = "";

		switch (com) {
			case 1:
				computer = "가위";	break;
			case 2:
				computer = "바위";	break;
			case 3:
				computer = "보"; 	break;
		}

		while (true) {
			System.out.print(">>>>>>> 진행하시겠습니까? 1. 진행  0. 종료     : ");
			int flag = sc.nextInt();

			switch (flag) {
			case 1: break;
			case 0: System.out.println(">>>>> 프로그램을 종료합니다. ");		return;
			}

			System.out.println(">>>>>가위, 바위, 보 중 하나를 입력하세요  : ");
			user = sc.next();

			System.out.println(String.format("컴퓨터가 낸 것은 %s 입니다.", computer));

			switch (user) {
			case "가위":
				switch (com) { 
					case 1: System.out.println("비겼습니다."); break; 
					case 2: System.out.println("졌습니다."); break;
					case 3: System.out.println("이겼습니다."); break ;
				}
				break;
				
			case "바위":
				switch (com) { 
					case 1: System.out.println("이겼습니다."); break; 
					case 2: System.out.println("비겼습니다."); break; 
					case 3: System.out.println("졌습니다."); break; 
					}
				break;

			case "보":
				switch (com) { 
					case 1: System.out.println("졌습니다."); break; 
					case 2: System.out.println("이겼습니다."); break; 
					case 3: System.out.println("비겼습니다."); break;
				}
				break;
			}

		}

	}

}
