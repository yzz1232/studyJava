package studyJava.algorithm;

public class ErFengSort {
	
	void sort(int[] nums){
		
		for(int i=0;i<nums.length;i++){
			
		}
		
		
		
	}
	
	public static void charuSort(){
		
	}
	
	 // https://leetcode-cn.com/problems/jewels-and-stones/description/ 为什么会有这种题目
	  public static int numJewelsInStones(String J, String S) {
	    int k=0;
	    	for(int i=0;i<S.length();i++){
	            for(int j=0;j<J.length();j++){
	            	
	            	String s1 = S.substring(i,i+1);
	            	String s2 = J.substring(j,j+1);
	            	
	            	if(s1.equals(s2)){
	            		k++;
	            		break;
	            	}
	            }
	        }
	    	return k;
	    }
	  
	  public static void main(String[] args) {
		  System.out.println(numJewelsInStones("ab","abc"));
	  }

	
}
