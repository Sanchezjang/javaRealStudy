package java0816;

public class PrinfEx01 {

	public static void main(String[] args) {
		
		System.out.println(10/3);//둘다 정수 나눔이기때문에 값은 정수값인 3이나온다.
		System.out.println(10.0/3);//10.0이 실수 값이기 때문에 실수값으로 3.33333335가 출력된다.
		
		System.out.println(0x1A);//10진수로만 출력된다. 16진수로 출력하려면 printf()메소드 사용해야한다.
		System.out.printf("%.2f%n", 10.0/3);// 2f는 소수점 둘째자리까지 출력하는것	%n -> 개행처
		System.out.printf("%d%n", 0x1A);// 10진수 출력 값 : 26
		System.out.printf("%X%n", 0x1A);// 16진수 출력 값 : 1A	
		
		//더 많은 지시자는 JavaAPI -> Formatter
		System.out.printf("age : %d year : %d%n", 14, 2017);
		System.out.printf("%s%n",Integer.toBinaryString(15));///1111 2진
		//8진수에는 0이 16진수에는 0x 접두사가 붙는다.
		System.out.printf("%#o%n",15);//017
		System.out.printf("%#x%n",15);//0xf
		
		//실수 출력을 위한 지시자 %f - 지수형식(%e,간략한형식(%g)
		float f = 123.4567890f;
		System.out.printf("%f%n",f); //123.456787 6자리까지 출력 float정밀도 7자리까지만 정확함 
		System.out.printf("%e%n",f); //1.2345678e+02 지수형 double정밀도는 15자리로 더블이 디폴트값으로 많이씀 8은끝자리라반올림되서 표시
		
		System.out.printf("[%5d]%n",10); //[   10]
		System.out.printf("[%-5d]%n",10);//[10   ]
		System.out.printf("[%05d]%n",10);//[00010]
		
		double d = 1.23456789;
		System.out.printf("%.6f%n", d);
		
	}

}
