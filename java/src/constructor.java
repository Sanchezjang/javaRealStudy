

class Date_1{
	int value;
}
class Date_2{
	int value;
	Date_2(int x){
		value = x;
	}
}
public class constructor {

	public static void main(String[] args) {
		// 이름이 클래스 이름과 같아야 한다.
		// 리턴값이 없다.(void안붙임)
		Date_1 d1 = new Date_1();// 컴파일잘됨
		Date_2 d2 = new Date_2(1);//매개변수 1이 없으면 컴파일 오류남 꼭 넣어줘야함 
		
	}

}
