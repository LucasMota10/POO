package Projeto;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Introducao {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		JButton b = new JButton();
		
		frame.setVisible(true);
		frame.setSize(1000,1000);
		frame.setResizable(true);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//b.setSize(100,100);
		//frame.add(b);
		
		JPanel panel = new JPanel();
		panel.setSize(200,200);
		panel.setBackground(Color.gray);
		frame.add(panel);
		
		JLabel label = new JLabel("Teste");
		label.setFont(new Font("Arial",Font.BOLD, 24));
		label.setSize(30,30);
		label.setOpaque(true);
		label.setBackground(Color.cyan);
		panel.add(label);
		
		JTextField txfield = new JTextField("Text Field");
		panel.add(txfield);
		
	}
	
}

