
public class ArrayEx7 {

	public static void main(String[] args) {
		int[] numArr = new int[10];  //길이가 10인 배열 numArr 생성
		
		for(int i=0; i < numArr.length ; i++) {
			numArr[i] = i;  // 배열을 0~9의 숫자로 초기화
			System.out.print(numArr[i]);  //출력
		}
		System.out.println();
		
		for(int i=0; i < 100; i++) {
			int n = (int)(Math.random() * 10);  // 0~9중의 한 값을 임의로 얻는다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = tmp;    //배열의 임의의 위치에 있는 값과 배열의 첫번째 요소인 numArr[0]의 값을 교환하는 일을 100번 반복
		}
		
		for(int i = 0; i<numArr.length;i++)
			System.out.print(numArr[i]);

	}

}
