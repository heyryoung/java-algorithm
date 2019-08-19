package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		String result ="";
		
		while(true) {

			int flag = 0;
			Scanner sc = new Scanner(System.in);
			Student student = new Student();

			System.out.println("메뉴 :  0. 종료  1. BMI  2. Ranking  3.HowMuch  4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ScoreCalc 10.Tax 11.TimeCalc   :   ");
			flag = sc.nextInt();

			switch (flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("getArithmeticCalculator");
					String op ="";
					int a =0, b=0, eval =0, nam = 0;
					System.out.print(">>>>>실행하고자 하는 연산을 선택하세요   +,  - ,  * , / 중 선택하시오  :   ");
					op = sc.next();
		
					System.out.println(">>>>> 연산하려고 하는 수를 연속으로 입력하시오 : "); 
					a = sc.nextInt();
					b = sc.nextInt();
		
					result = student.getArithmeticCalculator(op, a, b, eval, nam);
					
					System.out.println(result);
					break;
			
			
			case 2: System.out.println("BMI"); 
					double weight= 0.0, height= 0.0;
		
					System.out.println(" >>>>> 몸무게를 입력하세요  :   ");
					weight = sc.nextDouble();
		
					System.out.println(">>>>> 키를 입력하세요 :   ");
					height= sc.nextDouble();
					student.getBMI(weight , height);
					break;
					
			case 3: System.out.println("HowMuch"); 
					student.getHowMuch();
		
					break;

			case 4: System.out.println("Join");
					student.getJoin();
		
					break;
			case 5: System.out.println("LeapYear"); 
					int temp =0;
		
					System.out.println(">>>>윤년을 판단할 년도를 입력하세요 :    ");
					temp = sc.nextInt();
					
					result = student.getLeapYear(temp);
					System.out.println(result);
		
					break;
			case 6: System.out.println("MonthEndDay");
					int month = 0;
		
					System.out.println(">>>>>>>>>>월을 입력하세요  :");
					month = sc.nextInt();
					
					result = student.getMonthEndDay(month);
					System.out.println(result);
		
					break;
					
			case 7: System.out.println("PassOrFail");
					String name ="";
					int arr[] = new int[3];
					System.out.println(">>>>>국어 , 영어, 수학 점수를 차례로 입력하세요 :   ");
					for(int i = 0 ; i<3 ; i++) {
						arr[i] = sc.nextInt();
					}
					result = student.getPassOrFail(name, arr);
					System.out.println(result);
					break;
					
			case 8: System.out.println("Ranking"); 
					double[] score =new double[3];
					System.out.println("A, B, C 선수의 기록을 차례로 입력하세요 ");
					for (int i = 0; i < score.length; i++) {
						score[i] = sc.nextDouble();
					}
					result = student.getRanking(score);
						
					System.out.println(result);
					break;
					
			case 9: System.out.println("ScoreCalc");
			student.getScoreCalc();

			break;
			case 10: System.out.println("Tax"); 
			student.getTax();

			break;
			case 11: System.out.println("TimeCalc"); 
			int num =0;

			System.out.print(">>>>>>계산하고 싶은 초단위를 입력하세요   : ");
			num = sc.nextInt();

			result =student.getTimeCalc(num);
			System.out.println(result);
			break;
			}


		}//while
	}

}
