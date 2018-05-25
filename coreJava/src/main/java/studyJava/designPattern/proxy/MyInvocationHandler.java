package studyJava.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.DateFormat;
import java.util.Collection;

public class MyInvocationHandler implements InvocationHandler{

	private Object target;
    public MyInvocationHandler(Object target) {
        this.target=target;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("method :"+ method.getName()+" is invoked!");
        return null;
    }
    
    
    public static void main(String[] args) {
    	DateFormat.getDateInstance();
    	Object object = Proxy.
                newProxyInstance(Thread.currentThread().getContextClassLoader(),
                       new Class<?>[]{HelloWorld.class},
                       new MyInvocationHandler(new HelloworldImpl()));
      ((HelloWorld)object).sayHello();
      
      
      Collection<Object>
	}

}
