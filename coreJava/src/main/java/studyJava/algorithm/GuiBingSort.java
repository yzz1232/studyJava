package studyJava.algorithm;

import java.util.Date;

import com.alibaba.fastjson.JSONObject;

/**
 * 归并排序
    * @ClassName: GuiBingSort
    * @Description: TODO(这里用一句话描述这个类的作用)
    * @author Administrator
    * @date 2018年10月15日
    *
 */
public class GuiBingSort {
	
	public static void main(String[] args) {
		
//		int[] c = {1,20,11,15,8,7,12,16,9};
//	
//		int[] temp = new int[8];
//		
//		sort(c,0,temp.length-1,temp);
//		
//		System.out.println("223");
		
		
		
		
//		JSONObject param = new JSONObject();
//		
//		param.put("agent", "agent_fd");
//		param.put("name", "朱振宇");
//		param.put("mobile", "1872093425");
//		param.put("id_no", "362502199412220232");
//		
//
//		JSONObject callback_data = new JSONObject();
//		
//		JSONObject passbackParams = new JSONObject();
//		
//		passbackParams.put("beanName", "wuyiPersonalRiskReportServiceImpl");
//		passbackParams.put("method", "callback");
//		passbackParams.put("interfaceId", "1231");
//		passbackParams.put("userId", "1213");
//		
//		
//		callback_data.put("passbackParams", passbackParams);
//		
//		param.put("callback_url", "http://192.168.15.137/box-data/callback");
//		param.put("callback_data", callback_data);
//		
		//System.out.println(param.toJSONString());
		
//		String s = "com.tairanchina.fd.dock.service.impl.thirdparty.WuyiPersonalRiskReportServiceImpl";
//		String[] ss = s.split("\\.");
//		s  = s.split("\\.")[s.split("\\.").length-1];
//		System.out.println(s.substring(0,1).toLowerCase() +  s.substring(1,s.length()));
		
		System.out.println(new Date());
		
		
	}
	
	static void sort(int[] arr,int left,int right,int[] temp){
		if(left < right){
			int mid = (right+left)/2;
			
			sort(arr,left,mid,temp);
			sort(arr,mid+1,right,temp);
			merge(arr,left,right,temp);
		}
		
	}
	
	
	static void merge(int[] arr,int left,int right ,int[] temp){
		
		int k=left;
		int mid = (right+left)/2+1;
		int mmid = mid;
		
		while(left < mmid && mid <= right){
			if(arr[left] > arr[mid]){
				temp[k++] = arr[mid++];
			}else{
				temp[k++] = arr[left++];
			}
		}
		
		while(left == mmid && mid <= right){
			temp[k++] = arr[mid++];
		}
		
		while(mid >= right && left < mmid){
			temp[k++] = arr[left++];
		}
		
		
		for(int i=0;i<k;i++){
			arr[i] = temp[i];
		}
		
	}
	
	
	
}
