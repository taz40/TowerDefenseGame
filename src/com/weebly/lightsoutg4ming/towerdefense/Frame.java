package com.weebly.lightsoutg4ming.towerdefense;

import javax.swing.JFrame;

public class Frame extends JFrame {
	
	public static void main(String[] args){
		new Frame();
	}
	
	public Frame(){
		setSize(800,600);
		setTitle("Tower Defense!");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);
		
		while(true){
			
		}
	}
	
}
