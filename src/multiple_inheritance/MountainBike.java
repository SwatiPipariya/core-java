package multiple_inheritance;

// Interfaces solves the problem of multiple inheritance like here the parent class are Bicycle and vehicle
class MountainBike extends TwoWheeler implements Bicycle, Vehicle{
    
	private int seatHeight;
	private int gear;
	private int speed;
	
	//Interfaces cannot be initialized directly that's why we don't have super() keyword here
	public MountainBike(int startHeight,
			            int startSpeed,
			            int startGear) {
		seatHeight = startHeight;
		gear = startGear;
		speed = startSpeed;
	}
    
	
	@Override
	public void applyBrake(int decrement) {
       speed = speed - decrement;		
	}

	@Override
	public void speedUp(int increment) {
       speed = speed + increment;		
	}


	public int getSeatHeight() {
		return seatHeight;
	}


	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}


	public int getGear() {
		return gear;
	}


	public void setGear(int gear) {
		this.gear = gear;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	@Override
	public void canDrive() {
         System.out.println("Mountain bike can be driven");		
	}

	
	
}
