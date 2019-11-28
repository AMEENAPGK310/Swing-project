package swing;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.JTextPane;
public class Sample {

	private JFrame frame;
	private JLabel lblUserName;
	private JLabel lblPassword;
	private JButton btnSignIn;
	private JButton btnSignUp;
	private JTextField txtAmeena;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sample window = new Sample();
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
	public Sample() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("LOGIN PAGE");
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setFont(new Font("Sylfaen", Font.BOLD, 12));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton btnButton = new JButton("Click Here");
		
		lblUserName = new JLabel("User Name");
		lblUserName.setVerticalAlignment(SwingConstants.TOP);
		lblUserName.setHorizontalAlignment(SwingConstants.LEFT);
		lblUserName.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblUserName.setBounds(20, 53, 66, 14);
		frame.getContentPane().add(lblUserName);
		
		lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblPassword.setBounds(20, 87, 66, 14);
		frame.getContentPane().add(lblPassword);
		
		JCheckBox chckbxForgotPassword = new JCheckBox("Forgot Password");
		chckbxForgotPassword.setFont(new Font("Times New Roman", Font.BOLD, 12));
		chckbxForgotPassword.setBounds(50, 121, 117, 23);
		frame.getContentPane().add(chckbxForgotPassword);
		
		btnSignIn = new JButton("Sign In");
		btnSignIn.setForeground(Color.BLUE);
		btnSignIn.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSignIn.setBounds(55, 181, 89, 23);
		frame.getContentPane().add(btnSignIn);
		
		btnSignUp = new JButton("Sign Up");
		btnSignUp.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSignUp.setForeground(Color.RED);
		btnSignUp.setBounds(166, 181, 89, 23);
		frame.getContentPane().add(btnSignUp);
		
		txtAmeena = new JTextField();
		txtAmeena.setText("Ameena");
		txtAmeena.setBounds(112, 50, 86, 20);
		frame.getContentPane().add(txtAmeena);
		txtAmeena.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(142, 108, 6, 20);
		frame.getContentPane().add(textPane);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(142, 108, 6, 20);
		frame.getContentPane().add(textPane_1);
		
		txtPass = new JPasswordField();
		txtPass.setText("pass");
		txtPass.setBounds(112, 84, 86, 20);
		frame.getContentPane().add(txtPass);
		txtPass.setColumns(10);
	}
}
