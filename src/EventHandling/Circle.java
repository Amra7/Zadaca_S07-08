package EventHandling;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 * Class Circel were we create circle.
 * T
 * @author Amra
 *
 */
public class Circle extends JPanel implements ActionListener {

	private int x;
	private int y;
	private int width;
	private int height;
	private int frame = 0;
	
	public Circle(int x, int y,int width, int height){
		super();
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this. frame = 0;
	}
	

/**
 * Main method were main window is created and the circle is added to it.
 * The window is space where we draw a circle that moves
 * @param args
 */
public static void main(String[] args)  {
	
	JFrame window =  new JFrame("Buble window");
	window.setSize(600, 600);
	
	Circle c = new Circle(10, 10, 40, 40);
	window.add(c);
	
	Timer t = new Timer(100/60, c);
	t.start();
	
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
	
	
	
}
/**
 * Draws every frame of animation.
 * Position of every drawn element is determined with timer object.
 * See actionPerformed
 */
public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.fillOval(x + frame/4, y + frame/4, width, height);
}

/**
 * Handler for 'Triggering ' the timer.
 * This method is called 60 times per second.
 * When we start timer, we change the position of drawn elements.
 */
@Override
public void actionPerformed(ActionEvent arg0) {
	frame++;
	repaint();
	
}
	
}
