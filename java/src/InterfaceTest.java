class A {
	public void method(I i) {//인터페이스I를 구현한 넘들만 들어와라.
		i.method();
	}
}

interface I{
	public void method();
}

class B implements I{
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I{
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}
public class InterfaceTest {
	//인터페이스 장점 개발시간을 단축할수 있다.
	// 변경에 유리한 유연한 설계가 가능하다. 
	// 표준화가 가능하다.
	// 서로 관계없는 클래스들의 관계를 맺어 줄수 있다. 인터페이스
	public static void main(String[] args) {
		A a = new A();
		a.method(new C());
	}

}
