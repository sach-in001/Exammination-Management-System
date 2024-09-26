package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import com.toedter.calendar.JDateChooser;

public class AdminRegistrationPage {

	private JFrame frmRedgear;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private JTextField txtEmail;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminRegistrationPage window = new AdminRegistrationPage();
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
	public AdminRegistrationPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRedgear = new JFrame();
		//frmRedgear.setIconImage(Toolkit.getDefaultToolkit().getImage(AdminRegistrationPage.class.getResource("/image/CompanyLogo.png")));
		frmRedgear.setTitle("RedGear");
		
		//frmRedgear.setBounds(250, 500, 1050, 800);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmRedgear.setSize(width,height);
		frmRedgear.setLocationRelativeTo(null);
		frmRedgear.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRedgear.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(5, 0, 1256, 760);
		frmRedgear.getContentPane().add(panel);
		panel.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(317, 11, 619, 655);
		panel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		//lblNewLabel.setIcon(new ImageIcon(AdminRegistrationPage.class.getResource("/image/RegisterLogo.jpg")));
		lblNewLabel.setForeground(new Color(255, 69, 0));
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 45));
		lblNewLabel.setBounds(0, 0, 619, 98);
		panel_1.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("First Name :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1.setBounds(4, 179, 113, 25);
		panel_1.add(lblNewLabel_1);

		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(255, 127, 80));
		txtFirstName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtFirstName.setBounds(127, 179, 482, 24);
		panel_1.add(txtFirstName);
		txtFirstName.setColumns(10);

		JLabel lblNewLabel_1_1 = new JLabel("Last Name :");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(3, 219, 113, 25);
		panel_1.add(lblNewLabel_1_1);

		txtLastName = new JTextField();
		txtLastName.setForeground(new Color(255, 127, 80));
		txtLastName.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtLastName.setColumns(10);
		txtLastName.setBounds(127, 219, 482, 24);
		panel_1.add(txtLastName);

		JLabel lblNewLabel_1_1_1 = new JLabel("Mobile No : ");
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1.setBounds(4, 255, 113, 25);
		panel_1.add(lblNewLabel_1_1_1);

		txtMobile = new JTextField();
		txtMobile.setForeground(new Color(255, 127, 80));
		txtMobile.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtMobile.setColumns(10);
		txtMobile.setBounds(127, 255, 482, 24);
		panel_1.add(txtMobile);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("Email Id : ");
		lblNewLabel_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBounds(4, 291, 113, 25);
		panel_1.add(lblNewLabel_1_1_1_1);

		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(255, 127, 80));
		txtEmail.setFont(new Font("Times New Roman", Font.BOLD, 20));
		txtEmail.setColumns(10);
		txtEmail.setBounds(127, 290, 482, 24);
		panel_1.add(txtEmail);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Gender");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1.setBounds(161, 427, 113, 25);
		panel_1.add(lblNewLabel_1_1_1_1_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(271, 427, 207, 25);
		panel_1.add(panel_2);
		panel_2.setLayout(null);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnNewRadioButton.setBounds(0, 0, 109, 23);
		panel_2.add(rdbtnNewRadioButton);

		JRadioButton rdbtnFemale = new JRadioButton("Female");
		buttonGroup.add(rdbtnFemale);
		rdbtnFemale.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnFemale.setBounds(113, 0, 88, 23);
		panel_2.add(rdbtnFemale);

		JLabel lblNewLabel_2 = new JLabel("Registration Info");
		lblNewLabel_2.setForeground(new Color(255, 0, 0));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.ITALIC, 35));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(15, 109, 589, 59);
		panel_1.add(lblNewLabel_2);

		JSeparator separator = new JSeparator();
		separator.setBounds(10, 551, 599, 2);
		panel_1.add(separator);


		passwordField = new JPasswordField();
		passwordField.setBounds(127, 326, 477, 25);
		panel_1.add(passwordField);

		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(188, 377, 416, 24);
		panel_1.add(passwordField_1);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(271, 484, 207, 20);
		panel_1.add(dateChooser);

		JLabel lblNewLabel_1_1_1_1_2 = new JLabel("Password :");
		lblNewLabel_1_1_1_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_2.setBounds(4, 327, 113, 25);
		panel_1.add(lblNewLabel_1_1_1_1_2);

		JLabel lblNewLabel_1_1_1_1_2_1 = new JLabel("Confirm Password :");
		lblNewLabel_1_1_1_1_2_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_2_1.setBounds(4, 377, 173, 25);
		panel_1.add(lblNewLabel_1_1_1_1_2_1);

		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("D O B");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1.setBounds(161, 479, 113, 25);
		panel_1.add(lblNewLabel_1_1_1_1_1_1);


		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				System.out.println(firstName + lastName);
				
				String gender = null;

				if(rdbtnNewRadioButton.isSelected()) {
					gender = "Male";
				}else if(rdbtnFemale.isSelected()) {
					gender = "Female";
				}
				
				System.out.println(gender);

				long mobileno = Long.parseLong(txtMobile.getText());
				System.out.println(mobileno);

				String emailId = txtEmail.getText();
				System.out.println(emailId);
				
				String password = passwordField.getText();
				System.out.println(password);

				String confirmpassword = passwordField_1.getText();
				System.out.println(confirmpassword);



				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String Date = sdf.format(dateChooser.getDate());

				
				JDBCHandling jb = new JDBCHandling();

				int status = jb.insertAdminData(firstName, lastName, gender, mobileno, emailId, password, confirmpassword, Date);
//
				if(status == 1) {
					JOptionPane.showMessageDialog(null, "Data Updated");
				}else {
					JOptionPane.showMessageDialog(null, "Sorry,Technical Error Found !");
				}

			}
		});
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBackground(new Color(0, 128, 0));
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnSubmit.setBounds(250, 567, 135, 52);
		panel_1.add(btnSubmit);

		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);
				txtEmail.setText(null);
				passwordField.setText(null);
				passwordField_1.setText(null);
			}
		});
		btnReset.setBackground(new Color(255, 255, 255));
		btnReset.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnReset.setBounds(453, 567, 135, 52);
		panel_1.add(btnReset);

		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmRedgear.setVisible(false);
			}
		});
		btnBack.setBackground(new Color(255, 255, 255));
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 25));
		btnBack.setBounds(55, 567, 135, 52);
		panel_1.add(btnBack);




	}
}
