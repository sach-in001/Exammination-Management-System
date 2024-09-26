package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CppExamPage2 {

	private JFrame frmAssianInstituteOf;
	private JTextField txtEnterEnrolledEmail;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CppExamPage2 window = new CppExamPage2();
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
	public CppExamPage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAssianInstituteOf = new JFrame();
		frmAssianInstituteOf.setIconImage(Toolkit.getDefaultToolkit().getImage(CppExamPage2.class.getResource("/images/Alogo.jpg")));
		frmAssianInstituteOf.setTitle("ASSIAN INSTITUTE OF ENGINEERING");
		//frame.setBounds(100, 100, 450, 300);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmAssianInstituteOf.setSize(width,height);
		frmAssianInstituteOf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAssianInstituteOf.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ASSIAN INSTITUTE OF ENGINEERING");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(0, 0, 1266, 47);
		frmAssianInstituteOf.getContentPane().add(lblNewLabel_1);
		
		JLabel lblProgrammingLanguageExams = new JLabel("Explore Various In Demand Programming Language");
		lblProgrammingLanguageExams.setToolTipText("");
		lblProgrammingLanguageExams.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgrammingLanguageExams.setForeground(Color.GRAY);
		lblProgrammingLanguageExams.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblProgrammingLanguageExams.setBounds(232, 51, 801, 45);
		frmAssianInstituteOf.getContentPane().add(lblProgrammingLanguageExams);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 124, 1207, 2);
		frmAssianInstituteOf.getContentPane().add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(232, 153, 801, 421);
		frmAssianInstituteOf.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C++ Programming");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(78, 23, 645, 102);
		panel_1.add(lblNewLabel_2);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String email = txtEnterEnrolledEmail.getText();
				String password = passwordField.getText();
				
				JDBCHandling jd = new JDBCHandling();
				int status = jd.validateJavaApproval(email, password);
				
				if(status ==1) {
					//ExamFeed.main(null);
					JavaTestPage.main(null);
//					frmAssianInstituteOf.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null,"Invalid User. PLease Check Login Credentials.");
				}
				
			}
		});
		btnStart.setForeground(Color.WHITE);
		btnStart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnStart.setBackground(new Color(0, 128, 64));
		btnStart.setBounds(249, 344, 303, 66);
		panel_1.add(btnStart);
		
		txtEnterEnrolledEmail = new JTextField();
		txtEnterEnrolledEmail.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		txtEnterEnrolledEmail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEnterEnrolledEmail.setBounds(132, 158, 536, 55);
		panel_1.add(txtEnterEnrolledEmail);
		txtEnterEnrolledEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 50));
		passwordField.setBounds(132, 259, 536, 55);
		panel_1.add(passwordField);
		
		JLabel lblEnterdigitpin = new JLabel("Enter 4-Digit-PIN");
		lblEnterdigitpin.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterdigitpin.setForeground(Color.GRAY);
		lblEnterdigitpin.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblEnterdigitpin.setBounds(252, 224, 297, 24);
		panel_1.add(lblEnterdigitpin);
		
		JLabel lblEnterEnrolledEmail = new JLabel("Enter Enrolled Email ID");
		lblEnterEnrolledEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEnterEnrolledEmail.setForeground(Color.GRAY);
		lblEnterEnrolledEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblEnterEnrolledEmail.setBounds(252, 123, 297, 24);
		panel_1.add(lblEnterEnrolledEmail);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAssianInstituteOf.setVisible(false);
//				System.exit(0);
			}
		});
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnNewButton.setBounds(44, 46, 108, 50);
		frmAssianInstituteOf.getContentPane().add(btnNewButton);
	}
}
