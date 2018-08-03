package studyJava.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
	
	static Runnable runnable = ()->{
		System.out.println("3");
	};
	
	static CyclicBarrier cyclicBarrier = new CyclicBarrier(2,runnable);
	
	public static void main(String[] args) {
		
		Runnable run = ()->{
			try {
				cyclicBarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("1");
			
		};
		
		Runnable run2 = ()->{
			try {
				cyclicBarrier.await();
			} catch (InterruptedException | BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("2");
			
		};
		
	    new Thread(run).start();
	    new Thread(run2).start();
		
		
		
	}
	
	
}
