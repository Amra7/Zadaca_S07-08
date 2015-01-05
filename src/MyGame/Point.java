package MyGame;

public class Point {
	
	private int x;
	private int y;
	
	/**
	 * Constructor for making Point with two parameters coordinate x and y.
	 */
	public Point ( int x,  int  y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * Method that moves points with two parameters speedX and speedY
	 * @param speedX - speed for coordinate x
	 * @param speedY - speed for coordinate y
	 */
	public void move ( int speedX, int speedY){
		this.x += speedX;
		this.y += speedY;
	}
	
	public int getDistance(Point other){
		int distanceX = (this.x - other.x)*(this.x - other.x);
		int distanceY = (this.y - other.y)*(this.y - other.y);
		
		int result = (int)(Math.sqrt(distanceX + distanceY));
		
		return result;
	}
	
}
