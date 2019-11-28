package swing;
import java.lang.Math;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Science {

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
					Science window = new Science();
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
	public Science() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 534, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEdit = new JLabel("Edit");
		lblEdit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblEdit.setHorizontalAlignment(SwingConstants.CENTER);
		lblEdit.setBounds(10, 11, 46, 14);
		frame.getContentPane().add(lblEdit);
		
		JLabel lblNewLabel = new JLabel("View");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel.setBounds(54, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Help");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(110, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(20, 36, 488, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 63, 255, 172);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Sqrt");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=Math.sqrt(a);
				ans=String.format("%.2f",result);
				textField.setText(ans);
				
				
			}
		});
		btnNewButton_1.setBounds(10, 11, 53, 23);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("1/x");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=1/a;
				ans=String.format("%.2f",result);
				textField.setText(ans);

				
				
			}
		});
		btnNewButton.setBounds(73, 11, 53, 23);
		panel.add(btnNewButton);
		
		JButton btnNewButton_3 = new JButton("sin");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=Math.sin(a);
				ans=String.format("%.2f",result);
				textField.setText(ans);
				
			}

		});
		btnNewButton_3.setBounds(132, 11, 63, 23);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("%");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";
			}
		});
		btnNewButton_4.setBounds(10, 48, 58, 23);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Exp");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=Math.exp(a);
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnNewButton_5.setBounds(73, 45, 53, 26);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("cos");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=Math.cos(a);
				ans=String.format("%.2f",result);
				textField.setText(ans);
				
			}
		});
		btnNewButton_6.setBounds(142, 48, 53, 23);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_8 = new JButton("x^y");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*a=Double.parseDouble(textField.getText());
				b=Double.parseDouble(textField.getText());
				result=a^b;
				ans=String.format("%.2f",result);
				textField.setText(ans);*/
				
			}
		});
		btnNewButton_8.setBounds(10, 82, 58, 23);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("x^2");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=a*a;
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnNewButton_9.setBounds(10, 116, 61, 23);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("ln");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=Math.log(a);
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnNewButton_10.setBounds(73, 82, 53, 23);
		panel.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("n!");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				int i=0;
				  result =a;
				  for (i=0;i<a;i++) {
				   result= result*i;
				  }


				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnNewButton_11.setBounds(83, 116, 53, 23);
		panel.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("tan");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=Math.tan(a);
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnNewButton_12.setBounds(142, 82, 53, 23);
		panel.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("sec");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				result=1/(Math.cos(a));
				ans=String.format("%.2f",result);
				textField.setText(ans);
			}
		});
		btnNewButton_13.setBounds(142, 116, 53, 23);
		panel.add(btnNewButton_13);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnC.setBounds(152, 150, 89, 23);
		panel.add(btnC);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(275, 67, 233, 168);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton_16 = new JButton("7");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_16.getText();
				textField.setText(number);

			}
		});
		btnNewButton_16.setBounds(10, 5, 41, 23);
		panel_1.add(btnNewButton_16);
		

		
		JButton btnNewButton_17 = new JButton("4");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_17.getText();
				textField.setText(number);

			}
		});
		btnNewButton_17.setBounds(10, 50, 41, 23);
		panel_1.add(btnNewButton_17);
	    JButton btnNewButton_18 = new JButton("1");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_18.getText();
				textField.setText(number);

			}
		});
		btnNewButton_18.setBounds(10, 84, 41, 23);
		panel_1.add(btnNewButton_18);
		

		
		JButton btnNewButton_19 = new JButton("0");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			String number=textField.getText()+btnNewButton_19.getText();
			textField.setText(number);
			}

		});
		btnNewButton_19.setBounds(10, 118, 47, 23);
		panel_1.add(btnNewButton_19);
		

		
		JButton btnNewButton_20 = new JButton("8");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_20.getText();
				textField.setText(number);

			}
		});
		btnNewButton_20.setBounds(61, 5, 47, 23);
		panel_1.add(btnNewButton_20);
		
		JButton btnNewButton_21 = new JButton("5");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_21.getText();
				textField.setText(number);

			}
		});
		btnNewButton_21.setBounds(61, 50, 41, 23);
		panel_1.add(btnNewButton_21);
		
		
		JButton btnNewButton_22 = new JButton("2");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_22.getText();
				textField.setText(number);

				
			}
		});
		btnNewButton_22.setBounds(61, 84, 47, 23);
		panel_1.add(btnNewButton_22);
		String number=textField.getText()+btnNewButton_22.getText();
		textField.setText(number);

		JButton btnNewButton_23 = new JButton(".");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_23.getText();
				textField.setText(number);
			}
		});
		btnNewButton_23.setBounds(61, 118, 47, 23);
		panel_1.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("9");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_24.getText();
				textField.setText(number);

				
			}
		});
		btnNewButton_24.setBounds(118, 5, 41, 23);
		panel_1.add(btnNewButton_24);
		

		
		JButton btnNewButton_25 = new JButton("6");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_25.getText();
				textField.setText(number);

				
			}
		});
		btnNewButton_25.setBounds(118, 50, 47, 23);
		panel_1.add(btnNewButton_25);
		String number10=textField.getText()+btnNewButton_25.getText();
		textField.setText(number10);

		
		JButton btnNewButton_26 = new JButton("3");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton_26.getText();
				textField.setText(number);

				
			}
		});
		btnNewButton_26.setBounds(118, 84, 47, 23);
		panel_1.add(btnNewButton_26);
		

		
		JButton btnNewButton_27 = new JButton("=");
		btnNewButton_27.addActionListener(new ActionListener() {
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
				if(op=="")
				{
					result=a%b;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}


			}
		});
		btnNewButton_27.setBounds(118, 118, 41, 23);
		panel_1.add(btnNewButton_27);
		
		JButton btnNewButton_28 = new JButton("/");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";

			}
		});
		btnNewButton_28.setBounds(166, 5, 57, 23);
		panel_1.add(btnNewButton_28);
		
		JButton btnNewButton_29 = new JButton("*");
		btnNewButton_29.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";

			}
		});
		btnNewButton_29.setBounds(175, 50, 48, 23);
		panel_1.add(btnNewButton_29);
		
		JButton btnNewButton_30 = new JButton("-");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";

			}
		});
		btnNewButton_30.setBounds(175, 84, 48, 23);
		panel_1.add(btnNewButton_30);
		
		JButton btnNewButton_31 = new JButton("+");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";

			}
		});
		btnNewButton_31.setBounds(175, 118, 41, 23);
		panel_1.add(btnNewButton_31);
	}

}
