package studyJava.core.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreaPoolTest {
	
	public static void main(String[] args) {
		
		ExecutorService executorService = new ThreadPoolExecutor(5, 10, 20, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
		
		try{
			executorService.execute(new Runnable() {
				
				public void run() {
					System.out.println("zz");
					Integer.parseInt("zz");
				}
			});
		}catch(Exception e){
			System.out.println("223");
			e.printStackTrace();
		}
		
		Class clazz = new Class();
		
//		executorService.submit(new Runnable() {
//			
//			public void run() {
//				
//				try{
//					Integer.parseInt("zz");
//				}catch(Exception e){
//					e.printStackTrace();
//				}
//				System.out.println("223");
//			}
//		});
	
	}
	
}
