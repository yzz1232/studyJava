package studyJava.algorithm;

public class ErFengSort {
	
	
	/**
	 * 二分插入
	    * @Title: sort
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @param nums    参数
	    * @return void    返回类型
	    * @throws
	 */
	static void sort(int[] nums){
		
		for(int i=1;i<nums.length;i++){
			int temp = nums[i];
			int j= i-1;
			int k = erfenfa(nums,0,i-1,nums[i]);
			for(;j>=k;j--){
				nums[j+1] = nums[j];
			}
			nums[k] = temp;
		}
	}
	
	static void insertSort(int[] nums){
		for(int i=1;i<nums.length;i++){
			int temp = nums[i];
			int j=i-1;
			for(;j>=0;j--){
				if(nums[j]>temp){
					nums[j+1] = nums[j];
				}else{
					break;
				}
			}
			nums[j+1] = temp;
		}
	}
	
	
	static int erfenfa(int nums[],int left,int right,int value){
		
		while(left<=right){
			int mid = left + (right-left)/2;
			if(nums[mid] > value){
				right = mid-1;
			}else{
				left = mid+1;
			}
		}
		return left;
	}
	
	/**
	 *  插入算法
	    * @Title: charuSort
	    * @Description: TODO(这里用一句话描述这个方法的作用)
	    * @param @param nums    参数
	    * @return void    返回类型
	    * @throws
	 */
	public static void charuSort(int[] nums){
		for(int i=1;i<nums.length;i++){
			for(int j=0;j<i;j++){
				int temp = nums[i];
				if(nums[j]>temp){
					int k = j;
					for(int z=i;z>j;z--){
						nums[z] = nums[z-1];
					}
					nums[k] = temp;
					break;
				}
			}
		}
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
		  //System.out.println(numJewelsInStones("ab","abc"));
		  int[] arr  = {5,2,3,1,10,0,9,4,7,6,8};
		  //charuSort(arr);
		  //insertSort(arr);
		  sort(arr);
		  for(int a:arr){
			  System.out.println(a);
		  }
	  }

	
}
