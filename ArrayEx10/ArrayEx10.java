
public class ArrayEx10 {

	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		for(int i=0; i < numArr.length; i++) {
			System.out.print(numArr[i] = (int) (Math.random() * 10));  // numArr[i] = (int) (Math.random() * 10 과  System.out.print(numArr[i])를 합친 식
		}
		System.out.println();
		
		for(int i=0; i < numArr.length-1 ; i++) {
			boolean changed = false;  //자리바꿈이 발생했는지 체크
			
			for(int j=0; j < numArr.length-1-i ; j++) {   //비교작업을 반복할수록 비교해야하는 범위는 배열에서 하나씩 줄어듦.(배열에서 최댓값을 맨오른쪽으로 나열하는 행위 반복을 통해)
				//그러므로 원래는 배열의 길이에서 1이 작은 numArr.length-1을 비교해야 하는데, 매 반복마다 비교횟수가 1씩 줄어드므로 바깥쪽 for문의 제어변수 i를 빼줌
				if(numArr[j] > numArr[j+1]) {   // 오른쪽의 값이 작으면 서로 바꿈 - 버블정렬 알고리즘(근접한 값과 크기를 비교하여 자리바꿈 반복)
					int temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
					changed = true;  // 자리바꿈이 발생했으니 changed를 true로
				}
			}
			if(!changed) break;  //자리바꿈이 없으면 반복문을 벗어난다.
			
			for(int k=0; k < numArr.length; k++)
				System.out.print(numArr[k]);  //정렬된 결과를 출력
			System.out.println();
		}

	}

}
