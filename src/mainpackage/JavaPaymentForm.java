package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JavaPaymentForm {

	private JFrame frmAssianInstituteOf;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmailAddress;
	private JTextField txtPhoneNumber;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaPaymentForm window = new JavaPaymentForm();
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
	public JavaPaymentForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAssianInstituteOf = new JFrame();
		frmAssianInstituteOf.setTitle("ASSIAN INSTITUTE OF ENGINEERING");
		frmAssianInstituteOf.setIconImage(Toolkit.getDefaultToolkit().getImage(JavaPaymentForm.class.getResource("/images/Alogo.jpg")));
		//frame.setBounds(100, 100, 450, 300);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmAssianInstituteOf.setSize(width,height);
		frmAssianInstituteOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAssianInstituteOf.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 107, 1207, 2);
		frmAssianInstituteOf.getContentPane().add(separator);
		
		JLabel lblJavaExamEnrollment = new JLabel("Exam Enrollment System");
		lblJavaExamEnrollment.setToolTipText("");
		lblJavaExamEnrollment.setHorizontalAlignment(SwingConstants.CENTER);
		lblJavaExamEnrollment.setForeground(Color.GRAY);
		lblJavaExamEnrollment.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblJavaExamEnrollment.setBounds(232, 51, 801, 45);
		frmAssianInstituteOf.getContentPane().add(lblJavaExamEnrollment);
		
		JLabel lblNewLabel_1 = new JLabel("ASSIAN INSTITUTE OF ENGINEERING");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(0, 0, 1266, 47);
		frmAssianInstituteOf.getContentPane().add(lblNewLabel_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtFirstName.setText("First Name");
		txtFirstName.setBounds(615, 132, 297, 37);
		frmAssianInstituteOf.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLastName.setText("Last Name");
		txtLastName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(939, 132, 297, 37);
		frmAssianInstituteOf.getContentPane().add(txtLastName);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailAddress.setText("Email Address");
		txtEmailAddress.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtEmailAddress.setColumns(10);
		txtEmailAddress.setBounds(615, 191, 621, 37);
		frmAssianInstituteOf.getContentPane().add(txtEmailAddress);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setText("Phone Number");
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(615, 249, 621, 37);
		frmAssianInstituteOf.getContentPane().add(txtPhoneNumber);
		
		JLabel lblNewLabel = new JLabel("Create 4-Digit-PIN");
		lblNewLabel.setForeground(new Color(128, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(781, 313, 297, 24);
		frmAssianInstituteOf.getContentPane().add(lblNewLabel);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setBounds(781, 360, 323, 59);
		frmAssianInstituteOf.getContentPane().add(txtPassword);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(JavaPaymentForm.class.getResource("/images/Scanner.jpg")));
		lblNewLabel_2.setBounds(29, 132, 500, 500);
		frmAssianInstituteOf.getContentPane().add(lblNewLabel_2);
		
		JButton btnUpload = new JButton("Upload Payment Screenshot");
		btnUpload.setForeground(new Color(255, 255, 255));
		btnUpload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnUpload) {
					JFileChooser file_upload = new JFileChooser();
					file_upload.showOpenDialog(null);
					
					int res = file_upload.showOpenDialog(null);
					int res_2 = file_upload.showSaveDialog(null);
					if (res_2 == JFileChooser.APPROVE_OPTION) {
						File file_path = new File(file_upload.getSelectedFile().getAbsolutePath());
						System.out.println(file_path);
					}
				}
			}
		});
		btnUpload.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnUpload.setBackground(new Color(0, 128, 0));
		btnUpload.setBounds(615, 530, 283, 45);
		frmAssianInstituteOf.getContentPane().add(btnUpload);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null,"Please Wait for some time & START the Test");
				
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				String email = txtEmailAddress.getText();
				long mobile = Long.parseLong(txtPhoneNumber.getText());
				int pin = Integer.parseInt(txtPassword.getText());
				
				JDBCHandling jd = new JDBCHandling();
				int status = jd.insertData(firstName, lastName, email, mobile, pin);
				
				if(status ==1) {
					JOptionPane.showMessageDialog(null,"Exam Form Submitted. Please Wait for a moment & then Start Exam");
					JavaExamForm.main(null);
					frmAssianInstituteOf.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"Sorry, Technical Error Found !");
				}
			}
		});
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(255, 0, 0));
		btnSubmit.setBounds(953, 530, 283, 45);
		frmAssianInstituteOf.getContentPane().add(btnSubmit);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(JavaPaymentForm.class.getResource("/images/Back.png")));
		btnNewButton.setBounds(29, 23, 50, 50);
		frmAssianInstituteOf.getContentPane().add(btnNewButton);
		
	}
}
