package study06;

import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		
		Member mb = null;
		Service service = new Service();

		while(true) {
			
			//System.out.println("0.종료 1.JOIN 2.정보보기 3.아이디찾기 4.BMI 5.ReportCard 6. Tax ");
			
			switch (JOptionPane.showInputDialog("0.종료 1.JOIN 2.정보보기 3.아이디찾기 4.BMI 5.ReportCard 6. Tax ")) {
			case "0": JOptionPane.showMessageDialog(null, "=============종료===========");  return;
			case "1": JOptionPane.showMessageDialog(null, "===========JOIN=============");
				mb = new Member();
				//System.out.print(">> 아이디 ");
				mb.setUserId(JOptionPane.showInputDialog("ID를 입력하세요"));
	
				//System.out.print(">> 비밀번호 : ");
				mb.setUserPW(JOptionPane.showInputDialog("비밀번호를 입력하세요")); 
	
				//System.out.print(">> 이름 : ");
				mb.setUserName(JOptionPane.showInputDialog("이름을 입력하세요"));
	
				//System.out.print(">> 생년월일(예) 1990-05-05 : ");
				mb.setUserBD(JOptionPane.showInputDialog("생년월일을 입력하세요 (예) 1990-05-05 :"));
	
				//Boolean.parseBoolean(JOptionPane.showInputDialog("성인여부를 입력하세요 (성인true,미성년false) :"));
				//System.out.print(">> 성인여부(성인true,미성년false) : ");
				mb.setAdult(Boolean.parseBoolean(JOptionPane.showInputDialog("성인여부를 입력하세요 (성인true,미성년false) :")));
	
				//System.out.print(">> 키(소수점 첫째자리까지) : ");
				mb.setHeight(Double.parseDouble(JOptionPane.showInputDialog("키를 입력하세요(소수점 첫째자리까지) :")));
	
				//System.out.print(">> 몸무게(소수점 첫째자리까지) : ");
				mb.setWeight(Double.parseDouble(JOptionPane.showInputDialog("몸무게를 입력하세요 (소수점 첫째자리까지):")));
	
				//System.out.print(">> 혈액형(A) : ");
				mb.setUserBt(JOptionPane.showInputDialog("혈액형을 입력하세요 "));
				
				//System.out.print(">> 연봉을 입력하세요 :  ");
				mb.setSal(Double.parseDouble(JOptionPane.showInputDialog("연봉을 입력하세요  :")));

				//System.out.print(">> 국어점수를  입력하세요 :  ");
				mb.setKor(Integer.parseInt(JOptionPane.showInputDialog("국어점수를 입력하세요 :")));
				//System.out.print(">> 영어점수를  입력하세요 :  ");
				mb.setEng(Integer.parseInt(JOptionPane.showInputDialog("영어점수를 입력하세요 :")));
				//System.out.print(">> 수학점수를  입력하세요 :  ");
				mb.setMat(Integer.parseInt(JOptionPane.showInputDialog("수학점수를 입력하세요 :")));
				
				
				break;
				case "2": JOptionPane.showMessageDialog(null, "===========정보보기============="); 
				//	System.out.println("=============정보보기==========="); 
				JOptionPane.showMessageDialog(null, mb.toString());
				
				//System.out.println(mb.toString());
				
				break;
				case "3": JOptionPane.showMessageDialog(null, "===========아이디 찾기============");  
					
				//System.out.println("===========아이디 찾기============"); 
				
				//System.out.println("아이디와 이름을 입력하시면 비번과 생년월일을 알려줌 ");
				JOptionPane.showInputDialog("아이디를 입력하세요");
				//String searchId = sc.next();
				//String searchName =sc.next();
				
				if (JOptionPane.showInputDialog("이름 입력하세요").equals(mb.getUserName())&& JOptionPane.showInputDialog("아이디를 입력하세요").equals(mb.getUserId())) {
					String result = String.format("찾는 비번은 : %s   생년 월일은  %s  입니다 \n\n" , mb.getUserPW(),mb.getUserBD());
					
					JOptionPane.showMessageDialog(null, result);  
					
				}else {
					JOptionPane.showMessageDialog(null, "없는 아이디 입니다.");  
				}
				
				break;
				
				
				
				case "4" : JOptionPane.showMessageDialog(null, "===========BMI============");   
					
				 JOptionPane.showMessageDialog(null, service.getBMI(mb));
				break;
				
				case "5": JOptionPane.showMessageDialog(null, "===========ReportCard============");    
					
				 JOptionPane.showMessageDialog(null, service.getReportCard(mb));
				break;
				
				
				
				case "6": JOptionPane.showMessageDialog(null, "===========Tax============"); 
					
				//System.out.println("1. 세율 변경. 2.세금 계산");
				
				
					if(Integer.parseInt(JOptionPane.showInputDialog("1. 세율 변경. 2.세금 계산"))==1) {
						
						mb.setRate(Double.parseDouble(JOptionPane.showInputDialog("세율을 입력하세요")));
					}else {
						
						JOptionPane.showMessageDialog(null, service.getTax(mb)); 
					}
						
				break;
			}
			
		}
		
	}

}
