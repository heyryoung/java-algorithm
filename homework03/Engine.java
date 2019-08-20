package homework03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		String result ="";
		
		while(true) {

			int flag = 0;
			Scanner sc = new Scanner(System.in);
			Student student = new Student();

			System.out.println("메뉴 :  0. 종료  1.ArithmeticCalculator 2. BMI  3. HowMuch   4.Join 5.LeapYear 6.MonthEndDay 7.PassOrFail 8.Ranking 9.ScoreCalc 10.Tax 11.TimeCalc   :   ");
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
					result = student.getBMI(weight , height);
					System.out.println(result);
					break;
					
			case 3: System.out.println("HowMuch"); 
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
				
					result = student.getHowMuch(total);
					
					System.out.println(result);
					
					
					break;

			case 4: System.out.println("Join");
					String userName ="", userId ="" , userPW="", userBD="" , userBt = "";
					double height1 =0.0, weight1 = 0.0;
					boolean adult=false;
		
		
					System.out.print(">> 아이디 ");
					userId = sc.next();
		
					System.out.print(">> 비밀번호 : ");
					userPW = sc.next();
		
					System.out.print(">> 이름 : ");
					userName = sc.next();
		
					System.out.print(">> 생년월일(예) 1990-05-05 : ");
					userBD = sc.next();
		
					System.out.print(">> 성인여부(성인true,미성년false) : ");
					adult = sc.nextBoolean();
		
					System.out.print(">> 키(소수점 첫째자리까지) : ");
					height1 = sc.nextDouble();
		
					System.out.print(">> 몸무게(소수점 첫째자리까지) : ");
					weight1 = sc.nextDouble();
		
					System.out.print(">> 혈액형(A) : B형");
					userBt = sc.next();			
			
					result = student.getJoin( userId ,userPW, userName, userBD,  adult , height1 , weight1,userBt);
		
					System.out.println(result);
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
					System.out.println(">>>>>이름을 입력하세요  :   ");
					name = sc.next();
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
					String [] arry = {"0","0","0",""};
					while (true) {
						System.out.println("더하시려는 숫자를 입력하세요(종료는 -1)");
						arry[0] = sc.next();
						
						switch (arry[0]) {
						case "-1":
							result =	 student.getScoreCalc(arry);
							System.out.println(result);
							return;
						default :
							arry[1] = String.valueOf(Integer.parseInt(arry[1]) +Integer.parseInt(arry[0])) ;
							arry[3] += arry[0] + "+";
							arry[2] =String.valueOf(Integer.parseInt(arry[2]) +1) ;
							break;
						}
						result =	 student.getScoreCalc(arry);
		
					}
					
			case 10: System.out.println("Tax"); 
					System.out.println(">>> 성함과 연봉을 순서대로 입력하세요    :   ");
					String user = sc.next();
					double income = sc.nextDouble();
					
					
					result = student.getTax(user, income);
					System.out.println(result);		
					break;
					
			case 11: System.out.println("TimeCalc"); 
					int num1 =0;
		
					System.out.print(">>>>>>계산하고 싶은 초단위를 입력하세요   : ");
					num1 = sc.nextInt();
		
					result =student.getTimeCalc(num1);
					System.out.println(result);
					break;
			}


		}//while
	}

}
