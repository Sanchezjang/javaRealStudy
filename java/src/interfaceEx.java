abstract class Unit2{
	int x , y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
}

interface Fightable{//인터페이스의 모든메서드는 퍼블릭!!예외없이!
	void move(int x, int y);//public abstract가 생략됨
	void attack(Fightable f);//public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable{
	//오버라이딩규칙 :조상보다 접근제어자가 좁으면안된다.
	@Override
	public void attack(Fightable f) {
		System.out.println(f+"를 공격");
	}
	@Override
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]로 이동");
	}
	Fightable getFightable() {
		Fighter f = new Fighter();//Fighter를 생성해서 반환
		return f;
	}
}
public class interfaceEx {

	public static void main(String[] args) {
//매겨변수가 인터페이스명일 경우 인터페이스를 구현한 클래스의 인스턴스만 가능하다.
		Fighter f = new Fighter();
		Fightable f1 = f.getFightable();
		f.move(100, 200);
		Fighter f2 = new Fighter();
		f.attack(f2.getFightable());
		f.getFightable();
	}
/*인터페이스 장점 
	- 두 대상(객체)간의 연결, 대화, 소통을 돕는 중간열할을 한다.
	- 선언(설계)와 구현을 분리 시킬수 있게 한다.
*/	
}
 