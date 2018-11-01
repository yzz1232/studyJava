package studyJava.algorithm;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerStudy {
	
	public static void main(String[] args) {
		AtomicInteger integer = new AtomicInteger();
		System.out.println(integer.getAndSet(10));
	}
	
}	


