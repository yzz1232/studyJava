package studyJava.algorithm.LinkedList;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;

public class Proxy2 extends Proxy implements HelloWorld{
	
	  private static Method m1;
	  private static Method m2;
	  private static Method m3;
	  private static Method m0;
	  
	  public Proxy2(InvocationHandler paramInvocationHandler)
	  {
	    super(paramInvocationHandler);
	  }
	  
	  public final boolean equals(Object paramObject)
	  {
	    try
	    {
	      return ((Boolean)this.h.invoke(this, m1, new Object[] { paramObject })).booleanValue();
	    }
	     catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return true;
	   
	  }
	  
	  public final String toString()
	  {
	    try
	    {
	      return (String)this.h.invoke(this, m2, null);
	    }catch(Exception e){
	    	 throw new UndeclaredThrowableException(e);
	    } catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return "";
	   
	   
	  }
	  
	  public final void say()
	  {
	    try
	    {
	      this.h.invoke(this, m3, null);
	      return;
	    }catch(Exception e){
	    	e.printStackTrace();
	    } catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	  }
	  
	  public final int hashCode()
	  {
	    try
	    {
	      return ((Integer)this.h.invoke(this, m0, null)).intValue();
	    }
	    
	    catch (Throwable localThrowable)
	    {
	      throw new UndeclaredThrowableException(localThrowable);
	    }
	  }
	  
	  static
	  {
	    try
	    {
	      m1 = Class.forName("java.lang.Object").getMethod("equals", new Class[] { Class.forName("java.lang.Object") });
	      m2 = Class.forName("java.lang.Object").getMethod("toString", new Class[0]);
	      m3 = Class.forName("studyJava.algorithm.LinkedList.HelloWorld").getMethod("say", new Class[0]);
	      m0 = Class.forName("java.lang.Object").getMethod("hashCode", new Class[0]);
	      
	    }
	    catch (NoSuchMethodException localNoSuchMethodException)
	    {
	      throw new NoSuchMethodError(localNoSuchMethodException.getMessage());
	    }
	    catch (ClassNotFoundException localClassNotFoundException)
	    {
	      throw new NoClassDefFoundError(localClassNotFoundException.getMessage());
	    }
	  }
	  
	  public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?>[] constructorParams = { InvocationHandler.class };
		Class clazz = Proxy2.class;
		Constructor<?> cons = clazz.getConstructor(constructorParams);
		Object o =  cons.newInstance(new TestHandler(new HelloWorldImpl()));
		
		((HelloWorld)o).say();
		
	}
}
