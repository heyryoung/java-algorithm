package study03;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {

		while(true) {

			int flag = 0;
			Scanner sc = new Scanner(System.in);
			Student student = new Student();

			System.out.println("메뉴 :  0. 종료  1. BMI  2. Ranking  3.HowMuch  4.ReportCard");
			flag = sc.nextInt();

			switch (flag) {
			case 0: System.out.println("종료"); return;
			case 1: System.out.println("BMI");
			student.getBmi();
			break;
			case 2: System.out.println("Ranking"); 
			student.getRank();
			break;
			case 3: System.out.println("HowMuch"); 
			student.getHowMuch();
			break;
			case 4: System.out.println("ReportCard"); 
			student.getReportCard();
			break;
			}


		}//while

	}

}
