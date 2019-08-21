package homework04_grade;

import javax.swing.JOptionPane;

public class GradeController {

	public static void main(String[] args) {
		Grade grade = new Grade();
		GradeService gs = new GradeService();
		while(true) {
				
				switch (JOptionPane.showInputDialog("0. 종료 1. 점수 입력  2. 총점 3. 평균 ")) {
				case "0": JOptionPane.showMessageDialog(null, "=============종료===========");  return;
				case "1": JOptionPane.showMessageDialog(null, "===========점수입력=============");
							grade.setKor(Integer.parseInt((JOptionPane.showInputDialog("국어점수를 입력하세요  :   "))));   
							grade.setEng(Integer.parseInt((JOptionPane.showInputDialog("영어점수를 입력하세요  :   "))));   
							grade.setMath(Integer.parseInt((JOptionPane.showInputDialog("수학점수를 입력하세요  :   "))));   
								JOptionPane.showMessageDialog(null, grade.toString() );
						break;
						
				case "2": JOptionPane.showMessageDialog(null, "===========총점=============");
							JOptionPane.showMessageDialog(null, gs.getTotal(grade) );
							break;
				case "3": JOptionPane.showMessageDialog(null, "===========평균=============");
							JOptionPane.showMessageDialog(null, gs.getAvg(grade));
							break;
				}
			}//while
		}

	}
