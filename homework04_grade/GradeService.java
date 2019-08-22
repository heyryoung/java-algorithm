package homework04_grade;

public class GradeService {
	
	public String getTotal(Grade grade) {
		String result = "";
		
		grade.setTotal((grade.getEng() + grade.getKor() + grade.getMath()));
		
		result = String.format("총점은 %.2f입니다" ,grade.getTotal());
		
		return result;
	}
	
	public String getAvg(Grade grade) {
		String result = "";
		grade.setAvg((grade.getTotal()/3));
		
		result = String.format("총점은 %.2f입니다" ,grade.getAvg());
		
		return result;
		
	}
	
	
	

}
