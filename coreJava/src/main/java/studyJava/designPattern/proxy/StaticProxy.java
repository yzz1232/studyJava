package studyJava.designPattern.proxy;

public class StaticProxy implements Person{
	
	Person person;
	
	public StaticProxy(Person person){
		this.person = person;
	}

	public void say() {
		System.out.println("nihao");
		person.say();
	}
	
	
	
}
