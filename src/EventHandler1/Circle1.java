package EventHandler1;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * Class that defines circle
 * @author Amra
 *
 */

public class Circle1 extends JPanel {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	/**
	 * Constructor for Circle using coordinate x and y  and height and width of circle.
	 * @param x = coordinate x of circle.
	 * @param y =  coordinate y of circle.
	 * @param width = width of circle.
	 * @param height = height of circle.
	 */
	public Circle1 ( int x, int y,int width, int height){
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		
	}
	
	/**
	 * Method for drawing a circle
	 * @param g object of class Graphics which help us to draw circle
	 */
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.fillOval(x, y, width, height);
	}

	/**
	 * Method for moving circle
	 * with parameters i and j which define:
	 * i = how much you want to move circle in x direction,
	 * j = how much you want to move circle in y direction.
	 */
	public void move(int i, int j) {
		x+=i;
		y+=j;
		
	}


	
	
}



