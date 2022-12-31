
public class ArrayEx8 {   //로또 번호 생성 예제

	public static void main(String[] args) {
		int[] ball = new int[45]; //45개의 정수값을 저장하기 위한 배열 생성
		
		for(int i=0; i<ball.length;i++)
			ball[i] = i+1;  //ball[0]에 1이 저장된다.
		
		int temp = 0;  //두 값을 바꾸는데 사용할 임시변수
		int j = 0;   //임의의 값을 얻어서 저장할 변수
		
		for(int i=0;i<6;i++) {
			j = (int) (Math.random() * 45);  //Math.random() 함수는 그냥 출력할 경우 0.0~1.0 사이의 값 출력하므로 45를 곱해주고 int를 활용하여 정수로 전환하는 것
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for(int i=0; i<6; i++)
			System.out.printf("ball[%d]=%d%n",i,ball[i]);

	}

}
