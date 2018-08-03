package studyJava.concurrent;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;

public class ThreadPoolExecuteStudy {
	
	static int i=0;
	
	static CountDownLatch count = new CountDownLatch(5);
	
	public static void main(String[] args) throws InterruptedException {
		
			for(int j=0;j<5;j++){
				new ThreadTest().start();
			}
			
			count.await();
			System.out.println("i:"+i);
			

			
			
	}
	
	static class ThreadTest extends Thread{
		public void run() {
			for (int j = 0; j < 10000; j++) {
				i++;
			}
			count.countDown();

		
		}
	}
}
