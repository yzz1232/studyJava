package studyJava.algorithm;

import java.util.HashMap;

public class LRU {
	
	private HashMap<String,DLinkedNode> cache = new HashMap<>();
	
	private int count;
	
	private int capacity;
	
	DLinkedNode head,tail;
	
	public LRU(int capacity){
		
		this.count = 0;
		this.capacity = capacity;
		
		head = new DLinkedNode();
		tail = new DLinkedNode();
		
		head.pre = null;
		tail.next = null;
		
		head.next = tail;
		tail.pre = head;
	}
	
	public int get(String key){
		DLinkedNode node = cache.get(key);
		if(node == null){
			return -1;
		}
		
		moveToHead(node);
		
		return node.value;
	}
	
	public void set(String key,int value){
		
		DLinkedNode node = cache.get(key);
		if(node==null){
			
			//放到head
			node = new DLinkedNode();
			node.key = key;
			node.value = value;
			
			cache.put(key, node);
			count++;
			moveToHead(node);
			
			//移除 the last
			if(count > capacity){
				removeNode(getTail());
				count--;
			}
			
			
		}else{
			node.value = value;
			//移到head
			moveToHead(node);
		}
		
	}
	
	public DLinkedNode getTail(){
		return tail.pre;
	}
	

	
	private void moveToHead(DLinkedNode node){
		removeNode(node);
		addNode(node);
	}
	
	private void removeNode(DLinkedNode node){
		
		DLinkedNode pre = node.pre;
		DLinkedNode next = node.next;
		
		pre.next = next;
		next.pre = pre;
		
		node.pre = null;
		node.next = null;
	}
	
	private void addNode(DLinkedNode node){
		node.pre = head;
		node.next = head.next;
		head.next = node;
	}
	
	static class DLinkedNode {
		
		String key;
		int value;
		DLinkedNode pre;
		DLinkedNode next;
	}
}
