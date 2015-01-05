package EventHandler1;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

/**
 * Class Circle1EventHandler is where we define how the circle is going to react on keys event.
 * @author Amra
 *
 */

public class Circle1EventHandler implements KeyListener{

	private Circle1 c1;
	private JPanel panel;
	
	/**
	 * Constructor for new object Circle1 Event Handler
	 * @param c1 = Circle that we are drawing
	 * @param panel = panel on which we are drawing circle
	 */
	 public Circle1EventHandler(Circle1 c1, JPanel panel) {
		this.c1 = c1;
		this.panel = panel;

	}
	
	/**
	 * Method where we define how the circle is moving with keyboard
	 * @param e = keys event on keyboard
	 */
	@Override
	public void keyPressed(KeyEvent e) {
        
		if( e.getKeyCode() == KeyEvent.VK_LEFT){
			c1.move(-2,0);
			panel.repaint();
		} else if( e.getKeyChar() == KeyEvent.VK_RIGHT){
			c1.move(2,0);
			panel.repaint();
		} else if (e.getKeyCode() == KeyEvent.VK_UP){
			c1.move(0,-2);
			panel.repaint();
		} else if ( e.getKeyCode() == KeyEvent.VK_DOWN){
			c1.move(0,2);
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
