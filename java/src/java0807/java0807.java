package java0807;

import java.util.Hashtable;
import java.util.Map;

public class java0807 implements Dto {
	
	@Override
	public void aabb() {
		// TODO Auto-generated method stub
		
	}
	static void name() {
		System.out.println("내이름은 이순신입니다.");
	}
	void name1() {
		System.out.println("내이름은 홍길동입니다.");
	}
	
	public static void main(String[] args) {
		
		java0807.name();
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		
		for(int i = 0; i<100; i++){
			ht.put(i+"번", i+"값");
			System.out.println(ht);
		}
		
		int a = ht.size();
		System.out.println(a);
		
		for(Map.Entry<String, String> e : ht.entrySet())
			System.out.println("key  :  " + e.getKey()+",  Value : "+ e.getValue());
		
	}
}
