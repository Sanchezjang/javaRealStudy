class MyParent{
	private int prv;	//같은클래스
	int dft;			//같은패키지
	protected int prt;	//같은패키지 + 자손(다른패키지)
	public int pub;		//접근제한없음.
	
	public void name() {
		System.out.println(prv);	//OK
		System.out.println(dft);	//OK
		System.out.println(prt);	//OK
		System.out.println(pub);	//OK
	}
}


public class MyParentTest {

	public static void main(String[] args) {
		MyParent p = new MyParent();
		//System.out.println(p.prv);//에러 같은클래스가 아니라서 에러남!!!!	
		System.out.println(p.dft);
		System.out.println(p.prt);
		System.out.println(p.pub);
		
		
		
	}

}
