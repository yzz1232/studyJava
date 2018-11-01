package studyJava.concurrent;

import java.util.Date;
import java.util.concurrent.Semaphore;

/**
 *  铁憨憨
    * @Title: SemaphoreStudy.java  
    * @Package studyJava.concurrent  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author zzy 
    * @date 2018年8月7日
 */
public class SemaphoreStudy {
	
	static Semaphore semaphore = new Semaphore(1,true);
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		Runnable run = ()->{
			try {
				semaphore.acquire();
				Thread.sleep(1000L);
				System.out.println(Thread.currentThread().getName()+":"+new Date().getTime());
				semaphore.release();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		for(int i=0;i<2;i++){
			new Thread(run).start();
		}
		
		
		
	}
	
}
