package studyJava.algorithm.LinkedList;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import sun.security.action.GetBooleanAction;

public class Node {
	
	private Node next;
	
	private Object item;
	
	public Node(Node next,Object item){
		
		this.next = next;
		this.item = item;
	}
	
	public Node(){}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	public static void main(String[] args) {
									
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
		InvocationHandler handler = new TestHandler();

		Object o = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{HelloWorld.class}, handler);
		
		((HelloWorld)o).say();
		
		System.out.println("223");
		
		
		//Object o = handler.
	}
	
	
}
