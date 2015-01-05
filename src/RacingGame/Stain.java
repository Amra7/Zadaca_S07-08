package RacingGame;

import java.awt.Color;
import java.awt.Graphics;

public class Stain extends Vehicle  implements AnimatedGameArtifact {
	
	private int speed;
	private int roadHeight;
	private int minX;
	private int maxX;
	
	public static int STAINHEIGTH = 20;
	public static  int STAINWIDTH = 30;
	
	
	
	public Stain(int minX, int maxX, int roadHeight, int speed){
		super(0,0);
		this.minX = minX;
		this.maxX = maxX;
		this.roadHeight = roadHeight;
		setSpeed(speed);
		resetPosition();
		
	}

	@Override
	public void setPosition(int stainX, int stainY) {
		this.x = stainX - STAINHEIGTH/2;
		this.y = stainY - STAINWIDTH/2;
		
	}

	@Override
	public void draw(Graphics graphics) {
		
	//	if (y > -STAINHEIGTH && y < roadHeight) {
		graphics.setColor((new Color(110, 92,52)));
		graphics.fillOval(x, y , STAINWIDTH, STAINHEIGTH);
		graphics.fillOval(x+20, y , STAINWIDTH+10, STAINHEIGTH);
		graphics.fillOval(x+10, y+6 , STAINWIDTH+5, STAINHEIGTH+5);
	//	}
		
		
	}

	@Override
	public void animateFrame(long frameNumbers) {
		if ( y < roadHeight){
		 y += speed;
		}else{
		 resetPosition();
				}
	}

	@Override
	public void resetPosition() {
		setPosition((int) (minX + Math.random() * (maxX - minX)), (int)(-STAINHEIGTH * Math.random() * 10));
      
	}

	@Override
	public void setSpeed(int speed) {
		this.speed = speed/3;
		
	}
	
	

	
}
