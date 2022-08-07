package java0729;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import javax.management.loading.PrivateClassLoader;

public class java0729 {

	public static void main(String[] args) {

		int result = 0;
		
		for(int i = 0; i<100; i++) {
			if((i)%2 == 0) {
				result = result+(i+1);
			}
		}
		System.out.println(result);
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("탕수육", 25000);
		map.put("아메리카노", 2000);
		map.put("짜장", 5500);
		map.put("유린기", 25000);
		
		System.out.println("map값 : "+map.entrySet());
		System.out.println("map값 : "+map.keySet());
		System.out.println("map값 : "+map.toString());
		System.out.println("map값 : "+map.size());
		System.out.println("map값 : "+map.hashCode());
		
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack.peek());
		System.out.println(stack.toString());
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(4);
		queue.add(5);
		queue.offer(6);
		System.out.println(queue);
		
		String name = "장한진";
		String name1 = "장한진";
		
		System.out.println(name.equals(name1));
		System.out.println(name == name1);
		
		ArrayList<Integer> arr = new ArrayList<>();
		String sum = "";
		for(int i = 0; i<=2; i++) {
			sum += i;
		}System.out.println(sum);
		
		int num = 0;
		for(int i = 0; i<=10; i++){
			num += i;
		}System.out.println(num);
		
		for(int i = 2; i<=9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
		}
	}

}
