package chap01;
import java.util.Scanner;

public class SumWhile {

	public static void main(String[] args) {
		Scanner stdInScanner = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값:");
		int n = stdInScanner.nextInt();
		
		int sum = 0; //합을 저장하는 변수 sum
		int i = 1;  //반복을 제어하기 위한 변수 i
		
		while ( i <= n) {  //사전 판단 반복 구조
			sum += i;
			i++;
		}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}
