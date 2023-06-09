package Account_data;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Registration_data {

	private JFrame frame;
	private JTextField tb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration_data window = new Registration_data();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registration_data() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.PINK);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reagistration");
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(243, 37, 165, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(126, 106, 109, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Gender");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setBounds(126, 157, 109, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb = new JTextField();
		tb.setBounds(361, 114, 152, 20);
		frame.getContentPane().add(tb);
		tb.setColumns(10);
		
		JCheckBox r1 = new JCheckBox("female");
		r1.setBounds(361, 163, 67, 23);
		frame.getContentPane().add(r1);
		
		JCheckBox r2 = new JCheckBox("male ");
		r2.setBounds(442, 163, 67, 23);
		frame.getContentPane().add(r2);
		
		JLabel lblNewLabel_3 = new JLabel("Branch");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel_3.setBounds(126, 212, 109, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox co = new JComboBox();
		co.setModel(new DefaultComboBoxModel(new String[] {"branch", "cse", "it", "ds", "iot", "cs"}));
		co.setBounds(361, 219, 152, 22);
		frame.getContentPane().add(co);
		
		JLabel lblNewLabel_4 = new JLabel("programming language");
		lblNewLabel_4.setBounds(126, 271, 109, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		JCheckBox cb1 = new JCheckBox("c");
		cb1.setBounds(360, 275, 36, 23);
		frame.getContentPane().add(cb1);
		
		JCheckBox cb3 = new JCheckBox("java");
		cb3.setBounds(453, 275, 60, 23);
		frame.getContentPane().add(cb3);
		
		JCheckBox cb2 = new JCheckBox("c++");
		cb2.setBounds(400, 275, 51, 23);
		frame.getContentPane().add(cb2);
		
		JButton btn = new JButton("Submit");
		btn.setBounds(257, 336, 89, 23);
		frame.getContentPane().add(btn);
		frame.setBounds(100, 100, 728, 429);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
