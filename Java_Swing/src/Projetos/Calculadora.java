package Projetos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField n1;
	private JTextField n2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(163, 11, 120, 49);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Primeiro Número");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(20, 100, 126, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Segundo Número");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1_1.setBounds(20, 134, 109, 14);
		contentPane.add(lblNewLabel_1_1);
		
		n1 = new JTextField();
		n1.setBounds(139, 98, 86, 20);
		contentPane.add(n1);
		n1.setColumns(10);
		
		n2 = new JTextField();
		n2.setBounds(139, 132, 86, 20);
		contentPane.add(n2);
		n2.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				int sum = num1 + num2;
				JOptionPane.showMessageDialog(null, "A soma eh: " + sum);
			}
		});
		btnNewButton.setBounds(20, 179, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtrair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				int sum = num1 - num2;
				JOptionPane.showMessageDialog(null, "A subtração eh: " + sum);
			}
		});
		btnNewButton_1.setBounds(119, 179, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Multiplicar");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				int sum = num1 * num2;
				JOptionPane.showMessageDialog(null, "A multiplicação eh: " + sum);
			}
		});
		btnNewButton_1_1.setBounds(220, 179, 89, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("Dividir");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(n1.getText());
				int num2 = Integer.parseInt(n2.getText());
				int sum = num1 / num2;
				JOptionPane.showMessageDialog(null, "A divisão eh: " + sum);
			}
		});
		btnNewButton_1_1_1.setBounds(324, 179, 89, 23);
		contentPane.add(btnNewButton_1_1_1);
	}

}
