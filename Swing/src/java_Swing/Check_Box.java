package java_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Check_Box extends JFrame {
	
	boolean p1 = false,p2=false,p3=false,p4=false,p5=false; 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Check_Box frame = new Check_Box();
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
	public Check_Box() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Marque as caixas com as linguagens que você gosta!");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(45, 11, 349, 37);
		contentPane.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C");
		chckbxNewCheckBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					p1 = true;
				}else {
					p1 = false;
				}
			}
		});
		chckbxNewCheckBox.setBackground(Color.PINK);
		chckbxNewCheckBox.setBounds(55, 55, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxC = new JCheckBox("C++");
		chckbxC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					p2 = true;
				}else {
					p2 = false;
				}
			}
		});
		chckbxC.setBackground(Color.ORANGE);
		chckbxC.setBounds(55, 81, 97, 23);
		contentPane.add(chckbxC);
		
		JCheckBox chckbxC_1 = new JCheckBox("C#");
		chckbxC_1.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					p3 = true;
				}else {
					p3 = false;
				}
			}
		});
		chckbxC_1.setBackground(Color.GRAY);
		chckbxC_1.setBounds(55, 107, 97, 23);
		contentPane.add(chckbxC_1);
		
		JCheckBox chckbxJava = new JCheckBox("Java");
		chckbxJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					p4 = true;
				}else {
					p4 = false;
				}
			}
		});
		chckbxJava.setBackground(Color.GREEN);
		chckbxJava.setBounds(55, 133, 97, 23);
		contentPane.add(chckbxJava);
		
		JCheckBox chckbxPython = new JCheckBox("Python");
		chckbxPython.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					p5 = true;
				}else {
					p5 = false;
				}
			}
		});
		chckbxPython.setBackground(Color.MAGENTA);
		chckbxPython.setBounds(55, 159, 97, 23);
		contentPane.add(chckbxPython);
		
		JButton btnNewButton = new JButton("Submeter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = "You like: ";
				if(p1 == true) msg+="C, ";
				if(p2 == true) msg+="C++, ";
				if(p3 == true) msg+= "C#, ";
				if(p4 == true) msg+= "Java, ";
				if(p5 == true) msg+= "Python, ";
				
				JOptionPane.showMessageDialog(null, msg);
			}
		});
		btnNewButton.setBounds(180, 107, 89, 23);
		contentPane.add(btnNewButton);
	}
}
