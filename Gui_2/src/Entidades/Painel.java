package Entidades;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.*;

public class Painel extends JPanel{	
	
	private static int num = 0;
	
	public Painel() {
	

}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		Image image = new ImageIcon("PeaoPreto.png").getImage();
		g.drawImage(image,40,40,80,80,null);
	}
}
