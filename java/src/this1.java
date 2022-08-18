
class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		//Car("white","auto",4);
		this("white","auto",4);
	}

	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	
	
}

public class this1 {

	public static void main(String[] args) {
		Car c = new Car("black","auto",3);
		Car c1 = new Car();
		System.out.println(c.color);
		System.out.println(c1.color);
	}

}
