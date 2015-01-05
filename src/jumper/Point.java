package jumper;

public class Point {

	private int x;
	private int y;
	
	/**
	 * Constructors for Point with parameters x and y
	 * @param x - coordinate x
	 * @param y - coordinate y
	 */
	public Point(int x, int y){
		this.x=x;
		this.y=y;
	}

	/**
	 * Getters
	 * @return
	 */
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	/**
	 * Setters
	 * @param x
	 */
	public void setX( int x){
		this.x = x;
	}
	
	public void setY( int y){
		this.y = y;
	}
	
	/**
	 * Method that gives you distance between two points
	 * @param other - other point
	 * @return value of the distance between two points
	 */
	public int getDistance(Point other) {
		int dx = (this.x - other.x)*(this.x - other.x);
		int dy = (this.y - other.y) *(this.y - other.y);
		int result = (int)(Math.sqrt(dx + dy));
		
		return  result;
	}
	
	/**
	 * Method that moves points with two parameters speedX and speedY
	 * @param speedX - speed for coordinate x
	 * @param speedY - speed for coordinate y
	 */
	public void move (int speedX, int speedY){
		this.x += speedX;
		this.y += speedY;
	}

	
}
