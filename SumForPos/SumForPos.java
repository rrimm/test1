import java.util.Scanner;

public class SumForPos {

	public static void main(String[] args) {
		Scanner stdInScanner = new Scanner(System.in);
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {                                          //사후 판단 반복문(루프 본문이 반드시 한 번은 실행)
			System.out.println("n의 값: ");
			n=stdInScanner.nextInt();
		}while(n<=0);
		
		int sum=0;
		
		for(int i=1;i<=n;i++)
			sum+=i;
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");

	}

}
