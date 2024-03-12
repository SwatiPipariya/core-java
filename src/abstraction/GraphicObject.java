package abstraction;

public abstract class GraphicObject {
    int x,  y;
    
    GraphicObject(){
    	System.out.println("Hello Everyone!!");
    }
    
    void moveTo(int newX, int newY) {           // This is a concrete method
    	System.out.println("Move to x :" +x+" and y:" +y);
    }
    
    abstract void draw();
    abstract void resize();
    
	
}
//In abstraction we can define concrete methods as well