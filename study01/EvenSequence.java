package study01;

import java.util.Scanner;

public class EvenSequence {

	public static void main(String[] args) {

		System.out.println("=========================================");
		System.out.println("입력된 두 수 사이의  짝수의 합");
		System.out.println("=========================================");

		String sequence = "";
		int series =0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두 수를 입력하세요   :  ");
		int start =sc.nextInt();
		int end = sc.nextInt();
		int temp = 0;

		
		if(start - end > 0) {
			temp = start ;
			start = end;
			end = temp;
		}
		
		for (int i = start;  i <= end ; i++) {
			
			if(i % 2 == 0) {
				if(i < end-1) {
					sequence += i+"+";
				}else {
					sequence += i+"=";
				}
				series += i;
			}
			
		}
		System.out.println(sequence + series);
		
	}

}
