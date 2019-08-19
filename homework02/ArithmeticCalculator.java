package homework02;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		/**
		To. 개발자님
		프로그램을 하나 개발해야 합니다.
		교수가 요청하기를 브라우저에서 사용할 계산기를 만들어 달랍니다.
		복잡할 필요는 없고, 사칙연산 가능하고 나눗셈은
		몫과 나머지값으로 출력하면 된답니다.
		출력결과물은 예를 들어
		5 + 5 = 10
		2 - 7 = -5
		이렇게 되고,
		10 / 3 = 3 [1] 나눗셈은 이렇게 나오면 된답니다.
		그러면 []값이 나머지인지는 교수가 이미 알고 있겠답니다.
		 */

		int a , b, eval  = 0;
		String  op = "";
		int nam = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print(">>>>>실행하고자 하는 연산을 선택하세요   +,  - ,  * , / 중 선택하시오  :   ");
		op = sc.next();

		System.out.println(">>>>> 연산하려고 하는 수를 연속으로 입력하시오 : "); 
		a = sc.nextInt();
		b = sc.nextInt();

		switch (op) {
		case "+": eval = a+b;			
		break;
		case "-": eval = a-b;	
		break;
		case "*": eval = a*b;	
		break;
		case "/": eval = a/b; nam = a%b; 	
		break;
		}

		if(op.equals("/")) {
			System.out.println(String.format("%d %s %d = %d[%d]",a, op ,b, eval, nam));		
		}else {
			System.out.println(String.format("%d %s %d = %d", a, op ,b, eval));
		}


	}

}
