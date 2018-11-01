package studyJava.algorithm;

/**
 *    冒泡 快速 插入
    * @ClassName: MaoPaoSort
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月12日
    *
 */
public class MaoPaoSort {
	
	public static void main(String[] args) {
		
		int[] arr = {90,100,10,30,20,60};
		//selectSort(arr);
		insertSort(arr);
	}
	
	
	static void  maopaoSort(int[] arr){
		
		
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					 int tempExchangVal = arr[j];
		             arr[j] = arr[j + 1];
		             arr[j + 1] = tempExchangVal;
				}
			}
		}
		
		System.out.println(arr.length);
	}
	
	static void selectSort(int[] arr){
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr.length);
		
	}
	
	static void insertSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int temp = arr[i];
			int j=i-1;
			int t = i;
			for(;j>=0;j--){
				if(temp<arr[j]){
					arr[j+1] = arr[j];
					t = j;
				}	
			}
			arr[t] = temp; 
		}
		
		System.out.println(arr.length);
	}
}
