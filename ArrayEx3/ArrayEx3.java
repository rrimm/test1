
public class ArrayEx3 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i=0;i< arr.length;i++)
			arr[i] = i + 1;
		
		System.out.println("[변경전]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i < arr.length;i++)
			System.out.println("arr["+i+"]:"+arr[i]);
		
		int[] tmp = new int[arr.length*2];  // 기존 배열보다 길이가 2배인 배열 생성
		
		for(int i=0;i<arr.length;i++)
			tmp[i] = arr[i];        // arr[i]의 값을 tmp[i]에 저장
		
		arr = tmp;   // 변수 tmp에 저장된 값을 변수 arr에 저장. 기존 arr이 가리키던 배열은 더이상 사용 불가
		
		System.out.println("[변경후]");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i < arr.length;i++)
			System.out.println("arr["+i+"]:"+arr[i]);

	}

}
