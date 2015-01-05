package MyGame;

import java.awt.Color;
import java.awt.Graphics;

public class Body {

	protected Point start;
	protected Point center;
	protected int width;
	protected int height;
	private Color color;
	private int speedX;
	private int speedY;

	private int minX;
	private int minY;
	private int maxX;
	private int maxY;

	public Body(int x, int y, int width, int height, Color color, int speedX,
			int speedY, int minX, int minY, int maxX, int maxY) {
		this.start = new Point(x, y);
		this.center = new Point(x - width / 2, y - height / 2);
		this.width = width;
		this.height = height;
		this.color = color;
		this.speedX = speedX;
		this.speedY = speedY;
		this.minX = minX;
		this.minY = minY;
		this.maxX = maxX;
		this.maxY = maxY;

	}

	public void draw(Graphics g) {

	}

	public void move(int speedX, int speedY) {
		/* varijanta za move */

		if ((this.start.getX() + this.getWidth() + speedX) >= maxX
				&& speedX > 0) {
			speedX = -speedX / 2;
			this.start.setX(maxX - this.getWidth());
			this.center.setX(maxX - this.getWidth() / 2);
		}

		if ((this.start.getY() + this.height + speedY) >= maxY && speedY > 0) {
			speedY = -speedY / 2;
			this.start.setY(maxY - this.height);
			this.center.setY(maxY - this.height / 2);

		}

		if ((this.start.getX() + speedX) <= minX && speedX < 0) {
			speedX = -speedX / 2;
			this.start.setX(minX);
			this.center.setX(minX - this.getWidth() / 2);
		}
		if ((this.start.getY() + speedY) <= minY && speedY < 0) {
			speedY = -speedY / 2;
			this.start.setY(minY);
			this.center.setX(minY - this.getWidth() / 2);
		}

		this.start.move(speedX, speedY);
		this.center.move(speedX, speedY);
	}

	public boolean checkColision(Body other) {
		int d = this.center.getDistance(other.center);
		int sumWidth = this.width / 2 + other.width / 2;
		int sumeHeight = this.height / 2 + other.height / 2;

		if (d > sumWidth && d > sumeHeight)
			return false;
		return true;
	}

	public Point getStart() {
		return start;
	}

	public void setStart(Point start) {
		this.start = start;
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSpeedX() {
		return speedX;
	}

	public void setSpeedX(int speedX) {
		this.speedX = speedX;
	}

	public int getSpeedY() {
		return speedY;
	}

	public void setSpeedY(int speedY) {
		this.speedY = speedY;
	}

	public int getMinX() {
		return minX;
	}

	public void setMinX(int minX) {
		this.minX = minX;
	}

	public int getMinY() {
		return minY;
	}

	public void setMinY(int minY) {
		this.minY = minY;
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

}
