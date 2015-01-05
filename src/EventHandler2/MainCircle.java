package EventHandler2;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class MainCircle {
	
	static Circle2 c;
/**
 * Main method were main window is created and the circle is added to it.
 * The window is space where we draw a circle that moves
 * @param args
 */
public static void main(String[] args)  {
	
	JFrame window =  new JFrame("Buble window");
	window.setSize(600, 600);
	MainCircle mc = new MainCircle();
	mc.
	
	 c = new Circle2(10, 10, 40, 40);
	Draw panel = new Draw();
	panel.add(c);
	Circle2EventHandler cev = new Circle2EventHandler(c, panel);
	panel.addKeyListener(cev);
	window.setContentPane(panel);
	
	
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    panel.requestFocus(false);

}

/**
 * Method on which help us to draw elements on window frame.
 */
public static class Draw extends JPanel {

public void paintComponent(Graphics g){
	super.paintComponent(g);
	(c).draw(g);
}

}

/**
 * Class Circle1EventHandler is where we define how the circle is going to react on keys event.
 */
public static class Circle2EventHandler implements KeyListener{

	private Circle2 c;
	private JPanel panel;
	
	/**
	 * Constructor for new object Circle1 Event Handler
	 * @param c1 = Circle that we are drawing
	 * @param panel = panel on which we are drawing circle
	 */
	 public Circle2EventHandler(Circle2 c, JPanel panel) {
		this.c = c;
		this.panel = panel;

	}
	
	/**
	 * Method where we define how the circle is moving with keyboard
	 * @param e = keys event on keyboard
	 */
	@Override
	public void keyPressed(KeyEvent e) {
        
		if( e.getKeyCode() == KeyEvent.VK_LEFT){
			c.move(-2,0);
			panel.repaint();
		} else if( e.getKeyChar() == KeyEvent.VK_RIGHT){
			c.move(2,0);
			panel.repaint();
		} else if (e.getKeyCode() == KeyEvent.VK_UP){
			c.move(0,-2);
			panel.repaint();
		} else if ( e.getKeyCode() == KeyEvent.VK_DOWN){
			c.move(0,2);
			panel.repaint();
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
}
