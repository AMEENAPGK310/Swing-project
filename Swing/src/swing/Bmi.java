package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Bmi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	double height;
	double weight;
	double result;
	String ans;
	private JTextField txtUnderWeight;
	private JTextField textField_4;
	private JTextField txtNormalWeight;
	private JTextField txtTo;
	private JTextField txtOverWeight;
	private JTextField txtTo_1;
	private JTextField txtObese;
	private JTextField textField_10;
	private JButton btnUnder;
	private JButton btnNormal;
	private JButton btnOver;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bmi window = new Bmi();
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
	public Bmi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Body Mass Index");
		frame.setBounds(100, 100, 558, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeightm = new JLabel("Height(m)");
		lblHeightm.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHeightm.setBounds(24, 88, 63, 14);
		frame.getContentPane().add(lblHeightm);
		
		JLabel lblWeightkg = new JLabel("Weight(kg)");
		lblWeightkg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblWeightkg.setBounds(24, 143, 63, 14);
		frame.getContentPane().add(lblWeightkg);
		
		textField_1 = new JTextField();
		textField_1.setBounds(131, 140, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GREEN);
		panel.setForeground(Color.BLUE);
		panel.setBounds(10, 11, 495, 39);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("BODY MASS INDEX");
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GREEN);
		panel_1.setBounds(10, 48, 495, 175);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.YELLOW);
		textField_2.setBounds(123, 112, 86, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel label = new JLabel("");
		label.setForeground(Color.YELLOW);
		label.setBounds(269, 115, 46, 14);
		panel_1.add(label);

		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(128, 143, 81, 25);
		panel_1.add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				height=Double.parseDouble(textField.getText());
				textField.setText("");
				weight=Double.parseDouble(textField_1.getText());
				textField_1.setText("");
				result=weight/(height*height);
				ans=String.format("%.2f",result);
				textField_2.setText(ans);
				if(result<18.5)
					label.setText("under weight");
				if(result>=18.5&&result<=24.9)
					label.setText("normal weight");
				if(result>=25&&result<=29.9)
					label.setText("over weight");
				if(result>30)
					label.setText("obese");
				}
		});
		btnCalculate.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblBmi = new JLabel("BMI");
		lblBmi.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblBmi.setBounds(29, 116, 46, 14);
		panel_1.add(lblBmi);
		
				
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_2.setText( null);
				label.setText(null);
				}
		});
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnClear.setBounds(220, 144, 89, 23);
		panel_1.add(btnClear);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnExit.setBounds(315, 144, 89, 23);
		panel_1.add(btnExit);
		
		textField = new JTextField();
		textField.setBounds(123, 34, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GREEN);
		panel_2.setBounds(37, 227, 495, 242);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		txtObese = new JTextField();
		txtObese.setHorizontalAlignment(SwingConstants.CENTER);
		txtObese.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtObese.setText("obese");
		txtObese.setBounds(360, 146, 86, 20);
		panel_2.add(txtObese);
		txtObese.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Times New Roman", Font.BOLD, 13));
		textField_10.setText(">30");
		textField_10.setBounds(360, 165, 86, 20);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		txtOverWeight = new JTextField();
		txtOverWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtOverWeight.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtOverWeight.setText("over weight");
		txtOverWeight.setBounds(247, 146, 86, 20);
		panel_2.add(txtOverWeight);
		txtOverWeight.setColumns(10);
		
		txtTo_1 = new JTextField();
		txtTo_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtTo_1.setText("25 to 29.9");
		txtTo_1.setBounds(247, 165, 86, 20);
		panel_2.add(txtTo_1);
		txtTo_1.setColumns(10);
		
		txtNormalWeight = new JTextField();
		txtNormalWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtNormalWeight.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtNormalWeight.setText("normal weight");
		txtNormalWeight.setBounds(134, 146, 86, 20);
		panel_2.add(txtNormalWeight);
		txtNormalWeight.setColumns(10);
		
		txtTo = new JTextField();
		txtTo.setHorizontalAlignment(SwingConstants.CENTER);
		txtTo.setText(" 18.5 to 24.9");
		txtTo.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtTo.setBounds(134, 211, 86, 20);
		panel_2.add(txtTo);
		txtTo.setColumns(10);
		
		txtUnderWeight = new JTextField();
		txtUnderWeight.setHorizontalAlignment(SwingConstants.CENTER);
		txtUnderWeight.setBounds(10, 211, 92, 19);
		panel_2.add(txtUnderWeight);
		txtUnderWeight.setFont(new Font("Times New Roman", Font.BOLD, 13));
		txtUnderWeight.setText("under weight");
		txtUnderWeight.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(10, 222, 92, 20);
		panel_2.add(textField_4);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setText("<18.5");
		textField_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		textField_4.setColumns(10);
		
		btnUnder = new JButton("under");
		
		btnNormal = new JButton("normal");
		
		btnOver = new JButton("over");
		btnOver = new JButton(new ImageIcon("C://Users/USER/Pictures/over weight.jpg"));
		btnOver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOver.setBounds(255, 87, 89, 23);
		panel_2.add(btnOver);
	}
}
