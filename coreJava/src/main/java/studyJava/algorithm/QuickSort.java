package studyJava.algorithm;

/**
 * 快速排序
 * @ClassName QuickSort
 * @Description TODO(这里用一句话描述这个类的作用)
 * @author 87593
 * @Date 2018年3月19日 上午11:22:36
 * @version 1.0.0
 */
public class QuickSort {
	

	static int adjustArray(int i,int j,Integer[] array){
		int x = array[i];
		
		while(i<j){
			while(i<j && array[j] >= x)
				j--;
				if(i < j){
					array[i] = array[j];
					i++;
				}
				
			
			
			while(i<j && array[i] < x)
				i++;
				if(i < j){
					array[j] = array[i];
					j--;
				}
			}
		
		array[i] = x;
		return i;
	}
	
	public static void quickSort(Integer[] array,int i,int j){
		if(i<j){
			int x = adjustArray(i, j,array);
			quickSort(array,i,x-1);
			quickSort(array,x+1,j);
		}
	}
	
	public static void main(String[] args) {
		Integer[] array = {1,5,12,8,13,10};
		quickSort(array,0,array.length-1);
		System.out.println(array.length);
	}
	
}
