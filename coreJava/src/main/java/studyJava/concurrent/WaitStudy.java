package studyJava.concurrent;

import java.util.concurrent.locks.LockSupport;

public class WaitStudy {
	
	static Object object = new Object();
	
	public static void main(String[] args)  {
		
		Runnable r1 = ()->{
			try {
				object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Runnable r2 = ()->{
			
		};
		
		LockSupport.park();
		
	}
	
}
