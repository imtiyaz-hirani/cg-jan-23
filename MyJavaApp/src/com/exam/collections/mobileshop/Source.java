package com.exam.collections.mobileshop;
import java.util.*; 

class Mobile{
	HashMap<String,List<String>> map = new HashMap<>();
	
	public String addMobile(String company, String model){
		if(map.containsKey(company)) {
			//TRUE, It is present
			/* For this company, say oppo, fetch all the models */
			List<String> listModels = map.get(company);
			/* Add new model to this list */
			listModels.add(model);
			 
		}
		else {
			//FALSE, it is not present
			List<String> list=new ArrayList<>();
			list.add(model);
			map.put(company,list);
		}
		return "model successfully added"; 
	}
	
	public HashMap<String,List<String>> addMobileProper(String company, String model){
		if(map.containsKey(company)) {
			//TRUE, It is present
			/* For this company, say oppo, fetch all the models */
			List<String> listModels = map.get(company);
			/* Add new model to this list */
			listModels.add(model);
			 
		}
		else {
			//FALSE, it is not present
			List<String> list=new ArrayList<>();
			list.add(model);
			map.put(company,list);
		}
		return map; 
	}
	
	public ArrayList<String> getModels(String company){
		return null;
	}
}
public class Source {

}


