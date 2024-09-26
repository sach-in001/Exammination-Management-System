package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class MainEntry {

	private JFrame frmAssianInstituteOf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainEntry window = new MainEntry();
					window.frmAssianInstituteOf.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainEntry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAssianInstituteOf = new JFrame();
		frmAssianInstituteOf.setTitle("Assian Institute of Engineering");
		frmAssianInstituteOf.setIconImage(Toolkit.getDefaultToolkit().getImage(MainEntry.class.getResource("/images/Alogo.jpg")));
		frmAssianInstituteOf.setSize(1200,600);
		//frame.setBounds(100, 100, 450, 300);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmAssianInstituteOf.setSize(width,height);
		frmAssianInstituteOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAssianInstituteOf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(539, 11, 188, 45);
		frmAssianInstituteOf.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ASSIAN INSTITUTE OF ENGINEERING");
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(240, 51, 786, 55);
		frmAssianInstituteOf.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(78, 228, 532, 273);
		frmAssianInstituteOf.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Student");
		lblNewLabel_2.setBounds(0, 28, 532, 56);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		
		JButton btnCreateAccount = new JButton("Create Account");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserRegistration.main(null);
			}
		});
		btnCreateAccount.setForeground(new Color(0, 64, 128));
		btnCreateAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCreateAccount.setBounds(43, 158, 208, 45);
		panel.add(btnCreateAccount);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserLoginPage.main(null);
			}
		});
		btnLogin.setForeground(new Color(0, 64, 128));
		btnLogin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnLogin.setBounds(279, 158, 208, 45);
		panel.add(btnLogin);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(655, 228, 532, 273);
		frmAssianInstituteOf.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Admin");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(0, 28, 532, 56);
		panel_1.add(lblNewLabel_2_1);
		
		JButton btnCreateAccount_1 = new JButton("Create Account");
		btnCreateAccount_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminRegistrationPage.main(null);
			}
		});
		btnCreateAccount_1.setForeground(new Color(0, 64, 128));
		btnCreateAccount_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCreateAccount_1.setBounds(43, 158, 208, 45);
		panel_1.add(btnCreateAccount_1);
		
		JButton btnLogin_1 = new JButton("Login");
		btnLogin_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLoginPage.main(null);
			}
		});
		btnLogin_1.setForeground(new Color(0, 64, 128));
		btnLogin_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnLogin_1.setBounds(279, 158, 208, 45);
		panel_1.add(btnLogin_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(38, 141, 1190, 2);
		frmAssianInstituteOf.getContentPane().add(separator);
	}
}
