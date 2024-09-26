package mainpackage;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import com.toedter.calendar.JDateChooser;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;

public class AddStaff {

	private JFrame frmAddStaffPage;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtStaffId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStaff window = new AddStaff();
					window.frmAddStaffPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddStaff() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddStaffPage = new JFrame();
		frmAddStaffPage.setIconImage(Toolkit.getDefaultToolkit().getImage(AddStaff.class.getResource("/images/InfinityLogo.jpg")));
		frmAddStaffPage.setTitle("Add Staff Page");
		frmAddStaffPage.setBounds(250,50,1050,800);
		frmAddStaffPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddStaffPage.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("Staff Entry Form");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel.setBounds(53, 31, 929, 57);
		frmAddStaffPage.getContentPane().add(lblNewLabel);

		JSeparator separator = new JSeparator();
		separator.setBounds(53, 98, 937, 2);
		frmAddStaffPage.getContentPane().add(separator);

		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(53, 127, 131, 42);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(53, 179, 131, 42);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("Mobile");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(53, 241, 131, 42);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("Address");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(53, 293, 131, 42);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("Gender");
		lblNewLabel_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_4.setFont(new Font("Arial Black", Font.BOLD, 22));
		lblNewLabel_1_4.setBounds(53, 483, 131, 42);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_4);

		JLabel lblNewLabel_1_5 = new JLabel("Department");
		lblNewLabel_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_5.setFont(new Font("Arial Black", Font.BOLD, 23));
		lblNewLabel_1_5.setBounds(495, 477, 224, 50);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_5);

		JLabel lblNewLabel_1_6 = new JLabel("D O B");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(68, 557, 131, 42);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_6);

		JLabel lblNewLabel_1_7 = new JLabel("Staff ID");
		lblNewLabel_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_7.setFont(new Font("Arial Black", Font.BOLD, 23));
		lblNewLabel_1_7.setBounds(611, 557, 131, 42);
		frmAddStaffPage.getContentPane().add(lblNewLabel_1_7);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(45, 660, 937, 2);
		frmAddStaffPage.getContentPane().add(separator_1);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStaffPage.setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnNewButton.setBounds(45, 683, 117, 37);
		frmAddStaffPage.getContentPane().add(btnNewButton);


		JPanel panel = new JPanel();
		panel.setBounds(202, 475, 283, 50);
		frmAddStaffPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		rdbtnNewRadioButton.setBounds(6, 23, 103, 21);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		rdbtnNewRadioButton_1.setBounds(170, 23, 103, 21);
		panel.add(rdbtnNewRadioButton_1);

		JTextArea txtAddress = new JTextArea();
		txtAddress.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtAddress.setForeground(new Color(0, 0, 0));
		txtAddress.setBounds(205, 306, 783, 149);
		frmAddStaffPage.getContentPane().add(txtAddress);


		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDateFormatString("yyyy-MM-dd");
		dateChooser.setBounds(208, 564, 383, 27);
		frmAddStaffPage.getContentPane().add(dateChooser);

		


		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Computer Science", "Information Technology", "Electronics ", "Mechanical", "Civil", "Chemical", "Biotechnology"}));
		comboBox.setBounds(729, 483, 261, 36);
		frmAddStaffPage.getContentPane().add(comboBox);


		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();

				long mobile = Long.parseLong(txtMobile.getText());
				String address = txtAddress.getText();

				System.out.println(firstName+lastName+mobile+address);
				
				int staffId =Integer.parseInt(txtStaffId.getText());
				
				String department = null;
				
				department = (String)comboBox.getSelectedItem();
				System.out.println(department);


				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

				String date = sdf.format(dateChooser.getDate());
				System.out.println(date);


				String gender = null;

				if( rdbtnNewRadioButton.isSelected()) {
					gender="male";
				}
				else if( rdbtnNewRadioButton_1.isSelected()) {
					gender="female";
				}
				System.out.println(gender);
				
				JDBCHandling2 db = new JDBCHandling2();
				int status = db.insertData(firstName, lastName, mobile, address, gender, date , staffId, department);
				
				if(status==1) {
					JOptionPane.showMessageDialog(null, "Data Updated");
				}else {
					JOptionPane.showMessageDialog(null, "Problem In Add Data");
				}	
				
			}
		});
		
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(306, 683, 125, 37);
		frmAddStaffPage.getContentPane().add(btnSave);


		JButton btnReset = new JButton("RESET");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				txtStaffId.setText(null);
				
				
				//rdbtnNewRadioButton.setAction(null);
				//rdbtnNewRadioButton_1.setAction(null);
				//rdbtnNewRadioButton.setActionCommand(null);
				//rdbtnNewRadioButton_1.setActionCommand(null);
				
				txtFirstName.setText(null);
				txtLastName.setText(null);
				txtMobile.setText(null);

				txtAddress.setText(null);
		
				dateChooser.setCalendar(null);
			}
		});
	
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(580, 683, 131, 37);
		frmAddStaffPage.getContentPane().add(btnReset);


		JButton btnClose = new JButton("CLOSE");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddStaffPage.setVisible(false);
			}
		});
		btnClose.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnClose.setBounds(857, 683, 125, 37);
		frmAddStaffPage.getContentPane().add(btnClose);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtFirstName.setBounds(202, 136, 780, 27);
		frmAddStaffPage.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(202, 188, 780, 27);
		frmAddStaffPage.getContentPane().add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(202, 250, 780, 27);
		frmAddStaffPage.getContentPane().add(txtMobile);
		
		txtStaffId = new JTextField();
		txtStaffId.setFont(new Font("Arial Black", Font.BOLD, 18));
		txtStaffId.setColumns(10);
		txtStaffId.setBounds(766, 566, 224, 27);
		frmAddStaffPage.getContentPane().add(txtStaffId);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
