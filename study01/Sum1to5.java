package study01;

public class Sum1to5 {

	public static void main(String[] args) {

		// 1+2+3+4+5=
		String result = "";
		for(int i = 1; i <=5 ; i++) {

			result += (i==5) ? i +"=" :  i +"+";
		}			
		System.out.println(result);
		
	}

}
