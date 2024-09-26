package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;

import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class AddStudent {

	private JFrame frmAddStudentPage;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
					window.frmAddStudentPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStudentPage = new JFrame();
		frmAddStudentPage.setIconImage(Toolkit.getDefaultToolkit().getImage(AddStudent.class.getResource("/images/InfinityLogo.jpg")));
		frmAddStudentPage.setTitle("Add Student Page");
		frmAddStudentPage.setBounds(250,50,1050,800);
		frmAddStudentPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStudentPage.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Student Entry Form");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setBounds(53, 31, 929, 57);
		frmAddStudentPage.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(53, 98, 937, 2);
		frmAddStudentPage.getContentPane().add(separator);

		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(53, 127, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(53, 179, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Mobile");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(53, 241, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(53, 293, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("Gender");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(53, 483, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("Degree");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_5.setBounds(641, 483, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("D O B");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(68, 557, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_6);

		JLabel lblNewLabel_1_7 = new JLabel("Subject");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_7.setBounds(641, 557, 131, 42);
		frmAddStudentPage.getContentPane().add(lblNewLabel_1_7);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(45, 660, 937, 2);
		frmAddStudentPage.getContentPane().add(separator_1);

		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(45, 683, 117, 37);
		frmAddStudentPage.getContentPane().add(btnNewButton);


		JPanel panel = new JPanel();
		panel.setBounds(202, 475, 429, 50);
		frmAddStudentPage.getContentPane().add(panel);
		panel.setLayout(null);

		JTextArea txtAddress = new JTextArea();
		txtAddress.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtAddress.setForeground(new Color(0, 0, 0));
		txtAddress.setBounds(205, 306, 783, 149);
		frmAddStudentPage.getContentPane().add(txtAddress);


		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(208, 564, 383, 27);
		frmAddStudentPage.getContentPane().add(dateChooser);

		JCheckBox chckbxNewCheckBox = new JCheckBox("JAVA");
		chckbxNewCheckBox.setForeground(new Color(255, 128, 64));
		chckbxNewCheckBox.setFont(new Font("Arial Black", Font.BOLD, 15));
		chckbxNewCheckBox.setBounds(782, 572, 93, 21);
		frmAddStudentPage.getContentPane().add(chckbxNewCheckBox);


		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("PYTHON");
		chckbxNewCheckBox_1.setForeground(new Color(255, 128, 64));
		chckbxNewCheckBox_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		chckbxNewCheckBox_1.setBounds(876, 570, 117, 21);
		frmAddStudentPage.getContentPane().add(chckbxNewCheckBox_1);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnNewRadioButton.setBounds(6, 18, 103, 21);
		panel.add(rdbtnNewRadioButton);

		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		rdbtnNewRadioButton_1.setBounds(225, 18, 103, 21);
		panel.add(rdbtnNewRadioButton_1);



		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "MCA", "ME", "BCA"}));
		comboBox.setBounds(782, 498, 208, 21);
		frmAddStudentPage.getContentPane().add(comboBox);


		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();

				long mobile = Long.parseLong(txtMobile.getText());
				String address = txtAddress.getText();

				System.out.println(firstName+lastName+mobile+address);

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

				String date = sdf.format(dateChooser.getDate());
				System.out.println(date);

				String subject1=null;
				String subject2=null;

				boolean isSelected = chckbxNewCheckBox.isSelected();
				if(isSelected) {
					subject1=chckbxNewCheckBox.getLabel();
				}

				isSelected = chckbxNewCheckBox_1.isSelected();

				if(isSelected) {
					subject2=chckbxNewCheckBox_1.getLabel();
				}

				System.out.println(subject1+subject2);



				String gender = null;

				if( rdbtnNewRadioButton.isSelected()) {
					gender="male";
				}
				else if( rdbtnNewRadioButton_1.isSelected()) {
					gender="female";
				}
				System.out.println(gender);

				String degree = null;
				
				degree = (String)comboBox.getSelectedItem();
				System.out.println(degree);



				JDBCHandling db = new JDBCHandling();
				
				int status=db.insertData(firstName, lastName, mobile, address, gender, degree,date, subject1, subject2);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data Updated");
				}else {
					JOptionPane.showMessageDialog(null, "Problem In Add Data");
				}

			}
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(306, 683, 125, 37);
		frmAddStudentPage.getContentPane().add(btnSave);


		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);

				txtAddress.setText(null);
				chckbxNewCheckBox.setSelected(false);
				chckbxNewCheckBox_1.setSelected(false);
				dateChooser.setCalendar(null);
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(580, 683, 131, 37);
		frmAddStudentPage.getContentPane().add(btnReset);


		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStudentPage.setVisible(false);
			}
		});
		btnClose.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnClose.setBounds(857, 683, 125, 37);
		frmAddStudentPage.getContentPane().add(btnClose);

		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(0, 0, 160));
		txtFirstName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtFirstName.setBounds(205, 135, 777, 27);
		frmAddStudentPage.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);

		txtLastName = new JTextField();
		txtLastName.setForeground(new Color(0, 0, 160));
		txtLastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(205, 191, 777, 27);
		frmAddStudentPage.getContentPane().add(txtLastName);

		txtMobile = new JTextField();
		txtMobile.setForeground(Color.BLACK);
		txtMobile.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(205, 250, 777, 27);
		frmAddStudentPage.getContentPane().add(txtMobile);

	}
}
