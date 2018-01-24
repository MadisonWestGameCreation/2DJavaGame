package com.basicgame;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;


import javax.imageio.ImageIO;


public class BasicGame {
	private final int WIDTH;
	private final int HEIGHT;


	public  BasicGame(int width, int height) {
		WIDTH = width;
		HEIGHT = height;
	}
	
	public static BufferedImage loadImage(String filepath) {
		BufferedImage output = null;
		try {
		    output = ImageIO.read(new File(filepath));
		} catch (IOException e) {
			System.out.println("Failed to load image");
		}
		return output;
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g) {
		((Graphics2D)g).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_LCD_HRGB); //makes text look so much better! At least on my computer...
		
		
	}
	
}
