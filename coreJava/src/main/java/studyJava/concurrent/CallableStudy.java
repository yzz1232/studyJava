package studyJava.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableStudy {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		Callable<String> callable = ()->{
			return "你好";
		};
		
		FutureTask<String> task = new FutureTask<String>(callable);
		
		new Thread(task).start();
		
		System.out.println(task.get());
		
	}
	
}
