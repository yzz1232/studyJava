package studyJava.coreJava;

public class StudyStatic {
	
	public static String s = "12";
	
	static class test {
		private static String ss ="22";
	}
	
	public static void t(){
		System.out.println(test.ss);
	}
	
	/**
	 * 静态内部类 只有在调的时候才会加载
	 * @param args
	 */
	public static void main(String[] args) {
		StudyStatic.t();
		StudyStatic s = new StudyStatic();
		//s.t();
	}
	
}
