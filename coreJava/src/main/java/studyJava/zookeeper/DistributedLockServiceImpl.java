package studyJava.zookeeper;

public class DistributedLockServiceImpl implements DistributedLockService{
	
	private static final String ROOT = "/zk-demo";
	
	private static final String LOCK = "lock";
	
	private static final String EXCLUSIVE_LOCK = ROOT + "/" + LOCK; 

	public void tryLock(CallBack callBack) {

		
	}

	public void tryLock(CallBack callBack, long timeout) {
		// TODO Auto-generated method stub
		
	}

}
