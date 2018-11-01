package studyJava.algorithm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class FutureStudy {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<Integer> call = ()->{
			return 1;
		};
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);

		Future<Integer> future =  executorService.submit(call);
		System.out.println(future.get());
		executorService.shutdown();
		
	}
	
}
