package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class UserRegistration {

	private JFrame frmRegistrationPage;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMail;
	private JTextField txtMobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField txtPassword;
	private JPasswordField txtConfirmPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegistration window = new UserRegistration();
					window.frmRegistrationPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UserRegistration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRegistrationPage = new JFrame();
		frmRegistrationPage.getContentPane().setForeground(new Color(46, 46, 46));
		frmRegistrationPage.getContentPane().setBackground(new Color(0, 64, 128));
		frmRegistrationPage.setIconImage(Toolkit.getDefaultToolkit().getImage(UserRegistration.class.getResource("/images/logo.png")));
		frmRegistrationPage.setTitle("Registration Page");
		Toolkit kit =Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmRegistrationPage.setSize(width,height);
		frmRegistrationPage.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmRegistrationPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRegistrationPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ASSIAN INSTITUTE OF ENGINEERING");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel.setBounds(171, 11, 923, 65);
		frmRegistrationPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(10, 66, 1246, 2);
		frmRegistrationPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("Registration Form");
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setForeground(new Color(192, 192, 192));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(507, 73, 251, 30);
		frmRegistrationPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("First Name");
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(10, 121, 139, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name");
		lblNewLabel_2_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1.setBounds(10, 183, 139, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("E-Mail ID");
		lblNewLabel_2_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1_1.setBounds(10, 255, 139, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Mobile No");
		lblNewLabel_2_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1.setBounds(10, 321, 139, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Password");
		lblNewLabel_2_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1.setBounds(10, 395, 139, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Confirm Password");
		lblNewLabel_2_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 464, 179, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("D O B");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(10, 524, 139, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("Gender");
		lblNewLabel_2_1_1_1_1_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(637, 524, 110, 24);
		frmRegistrationPage.getContentPane().add(lblNewLabel_2_1_1_1_1_1_2);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtFirstName.setBounds(365, 120, 536, 32);
		frmRegistrationPage.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(365, 175, 536, 32);
		frmRegistrationPage.getContentPane().add(txtLastName);
		
		txtMail = new JTextField();
		txtMail.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtMail.setColumns(10);
		txtMail.setBounds(365, 247, 536, 32);
		frmRegistrationPage.getContentPane().add(txtMail);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(365, 309, 536, 32);
		frmRegistrationPage.getContentPane().add(txtMobile);
		
		JPanel panel = new JPanel();
		panel.setBounds(746, 510, 230, 40);
		frmRegistrationPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnMale = new JRadioButton("Male");
		buttonGroup.add(rdbtnMale);
		rdbtnMale.setFont(new Font("HP Simplified", Font.BOLD, 20));
		rdbtnMale.setBounds(0, 7, 111, 23);
		panel.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("HP Simplified", Font.BOLD, 20));
		rdbtnFemale.setBounds(113, 7, 111, 23);
		panel.add(rdbtnFemale);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(365, 510, 251, 38);
		frmRegistrationPage.getContentPane().add(dateChooser);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 584, 1246, 2);
		frmRegistrationPage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBackground(new Color(0, 128, 0));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				String email = txtMail.getText();
				int mobile = Integer.parseInt(txtMobile.getText());
				String password = txtPassword.getText();
				String confirmPassword = txtConfirmPassword.getText();
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String date = sdf.format(dateChooser.getDate());
				System.out.println(date);
				
				
				String gender = null;
				if(rdbtnMale.isSelected()) {
					gender = "Male";
				}
				
				if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				System.out.println(gender);
				
				
				JDBCHandling jd = new JDBCHandling();
				int status = jd.insertData(firstName, lastName, email, mobile, password, confirmPassword, date, gender);
				
				if(status ==1) {
					JOptionPane.showMessageDialog(null,"Data Updated");
				}else {
					JOptionPane.showMessageDialog(null,"Problem in Add Data");
				}
				
			}
		});
		btnNewButton.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnNewButton.setBounds(530, 616, 89, 23);
		frmRegistrationPage.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setForeground(new Color(255, 255, 255));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnExit.setBounds(669, 616, 89, 23);
		frmRegistrationPage.getContentPane().add(btnExit);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.setBackground(new Color(0, 128, 255));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRegistrationPage.setVisible(false);
			}
		});
		btnNewButton_2.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnNewButton_2.setBounds(391, 616, 89, 23);
		frmRegistrationPage.getContentPane().add(btnNewButton_2);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtPassword.setBounds(365, 389, 536, 30);
		frmRegistrationPage.getContentPane().add(txtPassword);
		
		txtConfirmPassword = new JPasswordField();
		txtConfirmPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtConfirmPassword.setBounds(365, 458, 536, 30);
		frmRegistrationPage.getContentPane().add(txtConfirmPassword);
		
		JButton btnNewButton_2_1 = new JButton("Reset");
		btnNewButton_2_1.setBackground(new Color(0, 128, 255));
		btnNewButton_2_1.setForeground(new Color(255, 255, 255));
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMail.setText(null);
				txtMobile.setText(null);
				txtPassword.setText(null);
				txtConfirmPassword.setText(null);
			}
		});
		btnNewButton_2_1.setFont(new Font("HP Simplified", Font.BOLD, 20));
		btnNewButton_2_1.setBounds(811, 616, 89, 23);
		frmRegistrationPage.getContentPane().add(btnNewButton_2_1);
	}
}
