package studyJava.algorithm;

import java.util.ArrayList;
import java.util.List;

public class SearchBinaryTree {
	
	BinaryTree rootNode;
	
	public SearchBinaryTree(BinaryTree rootNode){
		this.rootNode = rootNode;
	}
	
	public void add(BinaryTree data){
		add(data,rootNode);
	}
	
	public void add(BinaryTree data,BinaryTree root){	
		
		if(data.key > root.key){
			if(root.right!=null){
				add(data,root.right);
			}else{
				root.right = data;
				return;
			}
			
		}else if(data.key < root.key){
			if(root.left!=null){
				add(data,root.left);
			}else{
				root.left = data;
				return;
			}
			
		}
		
	}
	
	public BinaryTree search(int key){
		return search(key,rootNode);
	}
	
	
	public BinaryTree search(int key,BinaryTree root){
		
		if(root.key == key){
			return root;
		}else if(root.key > key){
			if(root.left != null){
				return search(key,root.left);
			}
		}else{
			if(root.right != null){
				return search(key,root.right);
			}

		}
		return null;
	}
	
	public void qianxuBianli(BinaryTree root){
		
		if(root == null){
			return;
		}else{
			System.out.println(root.key);
		}
	   
		
		
		qianxuBianli(root.left);
		qianxuBianli(root.right);
		
	}
	
	public void zhongxubianli(BinaryTree root){
		
	
		
		if(root.left != null){
			zhongxubianli(root.left);
		}
		
		System.out.println(root.key);
		if(root.right != null){
			zhongxubianli(root.right);
		}
		
	}
	
	public void houxunbianli(){
		
	}
	
	public BinaryTree delete(int key,BinaryTree root,BinaryTree parent){
		
		if(root == null){
			return null;
		}
		

		if(root.key == key){
	
			if(root.left!=null && root.right!=null){
				BinaryTree houjiNode = findHouji(root.right);
				root.key = houjiNode.key;
				if(houjiNode.right ==null){
					root.right = null;
				}else {
					root.right = houjiNode.right;
				}
			}else if(root.left!=null){
				root.key = root.left.key;
				root.left = null;
			}else if(root.right!=null){
				root.key = root.right.key;
				root.right = null;
			}
			

			return root;
			
		}else if(root.key > key){
			return delete(key,root.left,root);
		}else{
			return delete(key,root.right,root);
		}
		
	}
	
	/**
	 * 后继就是 8,10,9  9是8的后继
	    * @Title: findHouji
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @return    参数
	    * @return BinaryTree    返回类型
	    * @throws
	 */
	public BinaryTree findHouji(BinaryTree root){
		
		if(root.left == null){
			return root;
		}
		
		return findHouji(root.left);
		
		
	}
	
	public void daoxu(BinaryTree root,ArrayList<Integer> list){
	
		
		list.add(root.key);
		
//		if(root.right!=null){
//			System.out.println(root.right.key);
//		}
//		if(root.left!=null){
//			System.out.println(root.left.key);
//		}
//		
		if(root.right!=null){
			daoxu(root.right,list);
		}
		if(root.left!=null){
			daoxu(root.left,list);
		}
		
		
		
	}
	
	public void add(BinaryTree root,int key){
		if(root == null){
			root = new BinaryTree(key,null,null);
			return;
		}
		
		if(key > root.key){
			if(root.left!=null){
				add(root.left,key);
			}else{
				root.left = new BinaryTree(key, null, null);
			}
		}
		
		if(key < root.key){
			if(root.right!=null){
				add(root.right,key);
			}else{
				root.right = new BinaryTree(key, null, null);	
			}
		}
	}
	
    public void swap(BinaryTree root,BinaryTree parent){
        if(root == null){
            return;
        }
       
        if(root.left!=null || root.right !=null){
        	swap(root.left,parent);
        	swap(root.right,parent);
        }else
        	return;
        
        BinaryTree temp = root.left;
        root.left = root.right;
        root.right = temp;
   }
        
        
        
       
        
        
    
	
	

	
	
	
	public static void main(String[] args) {
		SearchBinaryTree ss = new SearchBinaryTree(new BinaryTree(4,null,null));
		ss.add(new BinaryTree(2,null,null));
		ss.add(new BinaryTree(7,null,null));
		ss.add(new BinaryTree(1,null,null));
		ss.add(new BinaryTree(3,null,null));
		ss.add(new BinaryTree(6,null,null));
		ss.add(new BinaryTree(9,null,null));
		
		ss.swap(ss.rootNode,null);
		
//		ArrayList<Integer> list = new ArrayList<>();
//		ss.daoxu(ss.rootNode,list);
//		
//		
//		BinaryTree root = new BinaryTree(list.get(0),null,null);
//		for(int i=1;i<list.size();i++){
//			ss.add(root, list.get(i));
//		}
		
		//ss.rootNode = root;
		ss.zhongxubianli(ss.rootNode);
		
		//System.out.println(1);
	}
	
	
	
}
