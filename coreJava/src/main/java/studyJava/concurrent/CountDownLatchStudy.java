package studyJava.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchStudy {
	

	
	static CountDownLatch countDown = new CountDownLatch(3);
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable run1 = ()->{
			System.out.println("t1 start ......");
			countDown.countDown();
		};
		
		Runnable run2 = ()->{
			System.out.println("t2 start ......");
			countDown.countDown();
		};
		
		
		
		Runnable run3 = ()->{
			System.out.println("t3 start ......");
			countDown.countDown();
		};
		
		
	
		
		new Thread(run1).start();
		new Thread(run2).start();
		new Thread(run3).start();
		
		countDown.await();
		System.out.println("test ......");
		
		
		
		
	}
	
}
