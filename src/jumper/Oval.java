package jumper;

import java.awt.Color;
import java.awt.Graphics;

public class Oval extends Body{

	/**
	 * Constructor for Oval
	 * @param x - coordinate x of oval
	 * @param y - coordinate y of oval
	 * @param width - width of oval
	 * @param heigth - height of oval
	 * @param color - color of oval
	 * @param speedX - speed of oval in direction of coordinate x
	 * @param speedY - speed of oval in direction of coordinate y
	 * @param minX - minimum x of oval direction
	 * @param minY - minimum y of oval direction
	 * @param maxX -  maximum x of oval direction
	 * @param maxY - maximum y of oval direction
	 */
	public Oval(int x, int y, int width, int heigth, Color color, int speedX,
			int speedY, int minX, int minY, int maxX, int maxY) {
		super(x, y, width, heigth, color, speedX, speedY, minX, minY, maxX, maxY);
		
		
	}
	
	/**
	 * Method that draws oval
	 */
	public void draw(Graphics g){
		super.draw(g);
//		g.fillOval(super.getStart().getX(), super.getStart().getY(), super.getWidth(), super.getHeigth());
		g.fillOval(super.getX(), super.getY(), super.getWidth(), super.getHeigth());
	}
	

}
