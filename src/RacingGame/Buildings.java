package RacingGame;

import java.awt.Color;
import java.awt.Graphics;

public class Buildings  implements AnimatedGameArtifact{

	
	private int left;
	private int right;
	private int speed;
	private int height;
	
	public static int BUILDING_SIDE = 100;
	public static int BUILDING_WIDTH = 120;
	
	private int lineHeight = 260;
	private int lineSpace = 60;
	private int totalLineHeight = lineHeight + lineSpace;
	
	private int start;

	public Buildings (int width, int height, int speed) {
		this.height = height;
		this.speed = speed;
		this.left = BUILDING_SIDE - BUILDING_WIDTH;
		this.right = width - BUILDING_SIDE;
	}

	@Override
	public void animateFrame(long frameNumber) {
		start = (int) (frameNumber % totalLineHeight) * speed;
	}
	
	@Override
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void draw(Graphics graphics) {
		graphics.setColor(Color.BLACK);
		drawLine(graphics, left);
		drawLine(graphics, right);
	}

	private void drawLine(Graphics graphics, int position) {
		int y = start - speed * totalLineHeight;
		while (y < height + totalLineHeight) {
			/*shape of building*/
			graphics.drawRect(position, y, BUILDING_WIDTH, lineHeight);
			
			/* doors */
//			graphics.drawRect(position , y +20, 40, 40);
//			graphics.drawRect(position , y +80, 40, 40);
//			graphics.drawRect(position , y +140, 40, 40);
//			graphics.drawRect(position , y +200, 40, 40);
//			
//			/* widows*/
//			graphics.drawRect(position + 60, y +20, 65, 15);
//			graphics.drawRect(position + 60, y +40, 65, 15);
//			graphics.drawRect(position + 60, y +60, 65, 15);
//		
			y += 350;
		}
		
	}
}
