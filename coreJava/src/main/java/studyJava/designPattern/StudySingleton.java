package studyJava.designPattern;

/**
 * 单例模式
 * @ClassName StudySingleton
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author 87593
 * @Date 2018年3月8日 上午11:37:24
 * @version 1.0.0
 */
public class StudySingleton {
	
	
	private StudySingleton(){}
	
	private static StudySingleton singleton;
	
	/**
	 * 并发有问题  懒汉加载 用的的时候才加载
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @return
	 */
	public static StudySingleton getInsanceOne(){
		if(singleton ==null){
			singleton = new StudySingleton();
		}
		return singleton;
	}
	
	/**
	 * 	锁加的有问题
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @return
	 */
	public static StudySingleton getInstanceTwo(){
		if(singleton == null){
			synchronized (StudySingleton.class) {
				singleton = new StudySingleton();
			}
		}
		return singleton;
	}
	
	
	/**
	 * 锁范围太大
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @return
	 */
	public static StudySingleton getInstanceThree(){
		synchronized (StudySingleton.class) {
			if(singleton == null ){
				singleton = new StudySingleton();
			}
		}
		return singleton;
	}
	
	/**
	 * 双重验证
	 * @Description (TODO这里用一句话描述这个方法的作用)
	 * @return
	 */
	public static StudySingleton getInstanceFour(){
		if(singleton==null){
			synchronized (StudySingleton.class) {
				if(singleton == null ){
					singleton = new StudySingleton();
				}
			}
		}
		
		return singleton;
	}
	
}
