package step1;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Month {

	public static void main(String[] args) {
		
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		int month = 0;
		String now= ""; 
		String monthString = "";
		
		now = sdf.format(date);
		month = Integer.parseInt(now.substring(5, 7));
		
		
		switch(month){
			case 1:  monthString = "January";
			break;
			case 2:  monthString = "February";
			break;
			case 3:  monthString = "March";
			break;
			case 4:  monthString = "April";
			break;
			case 5:  monthString = "May";
			break;
			case 6:  monthString = "June";
			break;
			case 7:  monthString = "July";
			break;
			case 8:  monthString = "August";
			break;
			case 9:  monthString = "September";
			break;
			case 10: monthString = "October";
			break;
			case 11: monthString = "November";
			break;
			case 12: monthString = "December";
			break;
			default: monthString = "Invalid month";
			break;
		}
		
		System.out.println(String.format(">>>오늘은 %s입니다", monthString) );
	}

}
