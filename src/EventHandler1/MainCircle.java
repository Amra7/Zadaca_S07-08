package EventHandler1;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Main method of moving circle animation
 * @author Amra
 *
 */

public class MainCircle {
	
	static Circle1 c1;
	
public static void main(String[] args) {
	
	c1 = new Circle1(12,12,40,40);
	JFrame window = new JFrame("Bubble window");
	window.setSize(600, 600);
		
	Draw panel = new Draw();
	window.setContentPane(panel);
	panel.add(c1);

	Circle1EventHandler cev = new Circle1EventHandler(c1, panel);
	panel.addKeyListener(cev);
	
	window.setVisible(true);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.requestFocus(false);
}

/**
 * Method on which help us to draw elements on window frame.
 * @author Amra
 *
 */
public static class Draw extends JPanel{
	public void paintComponent (Graphics g){
		super.paintComponent(g);
		c1.draw(g);
	}
}


}
