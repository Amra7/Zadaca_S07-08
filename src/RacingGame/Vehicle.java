package RacingGame;


import java.awt.Color;
import java.awt.Graphics;

/**
 * Create Vehicle and implements  GameArtifact that has one method:
 *     void draw(Graphics graphics);
 * @author Emir
 *
 */

public class Vehicle implements GameArtifact {
	public static int WIDTH = 40;
	public static int HEIGHT = 80;
	
	public static int WIDTH_HALF = WIDTH/2;
	public static int HEIGHT_HALF = HEIGHT/2;
	
	protected int x;
	protected int y;
	
	private int crashFrame; 
	private int stainFrame;
	private int roadFrame;
	
	/**
	 * Constructs the vehicle with setting center position of vehicle.
	 * @param x
	 * @param y
	 */

	public Vehicle(int x, int y) {
		setPosition(x, y);
	}
	
	/**
	 * Received coordinates increases for the dimensions of the object and sets them as the center of the object.
	 */
	public void setPosition(int x, int y) {
		this.x = x - WIDTH_HALF;
		this.y = y - HEIGHT_HALF;
	}
	
	/**
	 * Setters for coordinate x.
	 */
	public void setX(int x) {
		this.x = x - WIDTH_HALF; 
	}
	
	/**
	 * Overridden form interface GameArtifacts
	 */
	@Override
	public void draw(Graphics graphics) {
		if (crashFrame > 0  ) {
			drawCar(graphics, Color.RED);
			crashFrame--;				
		} else if ( stainFrame > 0){
			trunCar(graphics);
			stainFrame--;
		} else if ( roadFrame > 0){
			trunCar(graphics);
			stainFrame--;
		} else if ( roadFrame >0 ){
			drawCar(graphics, Color.RED);
			roadFrame--;
		}else { 
		drawCar(graphics, Color.GRAY);
		}
	}
	
    /**
     * Method that is drawing Vehicle with object graphics form Graphics class
     *  and object color from Color class that are imported.
     * @param graphics - object created with Graphics class which is imported.
     * @param c - object created with Color class which is imported.
     */
	protected void drawCar(Graphics graphics, Color c) {
		graphics.setColor(c);
		graphics.fillRect(x, y, WIDTH, HEIGHT);
		//@amra
		graphics.fillRect(x-5, y+5, 5, 15);
		graphics.fillRect(x-5, y+60, 5, 15);
		graphics.fillRect(x+40, y+5, 5, 15);
		graphics.fillRect(x+40, y+60, 5, 15);
		graphics.setColor(new Color(195, 214,211));
		graphics.fillRect(x+7, y+14, 26, 14);
		graphics.fillRect(x+7, y+60, 26, 10);
		
	}

	/**
	 * Checks whether the two cars collided.
	 * @param v -  other Vehicle
	 * @return true if Vehicles collided or false if they did not.
	 */
	public boolean colade(Vehicle v) {
		return Math.abs(x - v.x) < WIDTH && Math.abs(y - v.y) < HEIGHT;
	}
	
	/**
	 * Sets crashFrame to 20.
	 */
	public void crash() {
		crashFrame = 20;
	}
	
	/**
	 * Checks if crashFrame is bigger than zero. 
	 * @return
	 */
	public boolean isCrashed() {
		return crashFrame > 0;
	}
	
	// @amra 
	/**
	 * Checks whether stain and Vehicle collided.
	 * @param s - stain on the road.
	 * @return - true if they collided or false if they did not collide.
	 */
	public boolean colade(Stain s) {
		return Math.abs(x - s.x) < WIDTH && Math.abs(y - s.y) < HEIGHT;
	}
	
	//@amra
	/**
	 * Sets stainFrame to 20.
	 */
	public void stain() {
		stainFrame = 10;
	}
	
	//@amra
	/**
	 * Checks if stainFrame is bigger than zero.
	 * @return
	 */
	public boolean isStained() {
		return stainFrame > 0;
	}
	
	//@amra
	/**
	 * Turns Vehicle to the right side and up if it stops on stain
	 * by using drawing method with graphics object.
	 * @param graphics - object created with Graphics class which is imported.
	 */
	public void trunCar(Graphics graphics) {
		if(isStained()){
			// If car stop on the stain it turns on the right and up
		    x+=2;                                  
		    y--;
			drawCar(graphics, Color.GREEN);			
		}
		
	}
	
	//@amra
	/**
	 * Checks whether object truck and Vehicle collided.
	 * @param t - object created by class Truck.
	 * @return - true if they collided or false if they did not collide.
	 */
	public boolean colade(Truck t) {
		return Math.abs(x - t.x) < WIDTH && Math.abs(y - t.y) < HEIGHT;
	}
	//@amra
	/**
	 * Checks whether object road and Vehicle collided.
	 * @param r - object  created by class Road.
	 * @return - true if they collided or false if they did not collide.
	 */
	public boolean colade(Road r){
		return Math.abs(x - r.RODE_SIDE) < WIDTH && Math.abs((x+WIDTH) - (r.RODE_SIDE -r.LINE_WIDTH)) < WIDTH;
		/*
		 * Math.abs(x+WIDTH) - (r.RODE_SIDE -r.LINE_WIDTH)) < WIDTH;
		 *  Math.abs(y - r.getHeight()) < HEIGHT
		 */
	}
	
	//@amra
	/**
	 * Sets stainFrame to 20.
	 */
	public void raod() {
		roadFrame = 20;
	}
		
	//@amra
	/**
	* Checks if stainFrame is bigger than zero.
	* @return
	*/
	public boolean isOffRoad() {
		return roadFrame > 0;
	}
	
	/**
	 * Method is empty because it is overridden.
	 */
	public void resetPosition() {
		
	}
	
	// end of class
}
