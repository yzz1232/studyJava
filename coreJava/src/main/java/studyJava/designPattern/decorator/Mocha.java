package studyJava.designPattern.decorator;

public class Mocha extends AbstractBeverage{
	
	
	public Mocha(Beverage beverage){
		super(beverage);
	}

	public void getDescription() {
		// TODO Auto-generated method stub
		
	}

	public double getCost() {
		// TODO Auto-generated method stub
		return beverage.getCost()+10;
	}
	
	
	public static void main(String[] args) {
		Beverage b = new DarkRoast();
		
		b = new Mocha(b);
		
		b = new Mocha(b);
		System.out.println(b.getCost());
		
	}
}
