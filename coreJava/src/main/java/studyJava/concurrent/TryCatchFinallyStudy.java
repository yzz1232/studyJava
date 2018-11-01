package studyJava.concurrent;

public class TryCatchFinallyStudy {
	
	
	/**
	 * 执行顺序：try块中出现异常到catch，catch中出现异常到finally，finally中执行到return语句返回，不检查异常
	 * 没有catch，只有try和finally时，执行顺序和上面的几种情况差不多，只是少了catch块的执行
	 */
	

	
	
	public static void main(String[] args) {
		
		//System.out.println(NoException());
		//System.out.println(NoException2());
		//System.out.println(WithException());
		System.out.println(CatchException());
		//System.out.println(CatchException2());
	}
	 
	
	 // 10 9 return 8
	 public static int NoException(){
		  int i=10;
		  try{
		   System.out.println("i in try block is"+i);
		   return --i;
		  }catch(Exception e){
		   --i;
		   System.out.println("i in catch - form try block is"+i);
		   return --i;
		  }finally{  
		   System.out.println("i in finally - from try or catch block is"+i);
		   return --i;
		  }
	 }
	 
	 // 10,9,8 retrun 9
	 public static int NoException2(){
			int i=10;
			try{
				System.out.println("i in try block is--"+i);
				return --i;
			}catch(Exception e){
				--i;
				System.out.println("i in catch - form try block is--"+i);
				return --i;
			}finally{
				
				System.out.println("i in finally - from try or catch block is--"+i);
				--i;
				System.out.println("i in finally block is--"+i);
				//return --i;
			}
	 }
	 
	 // 10,10,9,8,7 return 6
	 public static int WithException(){
			int i=10;
			try{
				System.out.println("i in try block is--"+i);
				i = i/0;
				return --i;
			}catch(Exception e){
				System.out.println("i in catch - form try block is--"+i);
				--i;
				System.out.println("i in catch block is--"+i);
				return --i;
			}finally{
				
				System.out.println("i in finally - from try or catch block is--"+i);
				--i;
				System.out.println("i in finally block is--"+i);
				return --i;
			}
	 }
	 
	 // 10,10,10,9 抛异常
	 public static int CatchException(){
			int i=10;
			try{
				System.out.println("i in try block is--"+i);
				i=i/0;
				return --i;
			}catch(Exception e){
				System.out.println("i in catch - form try block is--"+i);
				int j = i/0;
				return --i;
			}finally{
				
				System.out.println("i in finally - from try or catch block is--"+i);
				--i;
				System.out.println("i in finally block is--"+i);
				//return --i;
			}
	 }

	 
	 // 10,10,10,9 return8
	 public static int CatchException2(){
			int i=10;
			try{
				System.out.println("i in try block is--"+i);
				i=i/0;
				return --i;
			}catch(Exception e){
				System.out.println("i in catch - form try block is--"+i);
				int j = i/0;
				return --i;
			}finally{
				
				System.out.println("i in finally - from try or catch block is--"+i);
				--i;
				System.out.println("i in finally block is--"+i);
				return --i;
			}
		
	 }


	

	
	
}
