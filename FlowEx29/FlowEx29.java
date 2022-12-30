
public class FlowEx29 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			System.out.printf("i=%d ", i);
			
			int tmp = i;  //i가 아닌 tmp에 지정하는 이유: 변수 i는 for문의 제어에 사용된느 변수이기 때문
			
			do {
				   // tmp%10이 3의 배수인지 확인(0 제외)
				if(tmp%10%3==0 && tmp%10!=0)
					System.out.print("짝");
			} while ((tmp/=10)!=0);
			
			System.out.println();
		}

	}

}
