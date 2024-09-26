package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserLoginPage {

	private JFrame frmUserLoginPage;
	private JTextField txtMail;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserLoginPage window = new UserLoginPage();
					window.frmUserLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserLoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUserLoginPage = new JFrame();
		frmUserLoginPage.getContentPane().setBackground(new Color(0, 64, 128));
		frmUserLoginPage.setForeground(new Color(0, 0, 0));
		frmUserLoginPage.setIconImage(Toolkit.getDefaultToolkit().getImage(UserLoginPage.class.getResource("/images/Alogo.jpg")));
		frmUserLoginPage.setTitle("User Login Page");
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		frmUserLoginPage.setSize(width/2,height/2);
		frmUserLoginPage.setLocationRelativeTo(null);
		frmUserLoginPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Login");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(116, 27, 411, 38);
		frmUserLoginPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(41, 63, 585, 2);
		frmUserLoginPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Email ID");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1.setBounds(82, 116, 107, 27);
		frmUserLoginPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(82, 173, 107, 27);
		frmUserLoginPage.getContentPane().add(lblNewLabel_1_1);
		
		txtMail = new JTextField();
		txtMail.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtMail.setBounds(224, 118, 344, 27);
		frmUserLoginPage.getContentPane().add(txtMail);
		txtMail.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtPassword.setBounds(224, 175, 344, 27);
		frmUserLoginPage.getContentPane().add(txtPassword);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = txtMail.getText();
				String password = txtPassword.getText();
				
				JDBCHandling jd = new JDBCHandling();
				int status = jd.validate(email, password);
				
				if(status ==1) {
					ExamFeed.main(null);
				}else {
					JOptionPane.showMessageDialog(null,"Invalid User. PLease Check Login Credentials.");
				}
	
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnNewButton.setForeground(new Color(0, 128, 255));
		btnNewButton.setBounds(274, 248, 118, 27);
		frmUserLoginPage.getContentPane().add(btnNewButton);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBackground(new Color(0, 128, 255));
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UserRegistration.main(null);
			}
		});
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnRegister.setBounds(82, 248, 118, 27);
		frmUserLoginPage.getContentPane().add(btnRegister);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 15));
		btnExit.setBounds(450, 248, 118, 27);
		frmUserLoginPage.getContentPane().add(btnExit);
	
	}
}
