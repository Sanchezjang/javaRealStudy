package java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListMapSet {

	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		List<String> list = new ArrayList<>();
		
		map.put("장한진", "23");
		map.put("김자연", "5");
		
		System.out.println(map.hashCode());
		
	}

}
