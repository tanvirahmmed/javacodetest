package oop.abstraction;

public class MotorEngineCar extends MotorCar  implements Car, Boat {


	public void carShape() {
		// TODO Auto-generated method stub
		System.out.println("Car Shape Should be 5 by 5 feet");
	}

	
	public void start() {
		System.out.println("Must have start feature to start the engine");
		
	}

	
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("once car start, must have to stop the car");
	}


	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("You car Drive the class");
	}


	@Override
	public void BoatDesgin() {
		// TODO Auto-generated method stub
		System.out.println("This is boat Design Methods");
	}


	@Override
	public void BoatSize() {
		// TODO Auto-generated method stub
		
		System.out.println("This is boat size methods");
	}


	@Override
	public void BoatDescriptions() {
		System.out.println("This is boat description Methods");
		
	}

}
