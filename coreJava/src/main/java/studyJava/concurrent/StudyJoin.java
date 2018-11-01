package studyJava.concurrent;

public class StudyJoin {
	
	public static void main(String[] args)  {
		
		Runnable run3 = ()->{
			System.out.println("t3 start ......");		
		};
		
		Runnable run2 = ()->{
			Thread t = new Thread(run3);
			t.start();
			try {
				t.join();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t2 start .......");
			
		};
		
		Runnable run1 = ()->{
			Thread t = new Thread(run2);
			t.start();
			try {
				t.join();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1 start .......");
		};
		
		Thread t1 = new Thread(run1);
		t1.start();
	
		
		
	}
	
}	
