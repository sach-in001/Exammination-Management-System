package package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminLoginPage {

	private JFrame frmRedgear;
	private JTextField txtemailid;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLoginPage window = new AdminLoginPage();
					window.frmRedgear.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminLoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRedgear = new JFrame();
		frmRedgear.getContentPane().setForeground(new Color(64, 0, 64));
		//frmRedgear.setIconImage(Toolkit.getDefaultToolkit().getImage(AdminLoginPage.class.getResource("/image/CompanyLogo.png")));
		frmRedgear.setTitle("Redgear");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmRedgear.setSize(width/2, height/2);
		frmRedgear.setLocationRelativeTo(null);
		//frmRedgear.setBounds(100, 100, 450, 300);
		frmRedgear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRedgear.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Redgear Login");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 40));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(35, 10, 555, 59);
		frmRedgear.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(255, 0, 0));
		separator.setBounds(10, 80, 817, 2);
		frmRedgear.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Email Id");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 132, 148, 32);
		frmRedgear.getContentPane().add(lblNewLabel_1);
		
		txtemailid = new JTextField();
		txtemailid.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtemailid.setBounds(168, 134, 401, 32);
		frmRedgear.getContentPane().add(txtemailid);
		txtemailid.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_1_1.setBounds(10, 205, 148, 32);
		frmRedgear.getContentPane().add(lblNewLabel_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 210, 401, 30);
		frmRedgear.getContentPane().add(passwordField);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.RED);
		separator_1.setBounds(10, 303, 817, 2);
		frmRedgear.getContentPane().add(separator_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String emailid = txtemailid.getText();
				String password = passwordField.getText();
				
				JDBCHandling jb = new JDBCHandling();
				int status = jb.validateAdmin(emailid, password);
				
				if(status == 1) {
					ExamApprovalPage.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Register First");
				}
				
			}
		});
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnLogin.setBounds(239, 251, 148, 44);
		frmRedgear.getContentPane().add(btnLogin);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminRegistrationPage.main(null);
			}
		});
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnRegister.setBounds(421, 251, 148, 44);
		frmRedgear.getContentPane().add(btnRegister);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnExit.setBounds(48, 248, 148, 44);
		frmRedgear.getContentPane().add(btnExit);
	}
}
