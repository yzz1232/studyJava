package studyJava.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;



public class Context {
	
	private ReentrantLock lock = new ReentrantLock();
	
	public synchronized void method(){
		//lock.lock();
		System.out.println("do atomic operation");
		try{
			 Thread.sleep(3000l);
		}catch(InterruptedException e){
			
		}finally{
			//lock.unlock();
		}
	}
	
	static class MyThread implements Runnable {
		
		private Context context;
		
		public MyThread(Context context) {
			this.context = context;
			
		}

		public void run() {
			context.method();
			
		}
		
		public static void main(String[] args) {
		    Context context = new Context();
		    ExecutorService executorService = Executors.newFixedThreadPool(5);
		    for(int i = 0; i < 5; i ++ ) {
		        executorService.submit(new MyThread(context));
		    }
		}
	}
	
	
}
