package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JTable;
import javax.swing.JProgressBar;
import javax.swing.table.DefaultTableModel;

public class Project3 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
		String str;
	double rate;
	String v = " ";
    String va=" ";
    String non=" ";
    String Ac;
    String aa="";
    String a1="";
    String r="";

	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Project3 window = new Project3();
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
	public Project3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 715, 614);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(24, 118, 60, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(109, 115, 96, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(18, 143, 288, 13);
		frame.getContentPane().add(separator);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Ticket Detail", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(316, 131, 355, 324);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("Name");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_5.setBounds(23, 57, 46, 14);
		panel.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		//textField_4=Double.parseDouble(textField.getText());
		textField_4.setBounds(124, 54, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("From");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(23, 121, 46, 14);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("To");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_7.setBounds(23, 159, 46, 14);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Date");
		lblNewLabel_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(23, 201, 46, 14);
		panel.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Time");
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_9.setBounds(23, 242, 46, 14);
		panel.add(lblNewLabel_9);
		
		textField_5 = new JTextField();
		textField_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
	}
		});
		textField_5.setBounds(124, 119, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(124, 157, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(124, 199, 86, 20);
		panel.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(124, 240, 86, 20);
		panel.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Ticket no");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_10.setBounds(251, 99, 94, 14);
		panel.add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                
	                evt.consume();
	                }
	 
			}
		});
		textField_9.setBounds(251, 119, 86, 20);
		panel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Price");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_11.setBounds(261, 150, 46, 14);
		panel.add(lblNewLabel_11);
		
		textField_10 = new JTextField();
		textField_10.setBounds(251, 175, 86, 20);
		panel.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Route");
		lblNewLabel_12.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(271, 206, 46, 14);
		panel.add(lblNewLabel_12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(251, 231, 86, 22);
		panel.add(textField_11);
		textField_11.setColumns(10);
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
							}
		});
		comboBox.setFont(new Font("Times New Roman", Font.BOLD, 13));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "Andrapradesh", "Karnataka", "Tamilnadu"}));
		comboBox.setBounds(24, 249, 70, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Kerala", "Tamilnadu", "Karnataka", "Andrapradesh"}));
		comboBox_1.setBounds(109, 249, 69, 20);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		comboBox_2.setBounds(212, 249, 64, 20);
		frame.getContentPane().add(comboBox_2);
		
		JRadioButton ac = new JRadioButton("Ac");
		ac.setBounds(108, 205, 56, 23);
		frame.getContentPane().add(ac);



		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				               
                                                

	                DefaultTableModel model=(DefaultTableModel)table.getModel();
	                model.addRow(new String[] {
	                		textField_4.getText(),
	                		textField_9.getText(),
	                        textField_5.getText(),
	                        textField_6.getText(),
	                        (String) comboBox_2.getSelectedItem(),
	                        textField_8.getText(),
	                        textField_7.getText(),
	                        r,
	                        textField_10.getText(),
	                        	                        
	                });

			}

			
		});
		btnConfirm.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnConfirm.setBounds(146, 285, 89, 23);
		panel.add(btnConfirm);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Standard");
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnNewRadioButton.setBounds(18, 160, 76, 26);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton single = new JRadioButton("Single ticket");
		single.setFont(new Font("Times New Roman", Font.BOLD, 13));
		single.setBounds(108, 163, 97, 23);
		frame.getContentPane().add(single);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Adult");
		rdbtnNewRadioButton_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnNewRadioButton_2.setBounds(221, 163, 70, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("First class");
		rdbtnNewRadioButton_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnNewRadioButton_3.setBounds(18, 205, 85, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Child");
		rdbtnNewRadioButton_5.setFont(new Font("Times New Roman", Font.BOLD, 13));
		rdbtnNewRadioButton_5.setBounds(226, 205, 76, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_5);
		
				
				
				
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(18, 288, 288, 10);
		frame.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Tax");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(18, 302, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
					char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
					
	                }

			}
		});
		textField_1.setBounds(109, 300, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Sub total");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(18, 342, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
					char num=evt.getKeyChar();
	                if(!(Character.isDigit(num))
	                        ||(num==KeyEvent.VK_BACK_SPACE)
	                        ||(num==KeyEvent.VK_DELETE)) {
	                    evt.consume();
					
	                }
			}
		});
		textField_2.setBounds(109, 340, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Total");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_3.setBounds(24, 386, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(109, 380, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JRadioButton sleeper = new JRadioButton("Sleeper");
		sleeper.setBounds(166, 205, 58, 23);
		frame.getContentPane().add(sleeper);

		
		JButton btnNewButton = new JButton("Total");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ab = (String)textField.getText();
				textField_4.setText(ab);
	            str = (String)comboBox.getSelectedItem();
	            textField_5.setText(str);
	            String st = (String)comboBox_1.getSelectedItem();
                textField_6.setText(st);
                Calendar timer=Calendar.getInstance();
                timer.getTime();
                SimpleDateFormat tdate= new SimpleDateFormat("dd-MMM-yyyy");
                textField_7.setText(tdate.format(timer.getTime()));
                SimpleDateFormat tTime=new SimpleDateFormat("HH:mm:ss");
                textField_8.setText(tTime.format(timer.getTime()));
                Random ran = new Random();
                int n = ran.nextInt(1000000)+1;
                String val = String.valueOf(n);
                textField_9.setText(val);

                if(ac.isSelected())
                {
                    r="AC";                    
                }
                else
                {
                    r="non-AC";
                }
                textField_11.setText(str+" to "+st);
                double no=Double.parseDouble((String)comboBox_2.getSelectedItem());
                    if ((ac.isSelected()==true) && (sleeper.isSelected()==true) && (single.isSelected()==true ))
                   {
                        va="3400";
                        double nn=Double.parseDouble(va);
                        double sub=no*nn;
                        Ac="200";
                        aa=String.format("%s",sub);
                        textField_2.setText(aa);
                         a1=String.format("%s", Ac);
                         textField_1.setText(a1);	
                         
                   }
                    if ((ac.isSelected()==true) && (sleeper.isSelected()==true) && (single.isSelected()==false ))
                    {
                         va="4000";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="200";
                          aa=String.format("%s",sub);
                          textField_2.setText(aa);
                           a1=String.format("%s", Ac);
                           textField_1.setText(a1);	
                          
                    }
                    if ((ac.isSelected()==false) && (sleeper.isSelected()==true) && (single.isSelected()==true ))
                    {
                         va="3000";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                           aa=String.format("%s",sub);
                            textField_2.setText(aa);
                           a1=String.format("%s", Ac);
                           textField_1.setText(a1);	
                           
                    }
                    if ((ac.isSelected()==false) && (sleeper.isSelected()==true) && (single.isSelected()==false ))
                    {
                         va="3400";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                          aa=String.format("%s",sub);
                            textField_2.setText(aa);
                          a1=String.format("%s", Ac);
                           textField_1.setText(a1);	
                           
                    }
                    if ((ac.isSelected()==true) && (sleeper.isSelected()==false) && (single.isSelected()==true ))
                    {
                         va="3200";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="200";
                         aa=String.format("%s",sub);
                            textField_2.setText(aa);
                           a1=String.format("%s", Ac);
                           textField_1.setText(a1);
                                               }
                    if ((ac.isSelected()==true) && (sleeper.isSelected()==false) && (single.isSelected()==false ))
                    {
                         va="3800";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="200";
                         aa=String.format("%s",sub);
                            textField_2.setText(aa);
                         a1=String.format("%s", Ac);
                           textField_1.setText(a1);	
                                              }
                    if ((ac.isSelected()==false) && (sleeper.isSelected()==false) && (single.isSelected()==true ))
                    {
                         va="2800";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                          aa=String.format("%s",sub);
                            textField_2.setText(aa);
                           a1=String.format("%s", Ac);
                           textField_1.setText(a1);	
                                                      
                    }
                    if ((ac.isSelected()==false) && (sleeper.isSelected()==false) && (single.isSelected()==false ))
                    {
                         va="3200";
                         double nn=Double.parseDouble(va);
                         double sub=no*nn;
                         Ac="100";
                         aa=String.format("%s",sub);
                            textField_2.setText(aa);
                           a1=String.format("%s", Ac);
                           textField_1.setText(a1);	
                           
                      }
                    double f=Double.parseDouble(aa);
                    double g=Double.parseDouble(a1);
                    String res=String.format("%s",f+g);
                    textField_3.setText(res);
                    String abc = (String)textField_3.getText();
    				textField_10.setText(abc);
				
			}
			

		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(14, 421, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_1.setBounds(113, 422, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("exit");
				if(JOptionPane.showConfirmDialog(frame,"confirm","exit",
					JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
						{
					       System.exit(0);
						}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton_2.setBounds(212, 422, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(18, 411, 288, -1);
		frame.getContentPane().add(separator_2);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		panel_1.setBounds(109, 37, 387, 42);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_4 = new JLabel("Ticket Booking");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 24));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblNewLabel_4);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Name", "Booking No", "From", "To", "No of seats", "Time", "Date", "AC,non-Ac", "Price"},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(28, 476, 649, 77);
		frame.getContentPane().add(table);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLUE);
		panel_2.setBounds(14, 458, 675, 107);
		frame.getContentPane().add(panel_2);
		
				
		
	}
}
