package studyJava.algorithm.LinkedList;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {
	
	public Test(Object object){}
	
	public void say(){
		System.out.println("223");
	}
	
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz = Test.class;
		Constructor<?> cons = clazz.getConstructor(new Class<?>[]{Object.class});
		Object o = cons.newInstance(new Object());
		((Test)o).say();
	}
}
