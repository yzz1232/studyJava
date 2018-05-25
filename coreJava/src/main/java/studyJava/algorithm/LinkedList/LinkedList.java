package studyJava.algorithm.LinkedList;

/**
 * 链表
 * @author Administrator
 *
 */
public class LinkedList {
	
	private Node head;
	
	public void add(Node node){
		if(head == null){
			head = node;
			return;
		}
		
		Node temp = head;
		while(temp.getNext()!=null){
			temp = temp.getNext();
		}
		
		temp.setNext(node);
	}
	
}
