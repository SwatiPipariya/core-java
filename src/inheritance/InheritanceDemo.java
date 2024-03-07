package inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
       MountainBike mountainBike = new MountainBike(20, 45, 10);
       System.out.println("Gear is: " + mountainBike.gear);
       System.out.println("Seat height is: " + mountainBike.seatHeight);
       System.out.println("Bike speed is: " + mountainBike.speed);
       
       mountainBike.applyBreak(2);
       System.out.println("Bike speed after applying the break is: " + mountainBike.speed );
       
	}

}
