
public class StringClass {

	public static void main(String[] args) {
		//String클래스 = char[] + 메서드(기능)
		//String클래스는 내용을 변경할수 없다(read only)참조변수 연결 
		
		/* 1. charAt(int index) 문자열에서 해당위치에 있는 문자를 반환한다.
		 * 2. int length() 문자열의 길이를 반환한다.
		 * 3. String substring(int from, int to) 문자열에서 해당범위의 문자열을 반환한다 (to는 포함안됨)
		 * 4. boolean equals(Object obj) 문자열의 내용이 같은지 확인한다. 같으면 결과는 true, 다르면 false
		 * 5. char[] toCharArray() 문자열을 문자배열(char[])로 변환해서 반환한다.
		 * */
		
		String str = "ABCDE";
		char ch = str.charAt(0);
		String str2 = str.substring(1, 4);
		System.out.println(ch);//A
		System.out.println(str2);//BCD
	}

}
