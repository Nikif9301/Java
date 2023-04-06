package tennisapp;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

class TennisGame extends JFrame implements KeyListener {
	GamePanel gamepanel;
	
	public TennisGame() {
		setTitle("Tennis Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		gamepanel = new GamePanel();
		//gamepanel.setPreferredSize(new Dimension(300,100));
		add(gamepanel);
		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		addKeyListener(this);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if( key == KeyEvent.VK_LEFT) {
			gamepanel.setDirectionX(-1);
		}else if (key == KeyEvent.VK_RIGHT) {
			gamepanel.setDirectionX(1);
		}
		if( key == KeyEvent.VK_UP) {
			gamepanel.setDirectionY(-1);
		}else if (key == KeyEvent.VK_DOWN) {
			gamepanel.setDirectionY(1);
		}
		else if (key == KeyEvent.VK_F2) {
			gamepanel.setSpeed(-5);
		}
		else if (key == KeyEvent.VK_F8) {
			gamepanel.setSpeed(5);
		}
	}

	@Override
	public void keyReleased(KeyEvent e){}
	
	@Override
	public void keyTyped(KeyEvent e){}
}