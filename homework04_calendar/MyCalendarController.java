package homework04_calendar;

import javax.swing.JOptionPane;

public class MyCalendarController {

	public static void main(String[] args) {

		MyCalendar myCal = new MyCalendar();
		MyCalendarService myCalSer = new MyCalendarService();

		while(true) {

			JOptionPane.showMessageDialog(null, "===========MyCalendar=============");
			switch (JOptionPane.showInputDialog("1. LeapYear  2. MonthEndDay ")) {
			case "0": JOptionPane.showMessageDialog(null, "=============종료===========");  
					return;
					
			case "1": JOptionPane.showMessageDialog(null, "===========LeapYear=============");
					myCal.setYear(Integer.parseInt((JOptionPane.showInputDialog("윤년을 판단할 연도를 입력하세요 :   "))));   
					JOptionPane.showMessageDialog(null, myCalSer.leapYear(myCal) );
					break;

			case "2": JOptionPane.showMessageDialog(null, "===========MonthEndDay=============");
					myCal.setMonth(Integer.parseInt((JOptionPane.showInputDialog("마지막 날을 확인하고 싶은 달을 입력하세요  :   "))));   
					JOptionPane.showMessageDialog(null, myCalSer.monthEndDay(myCal) );
					break;
			}
		}//while
	}

}
