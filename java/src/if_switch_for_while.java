
public class if_switch_for_while {

	public static void main(String[] args) {

		int result = 1;
		switch(result) {
		case 1 : 
			System.out.println("진짜 되는건가?");
			break;
	}
		//Math.random() = 0.0과 1.0사이의 임의의 double값을 반환 
		//퀴즈 1~10사이의 난수를 20개 출력하시오 
		for(int i = 1; i <= 20; i++) {
			System.out.println((int)(Math.random()*10)+1);//0~9사이값 출력!!!
		}
		
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			sum += i;
			System.out.printf("1부터%2d 까지의 합 : %2d%n", i, sum);
		}System.out.println("총합계  :  "+sum);
		
		int z = 5;
		while(z-- != 0) {
			System.out.println(z + "화이팅");
		}
	}

}
