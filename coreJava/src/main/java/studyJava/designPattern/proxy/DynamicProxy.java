package studyJava.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxy implements InvocationHandler{
	
	Person person;
	
	public DynamicProxy(Person person){
		this.person = person;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("223");
		
		method.invoke(person, args);
		
		return null;
	}
	
	public static void main(String[] args) {
		
		//Proxy.newProxyInstance
	}

}
