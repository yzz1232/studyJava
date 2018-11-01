package studyJava.algorithm;

/**
 *  希尔排序
    * @ClassName: XierSort
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月16日
    *
 */
public class XierSort {
	
	public static void main(String[] args) {
		
	  int[] arr = {9,10,5,22,15,100,50,40,80,50,20};
	  int size = arr.length/2;
	  
	  while(size>0){
		  System.out.println(size);
		  for(int i=size;i<arr.length;i=i+size){
			  int value = arr[i];
			  int j=i-size;
			  int t = i;
			  for(;j>=0;j=j-size){
				  if(arr[i]<arr[j]){
					  arr[j+size] = arr[j];
					  t = j;
				  }
				  
			  }
			  arr[t] = value;
		  }
		  size = size/2;
		 
	  };
	  
	  System.out.println(arr.length);
	  
	  
	}
	
}
