package studyJava.fengbushilock;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * 
    * @ClassName: FengBuShiSuo
    * @Description: 分布式锁
    * @author Administrator
    * @date 2018年10月29日
    *
 */
public class FengBuShiSuo {
	
	
	
	static JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), "daddress.redis.360fengdai.com", 6479,  5000, "22pBD7.dubbo", 6);
	static Jedis jedis = jedisPool.getResource();
	
	public static boolean tryGetDistributedLock(){
		
		String result = jedis.set("zzy", "1994", "NX", "PX", 600000);
		
		System.out.println("result:"+result);
		
		List<String> keys = new ArrayList<String>();
		List<String> args = new ArrayList<String>();
		 
		keys.add("zzy");
		args.add("1994");
		 
		Object o = jedis.eval("if redis.call('get',KEYS[1]) == ARGV[1] then return redis.call('del',KEYS[1]) else return 0 end ", keys, args);
		 
		System.out.println("o:"+o);
		 
		 return false;
	}
	
	public static void main(String[] args) {
		tryGetDistributedLock();
	}
	
	

	
	
	

}
