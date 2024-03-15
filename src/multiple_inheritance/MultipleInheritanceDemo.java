package multiple_inheritance;


public class MultipleInheritanceDemo {
   
	public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 30, 1);
        System.out.println("Gear: " + mountainBike.getGear());
        System.out.println("Seat Height is: " + mountainBike.getSeatHeight());
        System.out.println("Speed is given as: " + mountainBike.getSpeed());
        
        mountainBike.applyBrake(2);
        System.out.println("Bike after applying break is: " + mountainBike.getSpeed());
        
        mountainBike.speedUp(5);
        System.out.println("Speed of bike after increment is: " + mountainBike.getSpeed());
        
        mountainBike.canDrive();
        
        mountainBike.canRotateTwoWheels();
	}

}
