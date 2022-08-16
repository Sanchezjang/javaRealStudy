
public class Operator {

	public static void main(String[] args) {
		int x = 5;
		int y = 4 * x + 3; // x값이 5니까 , y의값은 23이 된다.
		System.out.println(y); //y의 값인 23이 화면에 출력된다.
		int i = 100;
		byte c = (byte) i;//int 값이 더 크기때문에 값손실이 발생할수 있으니 에러가 
		//연산에서는 소수점이하를 계산하려면 어느 한쪽을 실수로 만들어줘야 한다. 
		int a = 1_000_000;// 1백만 = 10의 6제곱
		int b = 2_000_000;// 2백만 = 10의 6제곱
		//long v = a*b; 잘못된값이 출력된다. 형변환 안됨.
		long v = (long)a * b;// 둘중하나의 값을 long으로 잡아주면 가능하다. 
		System.out.println(v);
	}

}
