
public class call_stack {

	public static void main(String[] args) {

		//스택(stack) : 밑이 박힌 상자. 위에 차곡차곡 쌓인다.
		//메서드수행에 필요한 메모리가 제공되는 공간
		TestClass2 test = new TestClass2();
		test.instanceMethod();
		TestClass2.staticMethod();
	}
}
class TestClass2{
	int iv;			//인스턴스 변수 
	static int cv;	//클래스 변수
	
	void instanceMethod() {		//인스턴스 메서드 
		System.out.println(iv); //인스턴스 변수를 사용할수 있다.   
		System.out.println(cv); //클래스변수를 사용할수 있다.
	}
	static void staticMethod() {
		//System.out.println(iv);에러!!! 인스턴스 변수를 사용할수 없다.  
		System.out.println(cv);//클래스 변수는 사용가능	
		//static메서드가 iv를 사용하지 못하는이유 iv객체를 생성후에 사용이 가능하기 때문에 
	}
}