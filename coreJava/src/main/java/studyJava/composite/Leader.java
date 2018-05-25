package studyJava.composite;

import java.util.ArrayList;
import java.util.List;

public class Leader implements Worker{
	
	List<Worker> list = new ArrayList<Worker>();
	
	public void add(Worker worker){
		list.add(worker);
	}
	
	public void doSomething() {
		System.out.println("我是leader,我有"+list.size()+"下属!");
	}
	
	
	public static void main(String[] args) {
		Leader leader = new Leader();
		
		Employe employe = new Employe();
		leader.add(employe);
		
		leader.doSomething();
	}
}
