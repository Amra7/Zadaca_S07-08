package MyGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MyGameGraphic extends JPanel implements ActionListener  {

	private Ball ball;
	private Wall wall;
	private Racket racket; 
	
	private Timer animation;
	
	private int windowWidth;
	private int windowHeight;
	
	public MyGameGraphic (int windowWidth, int windowHeight){
		super();
		
		racket = new Racket(300, 500, 150,20, Color.DARK_GRAY, 3,3, 0,0,500,500);
		ball = new Ball (300, 470, 30,30, new Color(31,112,28), 3,3,0,0,500,500);
		
		addKeyListener ( new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if ( e.getKeyCode() == KeyEvent.VK_LEFT){
					
					racket.move(-15,0);
					repaint();
					
				} else if ( e.getKeyCode() == KeyEvent.VK_RIGHT){
					racket.move(15,0);
					repaint();
					
				} else if ( e.getKeyCode() == KeyEvent.VK_UP){
					racket.move(0,-15);
					repaint();
					
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN){
					racket.move(0,15);
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
		
		addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt) {
				requestFocus();
			}
		});
		
		addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent evt) {
				animation.start();
				repaint();
			}

			@Override
			public void focusLost(FocusEvent arg0) {
				animation.stop();
				repaint();
				
			}
		});
		
		animation = new Timer( 1000/60, this);
		animation.start();
		this.windowWidth = windowWidth;
		this.windowHeight = windowHeight;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int speedX = 1;
		int speedY = -5;
		ball.move(speedX, speedY);
		repaint();
		
		
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		this.setBackground(new Color( 123,191,133));
		racket.draw(g);
		ball.draw(g);
	}
	
	
		
	}

