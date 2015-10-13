package com.weebly.lightsoutg4ming.towerdefense;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public static void main(String[] args){
		new Frame();
	}
	
	public Frame(){
		setTitle("Tower Defense!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		setUndecorated(true);
		setResizable(false);
		setVisible(true);
		
		Screen screen = new Screen(this);
		add(screen);
	}
	
}
