package studyJava.algorithm.LinkedList;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TestHandler implements InvocationHandler{
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("你好1");
		return null;
	}
	
}
