package studyJava.java8.lambda;

import java.io.UnsupportedEncodingException;

public class TTTT {
	
	public static class Employee {
		public int age;
	}
	

		public static void changeEmployee(Employee employee)
		{
			employee = new Employee();
			employee.age = 1000;
		}
		
		public static void main(String[] args) throws UnsupportedEncodingException {
			Employee employee = new Employee();
			employee.age = 100;
			changeEmployee(employee);
			System.out.println(employee.age);
			
			int value = 20;
			foo(value);
			System.out.println("value:"+value);
			
			String text = "yzz";
			foo(text);
			System.out.println("text:"+text);
			
			StringBuilder sb = new StringBuilder("yzz");
			foo(sb);
			System.out.println("sb:"+sb);
			
			StringBuilder sb2 = new StringBuilder("yzz");
			foo2(sb2);
			System.out.println("sb2:"+sb2);
			
			
			byte[] bytes = "国".getBytes("utf-8");
			for(byte be:bytes){
				System.out.println(Integer.toBinaryString(be & 0xFF));
			}
			
		}
		
		public static void foo(int value) {
		    value = 100;
		}
		
		public static void foo(String text) {
		    text = "windows";
		}
		
		public static void foo(StringBuilder builder) {
		    builder.append("4");
		}
	
		public static void foo2(StringBuilder builder) {
		    builder = new StringBuilder("ipad");
		}
	
}
