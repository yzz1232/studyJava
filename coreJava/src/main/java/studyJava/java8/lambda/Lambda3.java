package studyJava.java8.lambda;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda3 {
	
	public static void main(String[] args) {
		
		int result = add(2,num->num+2);
		int result2 = add(2,num->num*2);
		
		System.out.println("result:"+result);
		System.out.println("result2:"+result2);
		
		
		Supplier<String> supplier = String::new;
        String s = supplier.get();
		System.out.println("s:"+s);
		
		Predicate<String> predicate = ss -> ss.length() > 5;
		System.out.println(predicate.test("yzz"));
		
		
		
		
	
	}
	
	public static int add(int i,Function<Integer,Integer> funcation){
		return funcation.apply(i);
	}
	
}
