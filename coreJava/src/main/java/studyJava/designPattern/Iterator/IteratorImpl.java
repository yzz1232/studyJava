package studyJava.designPattern.Iterator;


import java.util.List;

public class IteratorImpl implements Iterator{
	
	private List<String> list;
	
	private int cursor =0;
	
	public IteratorImpl(List<String> list){
		this.list = list;
	}

	public Object next() {
		Object object = null;
		if(hasNext()){
			return object = this.list.get(cursor++);
			
		}
		return object;
	}

	public boolean hasNext() {
		if(cursor!=list.size()){
			return true;
		}
		return false;
	
	}

}
