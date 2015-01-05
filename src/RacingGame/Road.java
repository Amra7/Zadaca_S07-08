package RacingGame;



import java.awt.Color;
import java.awt.Graphics;

/**
 * Road is a class where we provide edges of the street.
 * Implements interface AnimatedGameArtifact with two methods :
 *     void animateFrame(long frameNumber);
 *     void setSpeed(int speed);
 * 
 * @author Emir
 *
 */

public class Road implements AnimatedGameArtifact {
	private int left;
	private int right;
	private int speed;
	private int height;
	
	public static int RODE_SIDE = 200;
	public static int LINE_WIDTH = 10;
	
	
	private int lineHeight = 50;
	private int lineSpace = 20;
	private int totalLineHeight = lineHeight + lineSpace;
	
	private int start;
 
	/**
	 * Constructs new road with with the width and height of edges line and the speed of their motion
	 * @param width - width of  edge line( which is drawn as rectangle).
	 * @param height - height of  edge line( which is drawn as rectangle).
	 * @param speed - speed of moving lines (rectangle)
	 */
	public Road(int width, int height, int speed) {
		this.height = height;
		this.speed = speed;
		this.left = RODE_SIDE - LINE_WIDTH;
		this.right = width - RODE_SIDE;
	}
	
	public int getHeight() {
		return height;
	}


	/**
	 * Overridden form interface AnimatedGameArtifacts
	 */
	@Override
	public void animateFrame(long frameNumber) {
		start = (int) (frameNumber % totalLineHeight) * speed;
	}
	
	/**
	 * Overridden form interface AnimatedGameArtifacts
	 */
	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * Overridden form interface GameArtifacts
	 */
	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		drawLine(graphics, left);
		drawLine(graphics, right);
	}

	/**
	 * Method that is drawing one line with objects graphics (from class Graphics) and placing the position
	 * @param graphics - object that is made with class Graphics which we import.
	 * @param position - position on axis 'x' where we want to put line.
	 */
	private void drawLine(Graphics graphics, int position) {
		int y = start - speed * totalLineHeight;
		while (y < height + totalLineHeight) {
			graphics.drawRect(position, y, LINE_WIDTH, lineHeight);
			y += 70;
		}
		
	}
	
	// end of class
}
