
public class ArrayEx1 {

	public static void main(String[] args) {
		int[] score = new int[9];    // 배열의 길이 = 배열의 요소 개수
		int k = 1;
		
		score[0]=50;
		score[1]=60;
		score[k+1]=70;
		score[3]=80;
		score[4]=90;
		score[5]=100;
		score[6]=110;
		score[7]=120;
		score[8]=130;
		
		int tmp = score[k+2] + score[4];
		
		for(int i=0;i<9;i++) {
			System.out.printf("score[%d]:%d%n",i, score[i]);
		}
		
		System.out.printf("tmp:%d%n", tmp);
		System.out.printf("score[%d]:%d%n",10,score[10]);

	}

}

// 배열의 길이
// int[] arr = new int[5]; 길이가 5인 int 배열
// int tmp = arr.length; arr.length의 값은 5이고 tmp에 5가 저장된다. 
// 배열은 한 번 생성하면 길이를 변경할 수 없으므로 배열이름.length(상수) 변경 불가. 
// 하지만 그렇기 때문에 배열의 길이를 변경했을 때 배열이름.length는 자동으로 변경되므로 수정할 필요가 없어 편리하다. 