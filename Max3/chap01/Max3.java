package chap01;
import java.util.Scanner;

public class Max3 {

	public static void main(String[] args) {
		Scanner mirim = new Scanner(System.in);  // 키보드와 연결된 표준 입력 스트림(System.in)에서 문자나 숫자를 꺼냄
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : "); int a = mirim.nextInt();
		System.out.print("b의 값 : "); int b = mirim.nextInt();
		System.out.print("c의 값 : "); int c = mirim.nextInt();
		int max = a;
		if(b>max) max = b;
		if(c>max) max = c;  // 순차적 구조
		
		System.out.println("최댓값은 "+ max + "입니다.");
		

	}

}
