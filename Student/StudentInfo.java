
public class StudentInfo {

	protected String dept, stdNo, name;   //protected는 접근 제어자로서 private 접근 제어자처럼 외부에서 접근할 수 없도록 하면서 이 멤버를 상속받는 자식 클래스에서는 사용할 수 있도록 접근 권한을 제어함
	StudentInfo(String dept, String stdNo, String name){
		this.dept = dept;
		this.stdNo = stdNo;
		this.name = name;
		
	}
	public void getStdInfo() {
		System.out.println("** 학생 정보 출력 **");
		System.out.println("학과 : "+dept);
		System.out.println("학번 : "+stdNo);
		System.out.println("이름 : "+name);
	}

}

class StudentScore extends StudentInfo{  //StudentInfo 클래스를 상속받는 StudentScore 클래스에 대한 선언
	private int kor, eng, math, sum;
	private double ave;
	StudentScore(String dept, String stdNo, String name, int kor, int eng, int math){
		super(dept, stdNo, name); // 부모클래스의 데이터 멤버에 대한 초기화
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.sum = 0;
		this.ave = 0.0;
		
	}
	
	public int getSum() {
		sum = kor + eng + math;
		return sum;
		
	}
	public double getAve() {
		ave = sum/3.0;
		return ave;
	}
	public void getStdInfo() {
		super.getStdInfo();
	}
	public void getStdScore() {
		System.out.println("** 학생 점수 출력 **");
		System.out.println("국어 : "+kor);
		System.out.println("영어 : "+eng);
		System.out.println("수학 : "+math);
		System.out.println("총점 : "+getSum());
		System.out.println("평균 : "+getAve());
	}
}

class Ex_Student{
	public static void main(String args[]) {
		StudentInfo s_i = new StudentInfo("컴퓨터과학과", "20072135", "홍길동");
		StudentScore s_s = new StudentScore("컴퓨터과학과", "20072140", "홍길순", 91, 80, 95);
		
		
		s_i.getStdInfo();  System.out.println();
		s_s.getStdInfo();
		s_s.getStdScore();
		
	}
}

