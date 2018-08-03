package studyJava.concurrent;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockStudy {
	
	private static 	ReentrantLock lock = new ReentrantLock(true);
	
	public static void main(String[] args) {
		
	
		Runnable runable1 = ()->{ 
			lock.lock(); 
			try {
				Thread.sleep(3000L);
				System.out.println("1213");
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		};
		
		Runnable runable2 = ()->{ 
			lock.lock(); 
			try {
				//Thread.sleep(3000L);
				System.out.println("2234");
			} catch (Exception e) {
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		};
		
		Thread t1 = new Thread(runable1);
		Thread t2 = new Thread(runable2);
		
		t1.start();
		t2.start();
		//t3.start();
		
		//LockSupport
		//ReadWriteLock
	}
	
	
	
}
