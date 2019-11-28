package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;

public class project2 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTable table_1;
	double id;
	double firstname,lastname,course;
	double total,avg,rank;
	double result;
	String ans;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project2 window = new project2();
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
	public project2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Student report");
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 893, 488);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Student Details", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(22, 23, 379, 281);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("student_id");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 11, 75, 14);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(95, 11, 86, 25);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Firstname");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(10, 50, 75, 14);
		panel.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(95, 47, 86, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Surname");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 86, 75, 14);
		panel.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(95, 83, 86, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Course Code");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(10, 125, 86, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Maths");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(191, 11, 69, 14);
		panel.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener(new KeyAdapter() {
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
		textField_4.setBounds(283, 9, 86, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("English");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setBounds(191, 50, 82, 14);
		panel.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    e.consume();
				
                }

			}
		});
		textField_5.setBounds(283, 48, 86, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Biology");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setBounds(191, 86, 82, 14);
		panel.add(lblNewLabel_6);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    e.consume();
				
                }

			}
		});
		textField_6.setBounds(283, 84, 86, 20);
		panel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblComputer = new JLabel("Computer");
		lblComputer.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblComputer.setBounds(191, 125, 82, 14);
		panel.add(lblComputer);
		
		JLabel lblChemistry = new JLabel("Chemistry");
		lblChemistry.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChemistry.setBounds(191, 171, 82, 14);
		panel.add(lblChemistry);
		
		textField_7 = new JTextField();
		textField_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    e.consume();
				
                }

			}
		});
		textField_7.setColumns(10);
		textField_7.setBounds(283, 123, 86, 20);
		panel.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    e.consume();
				
                }

			}
		});
		textField_8.setColumns(10);
		textField_8.setBounds(283, 168, 86, 20);
		panel.add(textField_8);
		
		JLabel lblPhysics = new JLabel("Physics");
		lblPhysics.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPhysics.setBounds(191, 198, 82, 14);
		panel.add(lblPhysics);
		
		textField_9 = new JTextField();
		textField_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    e.consume();
				
                }

			}
		});
		textField_9.setColumns(10);
		textField_9.setBounds(283, 195, 86, 20);
		panel.add(textField_9);
		
		JLabel lblTamil = new JLabel("Tamil");
		lblTamil.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTamil.setBounds(191, 224, 82, 14);
		panel.add(lblTamil);
		
		textField_10 = new JTextField();
		textField_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    e.consume();
				
                }

			}
		});
		textField_10.setColumns(10);
		textField_10.setBounds(283, 221, 86, 20);
		panel.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char num=e.getKeyChar();
                if(!(Character.isDigit(num))
                        ||(num==KeyEvent.VK_BACK_SPACE)
                        ||(num==KeyEvent.VK_DELETE)) {
                    e.consume();
				
                }

			}
		});
		textField_11.setColumns(10);
		textField_11.setBounds(283, 252, 86, 20);
		panel.add(textField_11);
		
		JLabel lblMalayalam = new JLabel("Malayalam");
		lblMalayalam.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMalayalam.setBounds(191, 251, 82, 14);
		panel.add(lblMalayalam);
		
		JLabel lblTotalScore = new JLabel("Total Score");
		lblTotalScore.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblTotalScore.setBounds(10, 171, 75, 14);
		panel.add(lblTotalScore);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(95, 168, 86, 20);
		panel.add(textField_12);
		
		JLabel lblAverage = new JLabel("Average");
		lblAverage.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAverage.setBounds(10, 201, 75, 14);
		panel.add(lblAverage);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(95, 195, 86, 20);
		panel.add(textField_13);
		
		JLabel lblRanking = new JLabel("Ranking");
		lblRanking.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblRanking.setBounds(10, 240, 75, 14);
		panel.add(lblRanking);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(95, 237, 86, 20);
		panel.add(textField_14);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 150, 171, 2);
		panel.add(separator);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"11032A", "11032B", "11032E"}));
		comboBox.setBounds(95, 114, 86, 25);
		panel.add(comboBox);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(421, 23, 410, 281);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(10, 11, 390, 221);
		panel_1.add(textArea_1);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea_1.setText(null);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(148, 243, 89, 25);
		panel_1.add(btnNewButton);
		
		
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 315, 845, 99);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"id", "course", "maths", "english", "biology", "computer", "chemistry", "physics", "tamil", "malayalam", "total", "avg", "rank"},
			},
			new String[] {
				"[Ljava.lang.String;@e301cf4", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_1.setBounds(10, 11, 825, 77);
		panel_2.add(table_1);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel model=(DefaultTableModel)table_1.getModel();
                try
                {
                    int rownum = table_1.getSelectedRow();
                    model.removeRow(rownum);
                }
                catch(Exception msg)
                {
                    JOptionPane.showMessageDialog(null,"Please choose the particular row");
							
                }
			}
		});
		btnDelete.setForeground(Color.RED);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDelete.setBounds(207, 416, 89, 23);
		frame.getContentPane().add(btnDelete);
		
		JButton btnShowReport = new JButton("Show Report");
		btnShowReport.addActionListener(new ActionListener() {
			private Object textArea;

			public void actionPerformed(ActionEvent e) {
			 textArea_1.append("Student record\n"
                        +"Student Name: \t\t"+textField_1.getText()+" "+textField_2.getText()+"\n"
                        +"==============================================\n"
                        + "Math:\t\t"+textField_4.getText()+"\n"
                        +"Englis :\t\t"+textField_5.getText()+"\n"
                        +"Biology :\t\t"+textField_6.getText()+"\n"
                        +"computer:\t\t"+textField_7.getText()+"\n"
                        +"chemistry :\t\t"+textField_8.getText()+"\n"
                        +"physics:\t\t"+textField_9.getText()+"\n"
                        + "tamil:\t\t"+textField_10.getText()+"\n"
                        +"malayalam:\t\t"+textField_11.getText()+"\n"
			            +"==============================================\n"
			            +"total score:\t\t"+textField_12.getText()+"\n"
                        + "average:\t\t"+textField_13.getText()+"\n"
                        +"rank:\t\t"+textField_14.getText());
			
				
			}
		});
		btnShowReport.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnShowReport.setBounds(343, 416, 123, 23);
		frame.getContentPane().add(btnShowReport);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame=new JFrame("exit");
				if(JOptionPane.showConfirmDialog(frame,"confirm","exit",
					JOptionPane.YES_OPTION)==JOptionPane.YES_NO_OPTION)
						{
					       System.exit(0);
						}

			}
		});
		btnExit.setForeground(Color.RED);
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.setBounds(511, 416, 89, 23);
		frame.getContentPane().add(btnExit);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);
				
			}
		});
		btnReset.setForeground(Color.MAGENTA);
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnReset.setBounds(665, 416, 89, 23);
		frame.getContentPane().add(btnReset);
		
		JButton btnNewButton_1 = new JButton("Add Report");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double t1 = Double.parseDouble(textField_4.getText());
                double t2 = Double.parseDouble(textField_5.getText());
                double t3 = Double.parseDouble(textField_6.getText());
                double t4 = Double.parseDouble(textField_7.getText());
                double t5 = Double.parseDouble(textField_8.getText());
                double t6 = Double.parseDouble(textField_9.getText());
                double t7 = Double.parseDouble(textField_10.getText());
                double t8 = Double.parseDouble(textField_11.getText());
             double   total = t1+t2+t3+t4+t5+t6+t7+t8;
                String c = String.format("%.2f", total);
                textField_12.setText(c);
             double   avg = total/8;
                String a = String.format("%.2f", avg);
                textField_13.setText(a);
                if(total>700)
                {
                    textField_14.setText("1");
                }
                else if(total>600 && total<700)
                {
                    textField_14.setText("2");
                }
                else if(total>500 && total<600)
                {
                    textField_14.setText("3");
                }
                else if(total>300 && total<500)
                {
                    textField_14.setText("4");
                }
                else if(total>100 && total<300)
                {
                    textField_14.setText("5");
                }
                else
                {
                    textField_14.setText("Fail");
                }
                DefaultTableModel model=(DefaultTableModel)table_1.getModel();
               model.addRow(new String[] {
                       textField.getText(),
                       (String) comboBox.getSelectedItem(),
                        textField_4.getText(),
                        textField_5.getText(),
                        textField_6.getText(),
                        textField_7.getText(),
                        textField_8.getText(),
                        textField_9.getText(),
                        textField_10.getText(),
                        textField_11.getText(),
                        textField_12.getText(),
                        textField_13.getText(),
                        textField_14.getText(),
               });
			
			}
		});
		btnNewButton_1.setForeground(Color.GREEN);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton_1.setBounds(45, 418, 114, 23);
		frame.getContentPane().add(btnNewButton_1);
	}	
}