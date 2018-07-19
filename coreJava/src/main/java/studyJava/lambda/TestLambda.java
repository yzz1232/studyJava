package studyJava.lambda;

import java.util.ArrayList;
import java.util.List;

public class TestLambda {
	
	public static void main(String[] args) {
			
		Runnable r = ()->{
			System.out.println("1");
		};
		
		List<String> list = new ArrayList<String>() {{
		    add("A");
		    add("B");
		    add("C");
		}};
		
		list.add("22");
		
		String sss = "";
		
		list.forEach(
			System.out::println
		);
		
		TestHello hello = ()->{
			System.out.println("223");
		};
		
		hello.say();

	}
	
	
	void studyStream(){
		
	}
	
	
}
