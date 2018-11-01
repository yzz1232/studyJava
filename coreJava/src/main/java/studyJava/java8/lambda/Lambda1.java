package studyJava.java8.lambda;

import java.util.HashMap;
import java.util.Map;

public class Lambda1 {
	
	public static void main(String[] args) {
		Test test = ()->System.out.println("223");
		test.test();
		
		Map<String,String> map = new HashMap<>();
		map.size();
	}
	
	
	
}
