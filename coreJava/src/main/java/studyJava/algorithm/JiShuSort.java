package studyJava.algorithm;

/**
 *   
    * @ClassName: JiShuSort
    * @Description: 基数排序
    * @author Administrator
    * @date 2018年10月15日
    *
 */
public class JiShuSort {
	
	public static void main(String[] args) {
		
		int[] arr = {20,9,5,4,8,40,1000,99,100};
		
		int max=arr[0],min=arr[0];
		
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		int[] temp = new int[max-min+1];
		for(int i=0;i<arr.length;i++){
			temp[arr[i]-min] = temp[arr[i]-min]+1;
		}
		
		for(int i=temp.length-1;i>=0;i--){
			while(temp[i]>0){
				temp[i] = temp[i]-1;
				System.out.print(i+min+",");
				
			}
		}
		
	}
	
}
