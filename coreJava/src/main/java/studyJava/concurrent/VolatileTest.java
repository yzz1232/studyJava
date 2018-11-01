package studyJava.concurrent;

public class VolatileTest {
	
	private static  int value = 2;
	
	public static void main(String[] args) {
		Runnable r1 = ()->{
			
			for(int i=0;i<10;i++){
				while(value==2){
					
				}
				System.out.println(i);
				value = 2;	
			}
		};
		
		Runnable r2 = ()->{
			
			for(int i=10;i<20;i++){
				while(value==1){
					
				}
				System.out.println(i);
				value = 1;	
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		t1.start();
		t2.start();
	}
	
}
