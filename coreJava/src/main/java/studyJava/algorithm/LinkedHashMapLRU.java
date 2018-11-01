package studyJava.algorithm;

import java.util.LinkedHashMap;
import java.util.Map;



public class LinkedHashMapLRU<K,V> extends LinkedHashMap<K,V>{
	
	private static final long serialVersionUID = 1L;
	
	int capacity;
	
	public LinkedHashMapLRU(int capacity){
		super(16, 0.75f, true);
		this.capacity = capacity;
	}
	
	protected boolean removeEldestEntry(Map.Entry<K,V> eldest) {
        return size() > capacity;
    }
	
	
	
}
