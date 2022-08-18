
public class OOPex1 {

	public static void main(String[] args) {
		Tv t;			//티비인스턴스를 참조하기 위한 변수 t선
		t = new Tv();	//티비인스턴스를 생성한다.
		t.channel = 7;	//티비인스턴스의 멤버변수channel의 값 7변
		t.channelDown();//티비인스턴스의 메서드channelDown()을 호출한다.
		t.channelDown();
		System.out.println("현재 채널은  "+t.channel+"  번입니다.");
		
		Tv t1 = new Tv();
		t1.channel = 1;
		
		
	}

}
class Tv {
	//Tv의 속성(멤버변수)
	String color;
	static boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}
class Variables{
	int iv; //인스턴스변수
	static int cv;//클래스변수(static변수, 공유변수)
	
	void method() {
		int lv = 0; //지역변수 <-메서드 영
	}
}