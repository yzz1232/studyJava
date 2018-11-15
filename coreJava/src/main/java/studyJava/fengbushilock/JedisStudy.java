package studyJava.fengbushilock;

import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisStudy {
	
	static JedisPool jedisPool = new JedisPool(new JedisPoolConfig(), "daddress.redis.360fengdai.com", 6479,  5000, "22pBD7.dubbo", 0);
	static Jedis jedis = jedisPool.getResource();
	
	public static void main(String[] args) {
		//studyString();
		//studySet();
		studyMap();
		
	}
	
	
	public static void studyString(){

		jedis.flushDB();
		
		//保存字符串
		jedis.set("name", "zzy");
		// 如果lock存在返回null 如果不存在新建lock 过期时间 60毫秒
		// NX 只有键不存在才对键进行设置
		// PX 只有键已存在才对键进行设置
		// EX 秒
		// PX 毫秒
		jedis.set("lock", "value", "NX", "PX", 60);
		
		//获取值
		jedis.get("name");
		
	}
	
	
	public static void studySet(){
		
		jedis.flushDB();
		
		//添加元素
		long a = jedis.sadd("set", "医疗","消费");
		
		//获取集合个数
		a = jedis.scard("set");
		
		//判断元素是否在集合中
		boolean b1 = jedis.sismember("set","医疗");
		
		//获取集合元素
		Set<String> set = jedis.smembers("set");
		
		//删除元素
		jedis.srem("set", "医疗");
	}
	
	
	public static void studyMap(){
		
		//保存
//		jedis.hset("user", "name", "zzy");
//		
//		jedis.hsetnx("user", "name", "zzy");
//		
//		//查找
//		jedis.hget("user", "name");
		
		//删除
		System.out.println(jedis.hdel("loan:applyModelFieldConfig:cache", "selectValueMapByType-CertificationModel"));
		
	}
	
	
	
}
