package Abstraction;

public class BMW implements Car {

	@Override
	public void start() {
	  System.out.println("BMW---Start");
		
	}

	@Override
	public void stop() {
		 System.out.println("BMW---Stop");
		
	}

	@Override
	public void refuel() {
		 System.out.println("BMW---refuel");		
	}

	//non overridden methods 
	public void theftSafety()
	{
		System.out.println("BMW---TheftSafety");
	}
	
	
}
