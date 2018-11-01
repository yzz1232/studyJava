package studyJava.algorithm;

import java.util.Date;

/**
 * 
    * @ClassName: QuickSort
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月12日
    *
 */
public class QuickSort {
	

	
	public static void main(String[] args) {
		
		BitMap
		
		
		System.out.println(new Date().getTime());
		int[] arr = {90,100,20,10,50,60};
		
		swap(arr,0,arr.length-1);
		System.out.println(new Date().getTime());
		
	}
	
	static void swap(int[] arr,int l,int r){
		
		
		if(l<r){
			int i=l,j=r;
			int z = 0;
			int k=l;
			int x = arr[l];
		
			while(i<j){
				if(z%2==0){
					if(x >= arr[j]){
						arr[k] = arr[j];
						k=j;
						z++;
					}
					j--;
				}else{
					if(x <= arr[i]){
						arr[k] = arr[i];
						k=i;
						z++;
					}
					i++;
				}
				
			}
			
			arr[k] = x;
			swap(arr,l,k-1);
			swap(arr,k+1,r);
		}
		
	

	}
	
	
}
