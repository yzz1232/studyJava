package studyJava.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExecuteStudy {
	
	static int i=0;
	
	static CountDownLatch count = new CountDownLatch(5);
	
	static ThreadLocal<String> threadLocal = new ThreadLocal<>();
	
	public static void main(String[] args) throws InterruptedException {

		Runnable run = ()->{
			threadLocal.set("12");
			System.out.println("test");
		};
		
//		Runnable run1 = ()->{
//			System.out.println(threadLocal.get());
//			System.out.println("test1");
//		};
		
		ExecutorService executor =  Executors.newFixedThreadPool(1);
		
		System.out.println(-1 << 29);
	
		
		executor.execute(run);
		//executor.execute(run1);
		

			
			
	}
	
	
}
