package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Height {
	double height;
	double weight;
	double result1;
	double result2;
	String ans1,ans2;

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Height window = new Height();
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
	public Height() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Height and Weight Converter v.Beta 0.12.1");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(276, 80, 46, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(276, 115, 46, 14);
		frame.getContentPane().add(label_1);

		
		JLabel lblHeight = new JLabel("Height");
		lblHeight.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHeight.setBounds(49, 80, 56, 14);
		frame.getContentPane().add(lblHeight);
		
		JLabel lblNewLabel = new JLabel("Weight");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(49, 115, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(131, 77, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 112, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("US measurment");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(133, 40, 98, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Ok");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				height=Double.parseDouble(textField.getText());
				textField.setText("");
				weight=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
			    result1=height/(3.2808);
				ans1=String.format("%.2f m",result1);
				label.setText(ans1);
				result2=weight/(2.2046);
				ans2=String.format("%.2f kg",result2);
				label_1.setText(ans2);
				}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton.setBounds(128, 174, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(null);
				label_1.setText(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnNewButton_1.setBounds(249, 174, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		
		JLabel lblHelp = new JLabel("Help");
		lblHelp.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblHelp);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setBounds(59, 11, 46, 14);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblNewLabel_2 = new JLabel("Metric");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(276, 42, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
				
		
	}
}
