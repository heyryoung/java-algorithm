package homework02;

import java.util.Scanner;

public class Join {

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

		System.out.println("=== 회원가입 ===");
		String[] jungbo = {"아이디", "비밀번호", "이름", "생년월일(예) 1980-01-01","성인여부(성인true,미성년false)","키(소수점 첫째자리까지)","몸무게(소수점 첫째자리까지) : ","혈액형(A) : "};
		String[] userInfo = new String[8];

		for (int i = 0; i < jungbo.length; i++) {
			System.out.printf("%s  :  " , jungbo[i]);

			if(i == 5) {
				String temp =sc.next();
				if(temp.equals("true")) {
					userInfo[i] ="성인";
				}else {
					userInfo[i] ="미성년";
				}
			}else if(i ==6 ){
				userInfo[i] = sc.next() + "cm";
			}else if(i ==7 ){
				userInfo[i] = sc.next() + "kg";
			}else if(i ==8 ){	
				userInfo[i] = sc.next() + "형";
			}else {
				userInfo[i] = sc.next();
			}
		}

		System.out.println("=== 회원정보 ===");
		for (int i = 0; i < jungbo.length; i++) {
			System.out.printf("%s  :  %s \n " , jungbo[i] , userInfo[i]);
		}

	}

}
