package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ListMapSet {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<String,String>();
		HashSet<String> set = new HashSet<String>();
		ArrayList<Object> list = new ArrayList<Object>();
		/*맵은키값 중복안됨, 밸류값은 중복가능
		 * 
		 * */
		map.put("장한진", "23");
		map.put("장한진", "5");
		map.put("김자연", "5");
		list.add(map);
		System.out.println(list);
		
		/*1. 요소의 저장 순서를 유지하지 않습니다.

		 2. 같은 요소의 중복 저장을 허용하지 않습니다.*/
		set.add("이순신");
		set.add("장보고");
		set.add("세종대왕");
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println("set의담긴값  :  "+iter.next());
		}
		/*배열이지만 동적으로 길이 조정가능함
		 * 많이 쓰인
		 * */
		list.add("1");
		list.add("2");
		list.add("3");
		
		
	}

}
