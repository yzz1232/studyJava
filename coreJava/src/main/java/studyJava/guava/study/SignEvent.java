package studyJava.guava.study;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

public class SignEvent {
	
	static EventBus eventBus = new EventBus();
	
	public static void main(String[] args) {
		eventBus.register(new Object(){
			 @Subscribe
		     public void lister(Integer integer) {
		         System.out.printf("%s from int%n", integer);
		     }
			 
			 @Subscribe
		     public void lister2(Integer integer) {
		         System.out.printf("%s from2 int%n", integer);
		     }
			 
		});
		
		eventBus.post(1);
	}
	
	
	
	
	
}
