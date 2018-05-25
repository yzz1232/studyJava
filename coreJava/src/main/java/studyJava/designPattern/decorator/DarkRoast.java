package studyJava.designPattern.decorator;

public class DarkRoast implements Beverage{

	public void getDescription() {
		System.out.println("DarkRoast .......");
		
	}

	public double getCost() {
		return 20;
	}

}
