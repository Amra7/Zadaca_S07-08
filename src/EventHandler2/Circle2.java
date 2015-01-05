package EventHandler2;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import EventHandler1.Circle1;

public class Circle2 extends Component  {

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
	public Circle2(int x, int y,int width, int height){
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
	public void draw(Graphics  g){
		g.setColor(Color.DARK_GRAY);
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