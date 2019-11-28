package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	double a;
	double b;
	double result;
	String op,ans;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("CALCULATOR");
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(145, 23, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton.getText();
				textField.setText(number);
			}
		});
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(24, 76, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_1.getText();
				textField.setText(number);

			}
		});
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(145, 76, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_2.getText();
				textField.setText(number);

			}
		});
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setBackground(Color.ORANGE);
		btnNewButton_2.setBounds(263, 76, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("+");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setBackground(Color.ORANGE);
		btnNewButton_3.setBounds(366, 76, 58, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_4.getText();
				textField.setText(number);

			}
		});
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(24, 110, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_5.getText();
				textField.setText(number);

			}
		});
		btnNewButton_5.setForeground(Color.BLUE);
		btnNewButton_5.setBackground(Color.ORANGE);
		btnNewButton_5.setBounds(145, 110, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_6.getText();
				textField.setText(number);

			}
		});
		btnNewButton_6.setForeground(Color.BLUE);
		btnNewButton_6.setBackground(Color.ORANGE);
		btnNewButton_6.setBounds(263, 110, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";

				
			}
		});
		btnNewButton_7.setBackground(Color.ORANGE);
		btnNewButton_7.setForeground(Color.BLUE);
		btnNewButton_7.setBounds(366, 110, 58, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_8.getText();
				textField.setText(number);

			}
		});
		btnNewButton_8.setForeground(Color.BLUE);
		btnNewButton_8.setBackground(Color.ORANGE);
		btnNewButton_8.setBounds(24, 151, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("8");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_9.getText();
				textField.setText(number);

			}
		});
		btnNewButton_9.setForeground(Color.BLUE);
		btnNewButton_9.setBackground(Color.ORANGE);
		btnNewButton_9.setBounds(145, 151, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("9");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_10.getText();
				textField.setText(number);

			}
		});
		btnNewButton_10.setForeground(Color.BLUE);
		btnNewButton_10.setBackground(Color.ORANGE);
		btnNewButton_10.setBounds(263, 151, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("*");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";

			}
		});
		btnNewButton_11.setForeground(Color.BLUE);
		btnNewButton_11.setBackground(Color.ORANGE);
		btnNewButton_11.setBounds(366, 151, 58, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.setForeground(Color.BLUE);
		btnNewButton_12.setBackground(Color.ORANGE);
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_12.getText();
				textField.setText(number);

			}
		});
		btnNewButton_12.setBounds(24, 196, 89, 23);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.setForeground(Color.BLUE);
		btnNewButton_13.setBackground(Color.ORANGE);
		btnNewButton_13.setBounds(145, 196, 89, 23);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				b=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=a+b;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=a-b;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=a*b;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=a/b;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=a%b;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
			}
			
		});
		btnNewButton_14.setForeground(Color.BLUE);
		btnNewButton_14.setBackground(Color.ORANGE);
		btnNewButton_14.setBounds(263, 196, 89, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			a=Double.parseDouble(textField.getText());
			textField.setText("");
			op="/";
			}

		});
		btnNewButton_15.setForeground(Color.BLUE);
		btnNewButton_15.setBackground(Color.ORANGE);
		btnNewButton_15.setBounds(371, 196, 53, 23);
		frame.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("c");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnNewButton_16.setForeground(Color.BLUE);
		btnNewButton_16.setBackground(Color.ORANGE);
		btnNewButton_16.setBounds(24, 230, 89, 23);
		frame.getContentPane().add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("b");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder sb=new StringBuilder(textField.getText());
					sb.deleteCharAt(textField.getText().length()-1);
					b=sb.toString();
					textField.setText(b);
					
				}
			}
		});
		btnNewButton_17.setForeground(Color.BLUE);
		btnNewButton_17.setBackground(Color.ORANGE);
		btnNewButton_17.setBounds(145, 230, 89, 23);
		frame.getContentPane().add(btnNewButton_17);
		
		JButton btnNewButton_19 = new JButton("%");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";

			}
		});
		btnNewButton_19.setForeground(Color.BLUE);
		btnNewButton_19.setBackground(Color.ORANGE);
		btnNewButton_19.setBounds(366, 230, 58, 23);
		frame.getContentPane().add(btnNewButton_19);
	}

}
