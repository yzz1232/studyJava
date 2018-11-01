package studyJava.algorithm;

import java.util.ArrayList;
import java.util.List;

/**
 * 
    * @ClassName: TongSort
    * @Description: 桶排序
    * @author Administrator
    * @date 2018年10月16日
    *
 */
public class TongSort {
	
	public static void main(String[] args) {
		int[] arr = {63,157,189,51,101,47,141,121,157,156,194,117,98,139,67,133,181,13,28,109};
		
		int max=arr[0],min=arr[0];
			
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		int tong = 5;
		
		double tongSize = (max-min)/(tong-1);
		
		ArrayList<Integer>[] list = new ArrayList[tong];
		for(int i=0;i<list.length;i++){
			list[i] = new ArrayList();
		}
		
		for(int i=0;i<arr.length;i++){
			int temp = (int) Math.floor((arr[i]-min)/tongSize);
			sort(list[temp],arr[i]);
		}
		
		
		for(int i=0;i<list.length;i++){
			list[i].forEach(value->{
				System.out.println(value);
			});
		}
		
	
	}
	
	static void sort(List<Integer> list,int value){
		
		if(list.size() == 0){
			list.add(value);
			return;
		}
		
		int i=0;
		
		for(;i<list.size();i++){
			if(value<list.get(i)){

				for(int j=list.size();j>i;j--){
					if(j==list.size()){
						list.add(j, list.get(j-1));
					}else{
						list.set(j, list.get(j-1));
					}
					
				}
				list.set(i, value);
				break;
			}
			
		}
		
		if(i==list.size()){
			list.add(value);
		}
		
	}
	
}
