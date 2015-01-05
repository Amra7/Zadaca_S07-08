package MyGame;

import java.awt.Color;
import java.awt.Graphics;


public class Racket extends Body {

	public Racket(int x, int y, int width, int height, Color color, int speedX , int speedY, int minX, int minY, int maxX, int maxY) {
		super(x, y, width, height, color, speedX, speedY,  minX,  minY, maxX, maxY);
		
	}

	@Override
	public void draw(Graphics g){
		g.setColor(Color.DARK_GRAY);
		g.fillRect(super.start.getX(), super.start.getY(), super.width, super.height);
	}

	
	@Override
	public void move(int speedX, int speedY){
		this.start.move(speedX, speedY);
		this.center.move(speedX, speedY);
	}
		
	}
	
	



