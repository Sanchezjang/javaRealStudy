
public class array {

	public static void main(String[] args) {
		//배열은 같은 타입의 여러변수를 하나의 묶음으로 다루는것 
		//int[]	score;		//타입[]변수이름 선언 ->참조변수 선	
		//score = new int[5];	//배열을 생성(실제 저장공간을생성)
		int[] score = new int[5];//배열과 선언을 동시에 가능
		score[3] = 100;
		System.out.println("score[0]"+score[0]);
		System.out.println("score[1]"+score[1]);
		System.out.println("score[2]"+score[2]);
		System.out.println("score[3]"+score[3]);
		System.out.println("score[4]"+score[4]);
		
		int value = 100;
		System.out.println(value);
	
		int[] arr = new int[5];
		int tmp = arr.length;
		System.out.println(tmp);//배열의 길이 출력
		
		int[] num = new int[4];
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		//초기화 방법
		int[] num1 = new int[] {50,60,70,80,90};
		int[] num2 = {50,60,70,80,90};
	}

}
