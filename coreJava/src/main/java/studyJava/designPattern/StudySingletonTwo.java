package studyJava.designPattern;

public class StudySingletonTwo {
	
	private static final StudySingletonTwo instance= new StudySingletonTwo();
		
	private StudySingletonTwo(){
		
	}
	
	public StudySingletonTwo getInstance(){
		return instance;
	}
	
	
	private static class SingletonHolder{
		private static final StudySingletonTwo INSTANCE = new StudySingletonTwo();
	}
	
    public static final StudySingletonTwo getInstanceTwo() {  
        return SingletonHolder.INSTANCE; 
    }
	
}	
