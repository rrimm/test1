
public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';
		char c2 = (char) (c1+1);  // 수식에 변수가 들어가 있는 경우에는 컴파일러가 미리 계산을 할 수 없으므로 형변환 필요
		// char c2 = 'a'+1;
		
		System.out.println(c2);

	}

}
