package studyJava.concurrent;

import java.util.concurrent.locks.LockSupport;

public class ThreadTest {
	
	static Object object = new Object();
	
	static boolean flag = false;
	
	public static void main(String[] args) {
		
		Runnable produce = ()->{	
			//synchronized (object) {
				System.out.println("进入生产者线程");
                System.out.println("生产");
                
                try{
                	Thread.sleep(2000L);
                	flag = true;
                	//object.notifyAll();
                	LockSupport.unpark(Thread.currentThread());
                	System.out.println("退出生产者线程");
                }catch(Exception e){
                	
                }
			//}
			
		};
		
		Runnable consume = ()->{
			//synchronized (object) {
				System.out.println("进入消费者线程");
				while(!flag){
					try{
						System.out.println("等待");
						//object.wait();
						
						LockSupport.park();
						System.out.println("结束等待");
					}catch(Exception e){
						
					}
				}
				System.out.println("wait flag :" + flag);
                System.out.println("消费");
                System.out.println("退出消费者线程");
                flag = false;
                
   
			//}
		};
		
		
		Thread t1 = new Thread(produce);
		Thread t2 = new Thread(consume);
		
		t2.start();
		t1.start();
		
		
	}
	
}
