package EventHandler3;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Panel extends JPanel {

	Circle c;
	
	/**
	 * Constructor for Panel
	 */
	public Panel(){
		c = new Circle(12, 12, 40, 40);
		
		addKeyListener(new KeyListener(){
		
			@Override
			public void keyPressed(KeyEvent e) {
		        
				if( e.getKeyCode() == KeyEvent.VK_LEFT){
					c.move(-2,0);
					repaint();
				} else if( e.getKeyChar() == KeyEvent.VK_RIGHT){
					c.move(2,0);
					repaint();
				} else if (e.getKeyCode() == KeyEvent.VK_UP){
					c.move(0,-2);
					repaint();
				} else if ( e.getKeyCode() == KeyEvent.VK_DOWN){
					c.move(0,2);
					repaint();
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
		});
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		c.draw(g);
	}
}
