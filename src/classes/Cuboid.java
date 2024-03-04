package classes;

public class Cuboid {
    
	int length;
	int breadth;
	int height;
	
	Cuboid(int length, int breadth, int height) {
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	Cuboid(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		this.height = 20;
	}
	
	
	Cuboid(int dimension) {
		length = dimension;
		breadth = dimension;
		height = dimension;
	}
	

	Cuboid() {
		this.length = 30;
		this.breadth = 20;
		this.height = 20;
	}
	
	int volume() {
		return length*breadth*height;
	}
	
	public static void main(String[] args) {
        int volume ;
        
        Cuboid stdCuboid = new Cuboid(10, 20, 30);
        volume = stdCuboid.volume();
        System.out.println("Volume of a simple cuboid is " + volume);
        
        Cuboid cuboidWithDefaults = new Cuboid(15, 10);
        volume = cuboidWithDefaults.volume();
        System.out.println("Volume of a simple cuboid with default height is " + volume);
        
        Cuboid cube = new Cuboid(10);
        volume = cube.volume();
        System.out.println("Volume of cube is " + volume);
        
        //The below default constructor is invoked by java; to test this you can comment out all the above constructors still the below constructor works with the value 0 since l =0; b=0; h=0 => volume = 0 
        Cuboid defaultCuboid = new Cuboid();
        volume = defaultCuboid.volume();
        System.out.println("Volume of default cuboid is " + volume);
	}

}
