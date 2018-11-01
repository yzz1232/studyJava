package study.redis;

import java.util.Date;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 *  缘分一道桥
    * @Title: RedissionStudy.java  
    * @Package study.redis  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author zzy 
    * @date 2018年8月6日
 */
public class RedissionStudy {
	
	static RedissonClient redisson;
	
	static{
		Config config = new Config();
		config.useSingleServer().setAddress("redis://10.200.133.28:6479").setPassword("22pBD7.dubbo");
		redisson = Redisson.create(config);
		
		RLock lock = redisson.getLock("");
		lock.lock();
		
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("1");
		Runnable run1 = ()->{
			RLock lock  = redisson.getLock("2");
			if(lock.tryLock())
			try {
				Thread.sleep(5000L);
				System.out.println(new Date().getTime()+"1");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				lock.unlock();
			}
		};
		
		Runnable run2 = ()->{
			System.out.println("2");
			RLock lock  =  redisson.getLock("2");
			if(lock.tryLock())
				try {
					Thread.sleep(5000L);
					System.out.println(new Date().getTime()+"2");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
		};
		
		
		Thread thread1 = new Thread(run1);
		Thread thread2 = new Thread(run2);
		
		thread1.start();
		thread2.start();
		
		
		
	}
	
	
}
