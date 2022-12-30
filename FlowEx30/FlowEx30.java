
public class FlowEx30 {  //숫자를 1부터 계속 더해 나가서 몇까지 더하면 합이 100을 넘는지 알아내기

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break;   //무한 반복문에는 조건문과 break문이 항상 같이 사용
			++i;
			sum += i;
		}
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

	}

}
