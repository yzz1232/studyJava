package studyJava.algorithm;

import static java.util.concurrent.TimeUnit.SECONDS;

import java.time.Instant;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.google.common.util.concurrent.RateLimiter;




public class RateLimiterStudy {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		RateLimiter limiter = RateLimiter.create(1);
		
		limiter.tryAcquire();
		
		Runnable run = ()->{
			double acquire = limiter.acquire(1);
			limiter.tryAcquire();
			System.out.println("获取令牌成功!,消耗=" + acquire+" "+ Instant.now().toEpochMilli());
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++){
			
			System.out.println(i);
			executorService.execute(run);
			executorService.submit(task);
		}
		
		executorService.shutdown();
	}
	
	
}
