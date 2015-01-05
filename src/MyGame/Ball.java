package MyGame;

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Body {

	
	public Ball(int x, int y, int width, int height, Color color,int speedX, int speedY,int minX, int minY, int maxX, int maxY) {
		super(x, y, width, height, color, speedX, speedY, minX,  minY, maxX, maxY);

	}

	@Override
	public void draw(Graphics g){
		g.setColor(Color.BLACK);
		g.drawOval(super.start.getX(), super.start.getY(), super.width, super.height);
		g.setColor(new Color(31,112,28));
		g.fillOval(super.start.getX(), super.start.getY(), super.width, super.height);
	}
	
	public void move(int speedX, int speedY){
		this.start.move(speedX, speedY);
		this.center.move(speedX, speedY);
	}

}
