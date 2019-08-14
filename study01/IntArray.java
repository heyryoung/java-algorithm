package study01;

import java.util.Scanner;

public class IntArray {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		String[] subjects = {"국어","영어","수학","과탐","사탐"};
		int[] scores = new int[5];
		
		for (int i = 0; i < subjects.length ; i++) {
			System.out.printf("%s점수를 입력하세요 \n",subjects[i]);
			scores[i]  = sc.nextInt();
		}

		for (int i = 0; i < subjects.length; i++) {
			System.out.printf("%s점수는 %d \n",subjects[i], scores[i]);
		}
		
	}

}
