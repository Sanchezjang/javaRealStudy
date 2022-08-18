//자바는 단일 상속만을 허용한다.(c++은 다중상속 허용)
class Point{
	int x;
	int y;
}
class Point3D{
	Point p = new Point();
	int z;
}
class Tv1{
	boolean power;
	int channel;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}
class SmartTv extends Tv1{
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Point3D p = new Point3D();
		int xx = p.p.x = 1;
		System.out.println(xx);
	}

}