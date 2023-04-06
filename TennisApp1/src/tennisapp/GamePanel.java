package tennisapp;

import java.awt.*;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class GamePanel extends JPanel {
	Circle circle;
	int dx, dy, dt=50;
	Timer timer;
	
	public GamePanel() {
		dx = 2; dy=2;		
		circle = new Circle(10,50,10);
		
		timer = new Timer();
		repaint();
		
		setTimerSchedule(dt);	
	}	
	
	private void move() {
		int w = getWidth();		
		int x = circle.x + dx;
		if (x + circle.r > w) {
			x = w - circle.r -1;
			dx *= -1;
		}
		else if (x - circle.r < 0) {
			x = circle.r + 1 ;
			dx *= -1;
		}
		circle.x = x;
		
		
		int h = getHeight();		
		int y = circle.y + dy;
		if (y + circle.r > h) {
			y = h - circle.r -1;
			dy *= -1;
		}
		else if (y - circle.r < 0) {
			y = circle.y + 1 ;
			dy *= -1;
		}
		circle.y = y;		
		
	}
	
	
	
	public void setSpeed(int value){
		dt = dt - value;		
		setTimerSchedule(dt);		
	}
	
	private void setTimerSchedule(int ms) {
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
				  move();
				  repaint();
			  }
			}, ms, ms);
	}
	
	public void setDirectionX(int d) {
		if (d*dx>=0) return;
		dx *= -1; 
	}
	public void setDirectionY(int d) {
		if (d*dy >=0) return;
		dy *= -1; 
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(300, 100);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.RED);
		g.fillOval(circle.x  - circle.r, circle.y - circle.r,
				circle.r * 2, circle.r * 2);
	}

}
