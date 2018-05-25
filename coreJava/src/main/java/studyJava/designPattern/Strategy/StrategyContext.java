package studyJava.designPattern.Strategy;

import java.util.List;

public class StrategyContext {
	
	private List<Strategy> list;
	
	public StrategyContext(List<Strategy> list){
		this.list = list;
	}
	
	public boolean show(){
		
		boolean flag = true;
		
		for(Strategy strategy:list){
			if(strategy.check()){
				return flag;
			}
		}
		return flag;
	}
}
