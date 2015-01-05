package RacingGame;


import java.awt.Color;
import java.awt.Graphics;

/**
 *Create Truck and implements  GameArtifact that has one method:
 *     void draw(Graphics graphics);
 * @author Amra
 *
 */
public class Truck implements GameArtifact {
	public static int WIDTH = 60;
	public static int HEIGHT = 70;
	
	public static int WIDTH_HALF = WIDTH/2;
	public static int HEIGHT_HALF = HEIGHT/2;
	
	protected int x;
	protected int y;
	
	private int crashFrame; 


	/**
	 * Constructs Truck  with setting center position of vehicle.
	 * @param x
	 * @param y
	 */
	public Truck(int x, int y) {
		setPosition(x, y);
	}
	
	/**
	 * Received coordinates increases for the dimensions 
	 * of the object and sets them as the center of the object.
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
		} else { 
		drawCar(graphics, Color.GRAY);
		}
	}
	
	/**
     * Method that is drawing Vehicle with object graphics form Graphics class
     *  and object color from Color class thet are imported.
     * @param graphics - object created with Graphics class which is imported.
     * @param c - object created with Color class which is imported.
     */
	protected void drawCar(Graphics graphics, Color c) {
		graphics.setColor(c);
		graphics.fillRect(x, y, WIDTH, HEIGHT);
		graphics.fillRect(x, y+75, WIDTH, HEIGHT-30);
		graphics.fillRect(x-5, y+5, 5, 15);
		graphics.fillRect(x-5, y+80, 5, 15);
		graphics.fillRect(x+60, y+5, 5, 15);
		graphics.fillRect(x+60, y+80, 5, 15);
		graphics.setColor(new Color(195, 214,211));
		graphics.fillRect(x+10, y+80, 40, 20);
		
	}


	/**
	 * Method is empty because it is overridden.
	 */
	
	public void resetPosition() {
		
	}
	
	// end of class
}
