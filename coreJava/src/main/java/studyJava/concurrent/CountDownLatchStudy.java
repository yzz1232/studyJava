package studyJava.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchStudy {
	

	
	static CountDownLatch countDown = new CountDownLatch(5);
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable run = ()->{
			try {
				Thread.sleep(1000L);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			countDown.countDown();
		};
		
		
		countDown.countDown();
		countDown.countDown();
		countDown.countDown();
		countDown.countDown();
		
		new Thread(run).start();
		
		countDown.await();
		
		
		
		System.out.println("1213");
		
		
	}
	
}
