package Aplicacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import Entidades.Painel;

public class Janela extends JFrame{
	
	private Painel[][] paineis;
	
	public Janela() {
		
		configuracoes();
		this.paineis = new Painel[8][8];
		
		for(int i = 0;i<8;i++) {
			for(int j = 0;j<8;j++) {
				this.paineis[i][j] = new Painel();
				
				if((i+j) %2 == 0) {
					this.paineis[i][j].setBackground(Color.black);
				}else this.paineis[i][j].setBackground(Color.white);
				
				this.add(this.paineis[i][j]);
			}
		}
	}
	
	
	public void configuracoes(){
		this.setVisible(true);
		this.setSize(700,700);
		this.setLocationRelativeTo(null);
		this.setLayout(new GridLayout(8,8));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				releaseMouse(e);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				pressMouse(e);
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				clickMouse(e);
			}
		});
		
		this.repaint();
	}
	
	public void clickMouse(MouseEvent e) {
		System.out.println("Clicou");
		System.out.println("X: " + e.getX() + " Y: " + e.getY());
	}
	
	public void pressMouse(MouseEvent e) {
		System.out.println("Pressionou");
		System.out.println("X: " + e.getX() + " Y: " + e.getY());
	}
	
	public void releaseMouse(MouseEvent e) {
		System.out.println("Soltou");
		System.out.println("X: " + e.getX() + " Y: " + e.getY());
	}

}
