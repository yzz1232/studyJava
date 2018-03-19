package studyJava.concurrent;

public class StudyJoin {
	
	public volatile static int i = 0;
	
	public static class addThrad extends Thread{
		public void run(){
			for(int j=0;j<1000;j++){
				add();
			}
		}
	}
	
	public synchronized static void add(){
		i++;
	}
	

	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new addThrad();
		Thread t2 = new Thread(){
			public void run(){
				for(int j=0;j<1000;j++){
					add();
				}
			}
		};
		t.start();
		t2.start();
		t.join();
		t2.join();
		System.out.println(i);
	}
	
}	
