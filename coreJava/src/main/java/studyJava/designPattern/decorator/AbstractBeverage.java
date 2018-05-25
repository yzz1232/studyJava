package studyJava.designPattern.decorator;

import java.util.LinkedList;

public  class AbstractBeverage implements Beverage{
	
	public Beverage beverage;
	
	public AbstractBeverage(Beverage beverage){
		this.beverage = beverage;
	}
	
	public void getDescription() {
		// TODO Auto-generated method stub
		
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
