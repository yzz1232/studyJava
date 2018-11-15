package studyJava.java8.lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lambda1 {
	
	public static void main(String[] args) {
		Test test = ()->System.out.println("223");
		test.test();
		
		List<String> list = Arrays.asList("1");
		
		list.forEach(System.out::println);
		list.forEach(Lambda1::new);
		Map<String,String> map = new HashMap<>();
		map.size();
	}
	
	public Lambda1(String t){
		System.out.println(t);
	}
	
}
