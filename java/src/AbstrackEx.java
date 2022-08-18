
public class AbstrackEx {
	/* - 미완성 설계도, 미완성메서드를 갖고 있는 클래스 
	 * */
	public static void main(String[] args) {
		Player ap = new radio();//다형성
		ap.play(100);
		ap.stop();
		
		Unit[] group = {new Marine(),new Tank()};
		
		for(int i = 0; i<group.length; i++) {
			group[i].move(100, 200);
		}
		
	}

}
abstract class Player{ // 추상클래스
	abstract void play(int pos); //추상메서드 {}이 없는 미완성 메서드 
	abstract void stop(); 		 //추상메서드 	추상클래스의 인스턴스 생성불가!
}
class radio extends Player{// 완성 클래스 객체 생성 가

	@Override
	void play(int pos) {
		System.out.println(pos + "위치부터 play합니다.");
	}

	@Override 
	void stop() {
		System.out.println("재생을 멈춥니다.");
	}
	
}
abstract class Cdp extends Player{//미완성 메서드를 하나만 완성 시켰을 경우 abstract 달아줘야 한다.

	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
	}

	
}
abstract class Unit{
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("현재위치에멈춤");}
}
class Marine extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("마린위치"+x+"이동");
	}
}
class Tank extends Unit{
	@Override
	void move(int x, int y) {
		System.out.println("탱크위치"+x+"이동");
	}
}