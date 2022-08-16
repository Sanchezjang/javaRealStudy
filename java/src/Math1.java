
public class Math1 {

	public static void main(String[] args) {

	 double pi = 3.141592; 
	 
	 System.out.println(pi);
	 System.out.println(pi*1000);//3141.592
	 System.out.println((int)pi*1000);//3000 ( )안쳐서나온값
	 System.out.println((int)(pi*1000));//3000 ( )쳐서 나온값
	 
	 System.out.println(Math.round(pi*1000));//round()는 반올림하는 메소드이다.
	 System.out.println(Math.round(pi*1000)/1000);//3
	 System.out.println(Math.round(pi*1000)/1000.0);//3.142
	 
	 //나머지 연산자 %
	 int x = 10;
	 System.out.println(x%3);// 나머지 값 1출력
	 
	 //비교연산자 !!문자열비교는 == 대신 equals()메소드를 사용해야 한다.
	String str1 = "abc";
	String str2 = "abc";
	System.out.println(str1 == str2); //true
	System.out.println(str1.equals(str2));//true
	
	String str3 = new String("abc");
	String str4 = new String("abc");
	System.out.println(str3 == str4);//false
	System.out.println(str3.equals(str4));//true
		
	//논리연산자 && ||
	// ||(OR결합) 피연산자중 어느 한쪽이 트루이면 트루를 결과로 얻는다.
	// &&(AND연산자) 피연산자 양쪽 모두 트루여야 트루를 결과로 얻는다.
	
	char ch = 'D';
	System.out.println(ch < 'a' && ch > 'z');//false
	
	//조건 연산자  ?  : 
	//조건식의 결과에 따라 연산결과를 달리한다.
	x = 10;
	int y = 9;
	int result = (x > y) ? x : y ; //괄호생략가능 가독성때문에 
	
	System.out.println(result);
	
	
	}

}
