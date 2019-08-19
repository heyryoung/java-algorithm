package study04;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		while(true) {
			int flag = 0;
			String result="";
			System.out.println(" 0. 종료 , 1. BMI 2. 대출");;
			
			
			switch (sc.nextInt()) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("종료"); 
			String name ="";
			double weight =0.0, height=0.0;
			result = student.getBmi(name, weight, height);
			
			break;
			
			
			case 2: 
				 // 이름, 주소, 나이, 은행잔고, 신용도 
				 // 어떤 것을 입력하던 1억 대출
				String user= "" , addr ="",level ="" ;
				int age =0, total =0;
				System.out.println("이름을 입력하세요 : ");
				user = sc.next();
				System.out.println("주소를 입력하세요 : ");
				addr = sc.next();
				System.out.println("나이를 입력하세요 : ");
				age = sc.nextInt();
				System.out.println("잔고를 입력하세요 : ");
				total = sc.nextInt();
				System.out.println("신용등급을 입력하세요 : ");
				level = sc.next();
				
				result = student.deachul(user, addr,age,total,level); // 메소드를 호출하는 부분
				System.out.println(result);
				break;
				
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			}
			
			
		}
		
		
	}

}
