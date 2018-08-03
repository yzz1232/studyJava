package studyJava.concurrent;

public class InterruptStudy {
	
	public static void main(String[] args) throws InterruptedException {
		Runnable run = ()->{
			
//			while(!Thread.currentThread().isInterrupted()){
//				System.out.println(Thread.currentThread().isInterrupted());
//			}
			
			try{
				Thread.currentThread().sleep(2000L);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		};
		
		
		Thread thread = new Thread(run);
		thread.start();
		
		Thread.sleep(1000L);
		
		thread.interrupt();
		
		
		
	}
	
//	static class Example extends Thread{
//		
//		volatile boolean stop = false;  
//		
//		public void run(){
//			while(!stop){
//				System.out.println("running.....");
//			}
//			
//			try {
//				Thread.currentThread().sleep(2000L);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			System.out.println("1");
//		}
//		
//		public static void main(String[] args) throws InterruptedException {
//			
//			Example thread = new Example();
//			System.out.println("starting thread ......");
//		    thread.start();
//			
//			Thread.sleep(1000L);
//			
//			thread.stop = true;  
//			thread.interrupt(); 
//		}
//		
//		
//	}
	
	
}
