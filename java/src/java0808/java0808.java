package java0808;

public class java0808 {
	
	

	public static void main(String[] args) {
		
		People jang = null;
		People kim = null;
		
		System.out.println("피플의변수 jang의값은 : "+jang);
		System.out.println("피플의변수 kim의값은 : "+kim);
		
		jang = new People();
		kim = new People();
		
		System.out.println("피플의변수 jang의값은 : "+jang);
		System.out.println("피플의변수 kim의값은 : "+kim);
		
		Object object1 = new Object();
		Object object2 = new Object();
		Object object3 = new Object();
		Object object4 = new Object();
		
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object3.hashCode());
		System.out.println(object4.hashCode());
		
		String str1 = "안녕";
		String str2 = "안녕";
		String str3 = new String("안녕");
		String str4 = new String("안녕");
		
		String a = "&#10";
		System.out.println(str1.hashCode());
		System.out.println(a);
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
	
}
