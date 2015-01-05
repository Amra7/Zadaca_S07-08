package EventHandler3;


import java.awt.Panel;
import javax.swing.JFrame;
import javax.swing.JPanel;


/**
 * Main method of moving circle animation
 * 
 * @author Amra
 *
 */

public class MainCircle extends JPanel {


	public static void main(String[] args) {

		
		JFrame window = new JFrame("Bubble window");
		window.setSize(600, 600);

		Panel panel = new Panel();
		System.out.println("Panel");
		window.setContentPane(panel);

		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
