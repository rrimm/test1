import java.util.Scanner;

public class ForTest1 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.println("1부터 n까지의 정수 합을 가우스 덧셈 방법을 이용하여 구합니다.");
		System.out.println("n의 값은: ");
		
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n%2==0) {
				sum = (1+n)*(n/2);
			}else {
				sum = (1+n)*(n/2)+((1+n)/2);
				
			}
			}
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		}
			

}
