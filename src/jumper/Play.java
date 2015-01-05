package jumper;

import javax.swing.JFrame;
/**
 * Main window of this animation
 */
public class Play {
public static void main(String[] args) {
	
	JFrame  window = new JFrame("Game");
	window.setSize(500, 500);
	GameGraphics gg = new GameGraphics(500, 500);
	window.setContentPane(gg);

	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.setVisible(true);

	gg.requestFocus(false); 
	
	
}
}
