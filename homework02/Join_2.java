package homework02;

import java.util.Scanner;

public class Join_2 {

	public static void main(String[] args) {
		/**

		to. 개발자님
		여기는 비트헬스 입니다.
		입력받을 정보는 아래와 같습니다.
		값을 입력받은 후에 다시 입력받은 값을 그대로 보여주는
		프로그램을 보여주세요

		=== 회원가입 ===
		아이디 : 
		비밀번호 : 
		이름 : 
		생년월일(예) 1980-01-01 : 
		성인여부(성인true,미성년false) : 
		키(소수점 첫째자리까지) :
		몸무게(소수점 첫째자리까지) : 
		혈액형(A) : 

		입력이 종료되면 ...아래처럼 보이게 해주세요

		=== 회원정보 ===
		아이디 : hong
		비밀번호 : 1234
		이름 : 홍길동
		생년월일(예) 1990-05-05 : 
		성인여부(성인true,미성년false) : 성인
		키(소수점 첫째자리까지) : 178.5 cm
		몸무게(소수점 첫째자리까지) : 75kg
		혈액형(A) : B형

	 */
		
		Scanner sc = new Scanner(System.in);
		String userName, userId, userPW, userBD , userBt = "";
		double height , weight = 0.0d;
		boolean adult;
		
		
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
		height = sc.nextDouble();
		
		System.out.print(">> 몸무게(소수점 첫째자리까지) : ");
		weight = sc.nextDouble();

		System.out.print(">> 혈액형(A) : B형");
		userBt = sc.next();
		
		System.out.printf("		=== 회원정보 ===\n 아이디 : %s \n 비밀번호 : %s \n이름 : %s \n생년월일(예) : %s \n성인여부(성인true,미성년false) : %s \n 키(소수점 첫째자리까지) : %.1f cm \n몸무게(소수점 첫째자리까지) : %.1f kg\n 혈액형(A) :  %s형" , userId,userPW,userName,userBD, ((adult)? "성인":"미성년"), height, weight, userBt );
		
	}

}
