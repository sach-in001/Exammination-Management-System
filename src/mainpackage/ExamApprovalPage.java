package package1;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ExamApprovalPage {

	private JFrame frmGedgearExamApproval;
	private JTable table;
	private JTextField txtID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamApprovalPage window = new ExamApprovalPage();
					window.frmGedgearExamApproval.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExamApprovalPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGedgearExamApproval = new JFrame();
		//frmGedgearExamApproval.setIconImage(Toolkit.getDefaultToolkit().getImage(ExamApprovalPage.class.getResource("/image/CompanyLogo.png")));
		frmGedgearExamApproval.setTitle("Gedgear Exam Approval Page");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmGedgearExamApproval.setSize(width, height);
		//frmGedgearExamApproval.setBounds(100, 100, 1100, 700);
		frmGedgearExamApproval.setLocationRelativeTo(null);
		frmGedgearExamApproval.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGedgearExamApproval.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(29, 139, 1207, 350);
		frmGedgearExamApproval.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial Number", "First Name", "Last Name", "Email Id", "4 Digit Key", "Approval"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(98);
		table.getColumnModel().getColumn(1).setPreferredWidth(98);
		table.getColumnModel().getColumn(2).setPreferredWidth(98);
		table.getColumnModel().getColumn(3).setPreferredWidth(130);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		table.getColumnModel().getColumn(5).setPreferredWidth(97);
		scrollPane.setViewportView(table);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 205));
		separator_1.setBounds(29, 516, 1207, 2);
		frmGedgearExamApproval.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("Enter ID Number");
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		lblNewLabel_1.setBounds(170, 567, 196, 28);
		frmGedgearExamApproval.getContentPane().add(lblNewLabel_1);
		
		txtID = new JTextField();
		txtID.setHorizontalAlignment(SwingConstants.CENTER);
		txtID.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 20));
		txtID.setBounds(376, 556, 125, 52);
		frmGedgearExamApproval.getContentPane().add(txtID);
		txtID.setColumns(10);
		
		JButton btnNewButton = new JButton("Approve");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				long mobile = Long.parseLong(txtMobile.getText());
				int SrNo = Integer.parseInt(txtID.getText());
				JDBCHandling jd = new JDBCHandling();
				int status = jd.approve(SrNo);
				if(status ==1) {
					JOptionPane.showMessageDialog(null,"Candidate Approved !");
				}else {
					JOptionPane.showMessageDialog(null,"Sorry,Technical Error.");
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnNewButton.setBounds(538, 556, 189, 52);
		frmGedgearExamApproval.getContentPane().add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 69, 0));
		btnExit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnExit.setBounds(1047, 556, 142, 52);
		frmGedgearExamApproval.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_1_1 = new JLabel("ASSIAN INSTITUTE OF ENGINEERING");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1_1.setBounds(0, 0, 1266, 47);
		frmGedgearExamApproval.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblProgrammingLanguageExams = new JLabel("Explore Various In Demand Programming Language");
		lblProgrammingLanguageExams.setToolTipText("");
		lblProgrammingLanguageExams.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgrammingLanguageExams.setForeground(Color.GRAY);
		lblProgrammingLanguageExams.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblProgrammingLanguageExams.setBounds(232, 51, 801, 45);
		frmGedgearExamApproval.getContentPane().add(lblProgrammingLanguageExams);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 107, 1207, 2);
		frmGedgearExamApproval.getContentPane().add(separator);
		
		JButton btnShowData = new JButton("Show Data");
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JDBCHandling jd = new JDBCHandling();
				ResultSet result = jd.getTable();
				
				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = {"Sr No","First Name","Last Name","Email","Mobile","4 Digit PIN","Approval"};
				model.setColumnIdentifiers(columnNames);
				
				try {
					while(result.next()) {
						model.addRow(new Object[] {
								result.getInt(1),
								result.getString(2),
								result.getString(3),
								result.getString(4),
								result.getLong(5),
								result.getInt(6),
								result.getBoolean(7)
						});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				
				
				
				
				
				
				
				
			}
		});
		btnShowData.setForeground(new Color(0, 0, 255));
		btnShowData.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		btnShowData.setBounds(770, 556, 223, 52);
		frmGedgearExamApproval.getContentPane().add(btnShowData);
	}
}
