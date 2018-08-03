package studyJava.concurrent;

public class StudyRetry {

	public static void main(String[] args) {
		
		retry:
		
		for(int i=0;i<10;i++){
			if(i==4){
				continue retry;
			}
			System.out.println(i);
		}
		
	}
	
}
