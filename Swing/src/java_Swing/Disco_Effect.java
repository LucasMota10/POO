package java_Swing;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Disco_Effect extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Disco_Effect frame = new Disco_Effect();
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
	public Disco_Effect() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Thread t = new Thread(new Runnable() { 
			
			public void run() {
				try {
					while(true) {
						getContentPane().setBackground(Color.RED);
						Thread.sleep(100);
						getContentPane().setBackground(Color.BLUE);
						Thread.sleep(100);
						getContentPane().setBackground(Color.YELLOW);
						Thread.sleep(100);
						getContentPane().setBackground(Color.ORANGE);
						Thread.sleep(100);
						getContentPane().setBackground(Color.GREEN);
						Thread.sleep(100);
					}
				}
				catch(Exception e) {}
			}
			
		});
		t.start();
	}

}
