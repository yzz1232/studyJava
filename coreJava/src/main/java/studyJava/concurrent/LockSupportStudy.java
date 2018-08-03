package studyJava.concurrent;

import java.util.concurrent.locks.LockSupport;

public class LockSupportStudy {
	
	public static void main(String[] args) {
		Runnable run = ()->{
			System.out.println("1");
			LockSupport.park();
			System.out.println("3");
		};
		
		Thread t = new Thread(run);
		t.start();
		LockSupport.unpark(t);
		System.out.println("2");
	}
	
}
