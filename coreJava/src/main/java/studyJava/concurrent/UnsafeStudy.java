package studyJava.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

import sun.misc.Unsafe;

/**
 *    hhh
    * @Title: UnsafeStudy.java  
    * @Package studyJava.concurrent  
    * @Description: TODO(用一句话描述该文件做什么)  
    * @author zzy 
    * @date 2018年8月7日
 */

public class UnsafeStudy {
	
	
//	static Unsafe unsafe = Unsafe.getUnsafe();
//	
//	private static final long valueOffset;
//	
//	  static {
//	        try {
//	            valueOffset = unsafe.objectFieldOffset
//	                (AtomicInteger.class.getDeclaredField("value"));
//	        } catch (Exception ex) { throw new Error(ex); }
//	    }
//	
//	
//	public void test(){
//		System.out.println(unsafe.getIntVolatile(this, valueOffset));
//	}
	
	public static void main(String[] args) {
//		UnsafeStudy study = new UnsafeStudy();
//		study.test();
		System.out.println("123");
	}
	
}
