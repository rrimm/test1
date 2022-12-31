
public class ArrayEx11 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		int[] counter = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			numArr[i] = (int) (Math.random() * 10); // 0~9 임의의 수 배열에 저장
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for (int i=0; i < numArr.length ; i++) {
			counter[numArr[i]]++;  // i의 값이 0인 경우를 가정하면 numArr[0]의 값이 4라고 할 때 counter[4]의 값을 1 증가시킴
		}
		
		for(int i=0; i < numArr.length; i++) {
			System.out.println(i + "의 개수 :"+ counter[i]); //배열 counter의 각 요소에 해당 인덱스의 값이 며 번 나타났는지 알 수 있는 값 저장
		}

	}

}
