package com.weebly.lightsoutg4ming.towerdefense;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Screen extends JPanel implements Runnable{
	
	Thread thread = new Thread(this);
	Frame frame;
	
	private int fps = 0;
	
	public Screen(Frame frame){
		this.frame = frame;
		thread.start();
		this.frame.addKeyListener(new KeyHandler());
	}
	
	public void paintComponent(Graphics g){
		g.clearRect(0, 0, frame.getWidth(), frame.getHeight());
		
		g.drawString(fps+" fps", 10, 20);
	}

	public void run() {
		long lastFrame = System.currentTimeMillis();
		int frames = 0;
		
		while(true){
			repaint();
			
			frames++;
			if(System.currentTimeMillis() - 1000 >= lastFrame){
				fps = frames;
				frames = 0;
				lastFrame = System.currentTimeMillis();
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {}
		}
		
	}
	
}
