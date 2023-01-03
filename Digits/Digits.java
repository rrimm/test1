import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		Scanner stdInScanner = new Scanner(System.in);
		int no;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.println("입력: ");
			no = stdInScanner.nextInt();
		} while(no < 10 || no > 99);   //||논리연산자는 왼쪽 피연산자를 평가한 값이 true면  오른쪽 피연산자는 평가하지 않음
		
		System.out.println("변수의 no의 값은 "+no+"가 되었습니다.");

	}

}
