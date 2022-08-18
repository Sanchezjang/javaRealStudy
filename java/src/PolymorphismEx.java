
// - 객체와 참조변수의 타입이 일치할 떄와 일치하지 않을 때의 차이?

public class PolymorphismEx {

	SmartTv s = new SmartTv();// 참조변수와 인스턴스의 타입의 차이
	//Tv t = new SmartTv();		//조상타입 참조변수로 자손 타입 인스턴스 참조
	
	//Q	참조변수의 타입은 인스턴스의 타입과 반드시 일치해야하나요?
	//A 아닙니다. 일치하는것이 보통이지만 일치 하지 않을 수도 있습니다.
	
	//Q 참조변수가 조상타입일때와 자손타입일때의 차이?
	//A 참조변수로 사용할수 있는 멤버의 갯수가 달라집니다.
	
	//Q 자손타입의 참조변수로 조상타입의 객체를 가리킬수 있나요?
	//A 아니요. 허용되지 않습니다. 
	
	class Car{}
	class FireCar extends Car{}
	class Ambulance extends Car{}
	
	public static void main(String[] args) {
		
		
		/* instanceof연산자 
			-참조변수의 형변환 가능 여부 확인에 사용, 가능하면 true반환
			-형변환전에 반드시 instanceof로 확인해야함.
		참조변수의 형변환은 왜 하나요?
		A. 참조변수(리모콘을)변경함으로써 사용할수 있는 멤버의갯수를 조절하기 위해서 
		*/
		
		
		
		//FireCar f = FireCar();
		//Car c = (Car)f;				// ok. 조상인 car 타입으로 형변환
		//FireCar f2 = (FireCar)c;	// ok. 자손인 FireCar타입으로 형변환
		//Ambulance a = new Ambulance(); // 에러. 상속관계가 아닌 클래스 간의 형변환 불가
		
	}	
		
}
