package studyJava.algorithm;

import java.util.LinkedHashMap;

import com.alibaba.fastjson.JSON;

public class LinkedHashMapStudy {
	
	public static void main(String[] args) {
		LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
		
		linkedHashMap.put("1", "1");
		linkedHashMap.put("2", "2");
		linkedHashMap.put("3", "3");
		linkedHashMap.put("4", "4");
		
		
		//linkedHashMap.entrySet()
		
		System.out.println(JSON.toJSON(linkedHashMap));
		
	}
	
}
