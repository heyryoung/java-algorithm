package study05;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Member mb = null;
		Service service = new Service();

		while(true) {
			
			System.out.println("0.종료 1.JOIN 2.정보보기 3.아이디찾기 4.BMI 5.ReportCard 6. Tax ");
			
			switch (sc.nextInt()) {
			case 0: System.out.println("=============종료===========");  return;
			case 1:System.out.println("===========JOIN============="); 
				mb = new Member();
				System.out.print(">> 아이디 ");
				mb.setUserId(sc.next());
	
				System.out.print(">> 비밀번호 : ");
				mb.setUserPW(sc.next()); 
	
				System.out.print(">> 이름 : ");
				mb.setUserName(sc.next());
	
				System.out.print(">> 생년월일(예) 1990-05-05 : ");
				mb.setUserBD(sc.next());
	
				System.out.print(">> 성인여부(성인true,미성년false) : ");
				mb.setAdult(sc.nextBoolean());
	
				System.out.print(">> 키(소수점 첫째자리까지) : ");
				mb.setHeight(sc.nextDouble());
	
				System.out.print(">> 몸무게(소수점 첫째자리까지) : ");
				mb.setWeight(sc.nextDouble());
	
				System.out.print(">> 혈액형(A) : ");
				mb.setUserBt(sc.next());
				
				System.out.print(">> 연봉을 입력하세요 :  ");
				mb.setSal(sc.nextDouble());

				System.out.print(">> 국어점수를  입력하세요 :  ");
				mb.setKor(sc.nextInt());
				System.out.print(">> 영어점수를  입력하세요 :  ");
				mb.setEng(sc.nextInt());
				System.out.print(">> 수학점수를  입력하세요 :  ");
				mb.setMat(sc.nextInt());
				
				
				break;
				case 2: System.out.println("=============정보보기==========="); 
				
				System.out.println(mb.toString());
				
				break;
				case 3: System.out.println("===========아이디 찾기============"); 
				
				System.out.println("아이디와 이름을 입력하시면 비번과 생년월일을 알려줌 ");
				String searchId = sc.next();
				String searchName =sc.next();
				
				if (searchName.equals(mb.getUserName())&& searchId.equals(mb.getUserId())) {
					System.out.printf("찾는 비번은 : %s   생년 월일은  %s  입니다 \n\n" , mb.getUserPW(),mb.getUserBD() );
				}else {
					System.out.println("잘못입력하였습니다.\n\n");
				}
				
				break;
				
				
				
				
				
				case 4: System.out.println("===============BMI========="); 
				
				System.out.println(service.getBMI(mb));
				break;
				
				case 5: System.out.println("==============ReportCard=========="); 
				
				System.out.println(service.getReportCard(mb));
				break;
				
				case 6: System.out.println("===========Tax=========="); 

				System.out.println("1. 세율 변경. 2.세금 계산");
					if(sc.nextInt()==1) {
						System.out.println("세율을 입력하세요");
						mb.setRate(sc.nextDouble());
					}else {
						System.out.println(service.getTax(mb));
					}
						
				break;
			}
			
		}
		
	}

}
