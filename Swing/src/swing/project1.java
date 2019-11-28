package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class project1 {

	private JFrame frame;
	private JTextField textField;
	double num1;
	double num2;
	String op;
	double result;
	String ans;
	double india=1;
	double china=2;
	double europe=30;
	double canada=32;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project1 window = new project1();
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
	public project1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 911, 485);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 0, 792, 43);
		frame.getContentPane().add(menuBar);
		
		JMenu mnNewMenu = new JMenu("file");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Standard");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setBounds(24, 54,259, 58);
				frame.setBounds(100, 100, 356, 485);	
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Scientific");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setBounds(34, 54,554 , 58);
				frame.setBounds(100, 100, 610, 485);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Converter");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setBounds(34, 54,554 , 58);
				frame.setBounds(100, 100, 909, 485);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Exit");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame=new JFrame("exit");
				if(JOptionPane.showConfirmDialog(frame,"confirm","exit",
					JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
						{
					       System.exit(0);
						}
					
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(24, 123, 575, 313);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton bless = new JButton("<-");
		bless.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String b=null;
				if(textField.getText().length()>0)
				{
					StringBuilder strb=new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length()-1);
					b=strb.toString();
					textField.setText(b);
			}
			}
		});
		bless.setBounds(10, 11, 53, 45);
		panel.add(bless);
		
		JButton bce = new JButton("CE");
		bce.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		bce.setBounds(73, 11, 53, 45);
		panel.add(bce);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC.setBounds(136, 11, 53, 45);
		panel.add(btnC);
		
		JButton bpm = new JButton("+ -");
		bpm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("-"+num1);

				
			}
			
		});
		bpm.setBounds(199, 11, 53, 45);
		panel.add(bpm);
		
		JButton btnSqrt = new JButton("sqrt");
		btnSqrt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sqrt(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnSqrt.setBounds(255, 11, 60, 45);
		panel.add(btnSqrt);
		
		JButton btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sin(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnSin.setBounds(325, 11, 53, 45);
		panel.add(btnSin);
		
		JButton bsgh = new JButton("sgh");
		bsgh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.sinh(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		bsgh.setBounds(381, 11, 60, 45);
		panel.add(bsgh);
		
		JButton btnMod = new JButton("mod");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="mod";
			}
		});
		btnMod.setBounds(444, 11, 60, 45);
		panel.add(btnMod);
		
		JButton btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.log(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnLog.setBounds(507, 11, 60, 45);
		panel.add(btnLog);
		
		JButton b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b7.getText();
				textField.setText(number);
			}
		});
		b7.setBounds(10, 75, 53, 45);
		panel.add(b7);
		
		JButton b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b4.getText();
				textField.setText(number);
			}
		});
		b4.setBounds(10, 131, 53, 45);
		panel.add(b4);
		
		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b1.getText();
				textField.setText(number);
			}
		});
		b1.setBounds(10, 192, 53, 45);
		panel.add(b1);
		
		JButton b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b0.getText();
				textField.setText(number);
			}
		});
		b0.setBounds(10, 256, 53, 45);
		panel.add(b0);
		
		JButton b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b5.getText();
				textField.setText(number);
			}
		});
		b5.setBounds(73, 131, 53, 45);
		panel.add(b5);
		
		JButton b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b8.getText();
				textField.setText(number);
			}
		});
		b8.setBounds(73, 75, 53, 45);
		panel.add(b8);
		
		JButton b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b2.getText();
				textField.setText(number);
			}
		});
		b2.setBounds(73, 192, 53, 45);
		panel.add(b2);
		
		JButton bdot = new JButton(".");
		bdot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+bdot.getText();
				textField.setText(number);
			}
		});
		bdot.setBounds(73, 256, 53, 45);
		panel.add(bdot);
		
		JButton b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b9.getText();
				textField.setText(number);
			}
		});
		b9.setBounds(136, 75, 53, 45);
		panel.add(b9);
		
		JButton b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b6.getText();
				textField.setText(number);
			}
		});
		b6.setBounds(136, 131, 53, 45);
		panel.add(b6);
		
		JButton b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b3.getText();
				textField.setText(number);
			}
		});
		b3.setBounds(136, 192, 53, 45);
		panel.add(b3);
		
		JButton b00 = new JButton("00");
		b00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+b00.getText();
				textField.setText(number);
			}
		});
		b00.setBounds(136, 256, 53, 45);
		panel.add(b00);
		
		JButton bdiv = new JButton("/");
		bdiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="/";
			}
		});
		bdiv.setBounds(199, 75, 53, 45);
		panel.add(bdiv);
		
		JButton bmul = new JButton("*");
		bmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="*";
			}
		});
		bmul.setBounds(199, 131, 53, 45);
		panel.add(bmul);
		
		JButton bminus = new JButton("-");
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="-";
			}
		});
		bminus.setBounds(199, 192, 53, 45);
		panel.add(bminus);
		
		JButton bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="+";
			}
		});
		bplus.setBounds(199, 256, 53, 45);
		panel.add(bplus);
		
		JButton button_25 = new JButton("%");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="%";	
			}
		});
		button_25.setBounds(262, 131, 53, 45);
		panel.add(button_25);
		
		JButton beql = new JButton("=");
		beql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2=Double.parseDouble(textField.getText());
				if(op=="+")
				{
					result=num1+num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="-")
				{
					result=num1-num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="*")
				{
					result=num1*num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="/")
				{
					result=num1/num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="%")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
				}
				if(op=="x^y")
				{
					result=Math.pow(num1,num2);
					ans=String.format("%.2f",result);
					textField.setText(ans);
			}
				if(op=="cbr")
				{
					result=(num1/num2)*100;
					ans=String.format("%.2f",result);
					textField.setText(ans);
			}
				if(op=="mod")
				{
					result=num1%num2;
					ans=String.format("%.2f",result);
					textField.setText(ans);
			}
			}
		});
		beql.setBounds(262, 192, 53, 109);
		panel.add(beql);
		
		JButton btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.cos(num1);
				textField.setText(String.valueOf(num1));
				
			}
		});
		btnCos.setBounds(318, 75, 60, 45);
		panel.add(btnCos);
		
		JButton btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.tan(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnTan.setBounds(318, 131, 60, 45);
		panel.add(btnTan);
		
		JButton btnCbr = new JButton("cbr");
		btnCbr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="cbr";
			}
		});
		btnCbr.setBounds(318, 192, 60, 45);
		panel.add(btnCbr);
		
		JButton btnBin = new JButton("bin");
		btnBin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toBinaryString(a));
				}
		});
		btnBin.setBounds(318, 256, 60, 45);
		panel.add(btnBin);
		
		JButton bcsh = new JButton("csh");
		bcsh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.cosh(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		bcsh.setBounds(381, 75, 60, 45);
		panel.add(bcsh);
		
		JButton btnTnh = new JButton("tnh");
		btnTnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.tanh(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnTnh.setBounds(381, 131, 60, 45);
		panel.add(btnTnh);
		
		JButton btnRnd = new JButton("rnd");
		btnRnd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=Math.round(num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnRnd.setBounds(381, 192, 60, 45);
		panel.add(btnRnd);
		
		JButton btnHex = new JButton("hex");
		btnHex.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toHexString(a));
			}
		});
		btnHex.setBounds(381, 256, 60, 45);
		panel.add(btnHex);
		
		JButton btnLnx = new JButton("lnx");
		btnLnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLnx.setBounds(444, 75, 60, 45);
		panel.add(btnLnx);
		
		JButton btnC_1 = new JButton("c");
		btnC_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
			}
		});
		btnC_1.setBounds(444, 131, 60, 45);
		panel.add(btnC_1);
		
		JButton btnpie = new JButton("2*p");
		btnpie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("6.28");
			}
		});
		btnpie.setBounds(444, 192, 60, 45);
		panel.add(btnpie);
		
		JButton btnOct = new JButton("oct");
		btnOct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a=Integer.parseInt(textField.getText());
				textField.setText(Integer.toOctalString(a));
			}
		});
		btnOct.setBounds(444, 256, 60, 45);
		panel.add(btnOct);
		
		JButton btnPie = new JButton("pie");
		btnPie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("3.14");
			}
		});
		btnPie.setBounds(507, 75, 60, 45);
		panel.add(btnPie);
		
		JButton btnX = new JButton("x^2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=(num1*num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnX.setBounds(507, 131, 60, 45);
		panel.add(btnX);
		
		JButton btnX_1 = new JButton("x^3");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=(num1*num1*num1);
				textField.setText(String.valueOf(num1));
			}
		});
		btnX_1.setBounds(507, 192, 60, 45);
		panel.add(btnX_1);
		
		JButton btnXy = new JButton("x^y");
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				textField.setText("");
				op="x^y";
			}
		});
		btnXy.setBounds(507, 256, 60, 45);
		panel.add(btnXy);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num1=Double.parseDouble(textField.getText());
				num1=1/num1;
				textField.setText(String.valueOf(num1));
			}
		});
		btnx.setBounds(262, 75, 53, 45);
		panel.add(btnx);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 6));
		panel_1.setBounds(609, 108, 259, 328);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"india", "china", "europe", "canada"}));
		comboBox.setBounds(65, 73, 132, 35);
		panel_1.add(comboBox);
		
		JLabel l1 = new JLabel("");
		l1.setBounds(107, 182, 46, 14);
		panel_1.add(l1);
		
		JButton btnNewButton = new JButton("convert");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				double bp=Double.parseDouble(textField_1.getText());
				if(comboBox.getSelectedItem().equals("india"));
				{
					String c=String.format("Rs %.2f",bp*india);
					l1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("china"));
				{
					String c=String.format("Rs %.2f",bp*china);
					l1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("europe"));
				{
					String c=String.format("Rs %.2f",bp*europe);
					l1.setText(c);
				}
				if(comboBox.getSelectedItem().equals("canada"));
				{
					String c=String.format("Rs %.2f",bp*canada);
					l1.setText(c);
				}



								}
			
		});
		btnNewButton.setBounds(22, 240, 100, 48);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);
				l1.setText(null);
			}
		});
		btnNewButton_1.setBounds(132, 240, 106, 48);
		panel_1.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(65, 132, 132, 27);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblConverter = new JLabel("CURRENCY CONVERTER");
		lblConverter.setBounds(22, 24, 228, 22);
		panel_1.add(lblConverter);
		lblConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		
		textField = new JTextField();
		textField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField.setBounds(34, 54, 554, 58);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
