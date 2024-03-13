package interfaces;

//Interface is a keyword in java

//The basic idea behind interfaces is that 
//Interfaces define the specifications of how a class would act.

//Interfaces are going to define the contract or specification which is going to govern how an application,
//code or programming logic will behave

//We can only declare methods and  cannot define concrete methods in interface.

// Interface is more restricted as we cannot define variable as such "int x"; 
// we can only define them in public static form ; there is no such restriction in abstraction.

public class InterfaceDemo {

	public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(20, 30, 1);
        System.out.println("Gear: " + mountainBike.getGear());
        System.out.println("Seat Height is: " + mountainBike.getSeatHeight());
        System.out.println("Speed is given as: " + mountainBike.getSpeed());
        
        mountainBike.applyBrake(2);
        System.out.println("Bike after applying break is: " + mountainBike.getSpeed());
        
        mountainBike.speedUp(5);
        System.out.println("Speed of bike after increment is: " + mountainBike.getSpeed());
	}

}
