package oop.abstraction;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		MotorEngineCar ToyotaCorolla = new MotorEngineCar();
		ToyotaCorolla.buildEngine();
		
		Car nissanPathfinder = new MotorEngineCar();
		nissanPathfinder.carShape();
		
		MotorCar bmwSerise5 = new MotorEngineCar();
		
		bmwSerise5.drive();
		
		Boat myBoat = new MotorEngineCar();
	    myBoat.BoatDesgin();
		
	}

}
