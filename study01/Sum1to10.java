package study01;

public class Sum1to10 {

	public static void main(String[] args) {
		
		String eval = "";
		int sum=0;
		for(int i = 1; i <=10 ; i++) {

			
			
			eval += (i==10) ? i +"=" :  i +"+";
			sum += i;
			
		}			
		System.out.println(String.format("문자열의 연산 :   %s  ", eval));
		System.out.println(String.format("숫자의 연산 :    %d ", sum));
		System.out.println(eval + sum);
	}

}
