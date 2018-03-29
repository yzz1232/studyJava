package studyJava.zookeeper;

public interface DistributedLockService {
	
	public void tryLock(CallBack callBack);
	
	public void tryLock(CallBack callBack,long timeout);
	
	public interface CallBack{
		
		public void locked();
		
		public void expire();
	}
	
}
