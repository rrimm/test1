
public class CharToCode {

	public static void main(String[] args) {
		char ch = 'A';
		int code = (int)ch;
		
		System.out.printf("%c=%d(%#X)%n", ch, code, code);
		
		char hch = '가';
		int code2 = (int)hch;
		System.out.printf("%c=%d(%#X)%n", hch, code2, code2);

	}

}
