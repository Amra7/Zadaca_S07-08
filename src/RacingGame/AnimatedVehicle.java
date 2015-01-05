package RacingGame;


import java.awt.Color;
import java.awt.Graphics;

/**
 * AnimatedVehicle object that is visually moving. 
 * Class AnimatedVehicle extends Vehicle and implements AnimatedGameArtifact with two methods :
 *     void animateFrame(long frameNumber);
 *     void setSpeed(int speed);
 * @author emir
 *
 */

public class AnimatedVehicle extends Vehicle implements AnimatedGameArtifact {

	private int speed;
	private int roadHeight;
	private int minX;
	private int maxX;

	/**
	 * Constructs AnimatedVehicle with the border of moving car min and max, 
	 * height of the road and the speed of AnimatedVehicle.
	 * 
	 * @param minX - left border of the road.
	 * @param maxX - right border of the road.
	 * @param roadHeight  - height of the road.
	 * @param speed - speed of the Vehicle. 
	 */
	public AnimatedVehicle(int minX, int maxX, int roadHeight, int speed) {
		super(0, 0);
		this.minX = minX;
		this.maxX = maxX;
		this.roadHeight = roadHeight;
		setSpeed(speed); 
		resetPosition();
	}
	
	/**
	 * Overridden form class Vehicle
	 */
	@Override
	public void resetPosition() {
		setPosition((int) (minX + Math.random() * (maxX - minX)), (int)(-HEIGHT * Math.random() * 10));
	}
	
	/**
	 * Overridden form interface AnimatedGameArtifacts
	 */
	@Override
	public void setSpeed(int speed) {
		this.speed = speed / 2;
	}

	/**
	 * Overridden form interface AnimatedGameArtifacts
	 */
	@Override
	public void animateFrame(long frameNumber) {
		// move down or reset position if passed
		if (y < roadHeight) {
			y += speed;
		} else {
			resetPosition();
		}
	}
	
	/**
	 * Overridden form interface GameArtifacts
	 */
	@Override
	public void draw(Graphics graphics) {
		// draw car only if in visible area
		if (y > -HEIGHT && y < roadHeight) {
			drawCar(graphics, Color.GREEN);
		}
	}
	
	// end of class

}
