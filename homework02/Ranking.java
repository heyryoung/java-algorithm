package homework02;

import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {

		/**To. 개발자님
			저희는 비트올림픽 위원회입니다.
			한번의 트랙에서 육상선수는 총 3명 입니다.
			총 세명의 100m 기록을 입력받아서 
			1, 2, 3 등을 가려야 합니다.
			
			A 선수 기록 : 10.5초
			B 선수 기록 : 10.8초
			C 선수 기록 : 10.1초 
			라고 입력받았다면
			
			###### 성적 랭킹 #######
			
			1등 : C 선수 기록 (10.1초)
			2등 : A 선수 기록 (10.5초)
			3등 : B 선수 기록 (10.8초)
			
			라고 출력시켜주세요.
			*/
		
		Scanner sc = new Scanner(System.in);
		
		double[] score =new double[3];
		String[] player = {"A","B","C"};
		
		System.out.println("A, B, C 선수의 기록을 차례로 입력하세요 ");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%s 선수의 기록 : %f 초 \n " ,player[i],score[i] );
		}
		
		for (int i =0 ; i < score.length; i++) {
			for (int j = 0; j < score.length; j++) {
				if(score[i]< score[j]) {
					double temp = 0.0d;
					String tempName = "";
					
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
					
					tempName = player[i];
					player[i] = player[j];
					player[j] = tempName;
					
					
				}
			}
		}
		
		for (int i = 0; i < player.length; i++) {
			System.out.printf(" %d등 : %s 선수 기록 (%f초 ) \n" , i+1 , player[i] , score[i]);
		}

		
	}

}
