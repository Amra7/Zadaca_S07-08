package MyGame;

import javax.swing.JFrame;


public class PlayMyGame {
	

public static void main(String[] args) {
	    MyGameGraphic mgg = new MyGameGraphic(600,600);
		
		JFrame window = new JFrame("My Game");
		window.setSize(600, 600);
		window.setContentPane(mgg);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		
		
	}
	
	
}
