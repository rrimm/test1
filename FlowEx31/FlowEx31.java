
public class FlowEx31 {  // 전체 반복 중 3의 배수를 제외하기 위해 continue문 작성

	public static void main(String[] args) {
		for(int i=0;i<=10;i++) {
			if(i%3==0)
				continue;
			System.out.println(i);
		}

	}

}
