package studyJava.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class Stream1 {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("yzz","zzy","zzzzz","yyyyy");
		
		list.stream().filter(s->s.length()>3).forEach(System.out::println);
		
		list.stream().map(s->"1").forEach(System.out::println);
	}
	
}
