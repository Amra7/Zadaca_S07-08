package jumper;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GameGraphics extends JPanel implements ActionListener {


	private Timer animation;
	private Body[] elements;
	private int elementsCount;

	private int windowWidth;
	private int windowHeigth;
	
	private Body player;
	private Date start;

	/**
	 * Constructor for GameGraphics
	 * @param windowWidth - width of the window
	 * @param windowHeigth - height of the window
	 */
	public GameGraphics(int windowWidth, int windowHeigth) {
		super();
		animation = new Timer(1000 / 60, this);
		elements = new Body[10];
		elementsCount = 1;		

		animation.start();
		start = new Date();
		this.windowWidth = windowWidth;
		this.windowHeigth = windowHeigth;
	
	    createObsticle(elements, elementsCount);
	}

	/**
	 * Method that draws body
	 */
	public void paintComponent(Graphics g) {
		Date end =  new Date();
		long points = end.getTime() - start.getTime();
		
		super.paintComponent(g);
		this.setBackground(new Color(164, 242, 245));
		g.setColor(new Color(54, 140, 22));
		g.fill3DRect(0, 400, 500, 100, true); //
		for (int i = 0; i < elements.length; i++) {
			elements[i].draw(g);
			// elements[i].jump();
//			if (player.checkCollision(elements[i])){
//				animation.stop();
//				JOptionPane.showMessageDialog(null, "Izgubio si");
//				break;
//			}
			if ( elements.length == 0) {
				JOptionPane.showMessageDialog(null, "Pobjedio si");
			break;
			}
		}
		player.draw(g);
		g.drawString(Long.toString(points), 50, 50);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();

	}
	
	private class KeyHandler extends KeyAdapter {
		public void keyTyped( KeyEvent e){
			player.jump();
		}
	}
	
	public void createObsticle( Body[] elements, int elementsCount ){
		
		
		for (int i = 0; i < elements.length; i++) {
			
			int widthOval = (int) (10 + Math.random() * (30 - (1 + 1)));
			
			int positionX = (int) (500 + Math.random() * (2000 - (500 + 1)));
			int positionY = windowHeigth - 100 - widthOval;
			
			int speedXOval = -(int) (2 + Math.random() * (6 - (1 + 1)));
			int speedYOval = 0;

			elements[i] = new Oval(positionX, positionY, widthOval, widthOval,
					Color.DARK_GRAY, speedXOval, speedYOval, 0, 0, windowWidth,
					windowHeigth - 100);
	//		System.out.println("Printa krugove");
			 
			elementsCount++;
			
			player = new Oval(windowWidth/2, windowHeigth - 100 - 40, 40, 40, Color.RED,
				0, 0, 0, 0, windowWidth, windowHeigth - 100);
			
		    addKeyListener(new KeyHandler());   
		    
		   
		}
	}
}
