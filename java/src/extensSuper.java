
class Point1{
	int x;
	int y;
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;
	}
	String getLocation() {
		return "x : " + x + ", y : "+y;
	}
}
	class Point3D1 extends Point{
		int z;
		Point3D1(int x, int y,int z) {
			this.x = x;
			this.y = y;
			this.z = z;
		}
		String getLocation() {
			return "x : " + x + ", y : "+ y +", z : " + z;
		}
	}

public class extensSuper {

	public static void main(String[] args) {
		Point3D1 p3 = new Point3D1(1, 2, 3);
		System.out.println(p3.x);
	}

}
