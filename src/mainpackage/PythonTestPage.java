package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class PythonTestPage {

	private JFrame frmAssianInstituteExam;
	private JTextField txtQuestion;
	private JTextField txtOptionA;
	private JTextField txtOptionB;
	private JTextField txtOptionC;
	private JTextField txtOptionD;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtqno;
	
	String correctAnswer = "";
	String givenAnswer = "";
	int marks = 0;
	int time;
	private JTextField txtMarks;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PythonTestPage window = new PythonTestPage();
					window.frmAssianInstituteExam.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PythonTestPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAssianInstituteExam = new JFrame();
		frmAssianInstituteExam.setTitle("Assian Institute Exam Conduction");
		//frmAssianInstituteExam.setBounds(100, 100, 1100, 700);
		//frame.setBounds(100, 100, 450, 300);
				Toolkit kit = Toolkit.getDefaultToolkit();
				Dimension dim = kit.getScreenSize();
				int width = dim.width;
				int height = dim.height;
				frmAssianInstituteExam.setSize(width,height);
		frmAssianInstituteExam.setLocationRelativeTo(null);
		frmAssianInstituteExam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAssianInstituteExam.getContentPane().setLayout(null);
		
		JLabel lblProfile = new JLabel("");
		lblProfile.setIcon(new ImageIcon("D:\\tom.jpg"));
		lblProfile.setBackground(new Color(248, 248, 255));
		lblProfile.setHorizontalAlignment(SwingConstants.CENTER);
		lblProfile.setBounds(72, 11, 140, 140);
		frmAssianInstituteExam.getContentPane().add(lblProfile);
		
		JLabel lblNewLabel_1 = new JLabel("ASSIAN Institute of Engineering ");
		lblNewLabel_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(177, 11, 912, 65);
		frmAssianInstituteExam.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Python Programming Exam");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 25));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(211, 87, 844, 43);
		frmAssianInstituteExam.getContentPane().add(lblNewLabel_2);
		
		txtMarks = new JTextField();
		txtMarks.setForeground(new Color(255, 0, 0));
		txtMarks.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 30));
		txtMarks.setHorizontalAlignment(SwingConstants.CENTER);
		txtMarks.setBounds(256, 114, 101, 37);
		frmAssianInstituteExam.getContentPane().add(txtMarks);
		txtMarks.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(220, 20, 60));
		separator.setBounds(39, 163, 1187, 2);
		frmAssianInstituteExam.getContentPane().add(separator);
		
		JButton btnNewButton_8 = new JButton("Submit");
		btnNewButton_8.setBackground(new Color(255, 0, 0));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_8.setForeground(new Color(255, 255, 255));
		btnNewButton_8.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_8.setBounds(966, 501, 115, 43);
		frmAssianInstituteExam.getContentPane().add(btnNewButton_8);
		
		JLabel lblNewLabel_3 = new JLabel("Que");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(10, 193, 46, 43);
		frmAssianInstituteExam.getContentPane().add(lblNewLabel_3);
		
		txtQuestion = new JTextField();
		txtQuestion.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtQuestion.setBounds(66, 206, 672, 55);
		frmAssianInstituteExam.getContentPane().add(txtQuestion);
		txtQuestion.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(66, 299, 353, 26);
		frmAssianInstituteExam.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnA = new JRadioButton("A");
		buttonGroup.add(rdbtnA);
		rdbtnA.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnA.setBounds(0, 0, 41, 23);
		panel_1.add(rdbtnA);
		
		txtOptionA = new JTextField();
		txtOptionA.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtOptionA.setBounds(47, 0, 296, 23);
		panel_1.add(txtOptionA);
		txtOptionA.setColumns(10);
		
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(66, 348, 353, 26);
		frmAssianInstituteExam.getContentPane().add(panel_1_1);
		
		JRadioButton rdbtnB = new JRadioButton("B");
		buttonGroup.add(rdbtnB);
		rdbtnB.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnB.setBounds(0, 0, 41, 23);
		panel_1_1.add(rdbtnB);
		
		txtOptionB = new JTextField();
		txtOptionB.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtOptionB.setColumns(10);
		txtOptionB.setBounds(47, 0, 296, 23);
		panel_1_1.add(txtOptionB);
		
		
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(66, 401, 353, 26);
		frmAssianInstituteExam.getContentPane().add(panel_1_2);
		
		JRadioButton rdbtnC = new JRadioButton("C");
		buttonGroup.add(rdbtnC);
		rdbtnC.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnC.setBounds(0, 0, 41, 23);
		panel_1_2.add(rdbtnC);
		
		txtOptionC = new JTextField();
		txtOptionC.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtOptionC.setColumns(10);
		txtOptionC.setBounds(47, 0, 296, 23);
		panel_1_2.add(txtOptionC);
		
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(66, 455, 353, 26);
		frmAssianInstituteExam.getContentPane().add(panel_1_3);
		
		JRadioButton rdbtnD = new JRadioButton("D");
		buttonGroup.add(rdbtnD);
		rdbtnD.setFont(new Font("Times New Roman", Font.BOLD, 20));
		rdbtnD.setBounds(0, 0, 41, 23);
		panel_1_3.add(rdbtnD);
		
		txtOptionD = new JTextField();
		txtOptionD.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtOptionD.setColumns(10);
		txtOptionD.setBounds(47, 0, 296, 23);
		panel_1_3.add(txtOptionD);
		
		
		
		JButton btnNewButton_9 = new JButton("Save");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnA.isSelected()) {
					givenAnswer = txtOptionA.getText();
				}
				else if(rdbtnB.isSelected()) {
					givenAnswer = txtOptionB.getText();
				}
				else if(rdbtnC.isSelected()) {
					givenAnswer = txtOptionC.getText();
				}
				else if(rdbtnD.isSelected()) {
					givenAnswer = txtOptionD.getText();
				}
				
				System.out.println(givenAnswer);
				System.out.println(correctAnswer);
				
				if(givenAnswer.equalsIgnoreCase(correctAnswer)) {
					System.out.println("Answer is Correct");
					//System.out.println(givenAnswer +" "+ correctAnswer);
					JOptionPane.showMessageDialog(null, "Answer is Correct. Marks Added !");
					marks++;
					txtMarks.setText(Integer.toString(marks));
				}
				else {
					System.out.println("Wrong Answer");
					//System.out.println(givenAnswer +" "+ correctAnswer);
					JOptionPane.showMessageDialog(null, "Wrong Answer. Better Luck Next Time...");
				}
				
				
			}
		});
		btnNewButton_9.setForeground(new Color(0, 64, 0));
		btnNewButton_9.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_9.setBounds(66, 546, 101, 43);
		frmAssianInstituteExam.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("Next");
		btnNewButton_9_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(rdbtnA.isSelected()) {
					givenAnswer = txtOptionA.getText();
				}
				else if(rdbtnB.isSelected()) {
					givenAnswer = txtOptionB.getText();
				}
				else if(rdbtnC.isSelected()) {
					givenAnswer = txtOptionC.getText();
				}
				else if(rdbtnD.isSelected()) {
					givenAnswer = txtOptionD.getText();
				}
				
				System.out.println(givenAnswer);
				System.out.println(correctAnswer);
				
				if(givenAnswer.equalsIgnoreCase(correctAnswer)) {
					System.out.println("Answer is Correct");
					//System.out.println(givenAnswer +" "+ correctAnswer);
					JOptionPane.showMessageDialog(null, "Answer is Correct. Marks Added !");
					marks++;
					txtMarks.setText(Integer.toString(marks));
				}
				else {
					System.out.println("Wrong Answer");
					//System.out.println(givenAnswer +" "+ correctAnswer);
					JOptionPane.showMessageDialog(null, "Wrong Answer. Better Luck Next Time...");
				}
				
				
			}
		});
		btnNewButton_9_1.setForeground(new Color(0, 0, 255));
		btnNewButton_9_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_9_1.setBounds(194, 546, 101, 43);
		frmAssianInstituteExam.getContentPane().add(btnNewButton_9_1);
		
		JButton btnNewButton_9_1_1 = new JButton("Previous");
		btnNewButton_9_1_1.setForeground(new Color(0, 0, 64));
		btnNewButton_9_1_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_9_1_1.setBounds(321, 546, 115, 43);
		frmAssianInstituteExam.getContentPane().add(btnNewButton_9_1_1);
		
		JButton btnNewButton_9_1_2 = new JButton("Reset");
		btnNewButton_9_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtqno.setText("");
				txtQuestion.setText("");
				txtOptionA.setText("");
				txtOptionB.setText("");
				txtOptionC.setText("");
				txtOptionD.setText("");
			}
		});
		btnNewButton_9_1_2.setForeground(new Color(255, 0, 0));
		btnNewButton_9_1_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_9_1_2.setBounds(465, 546, 101, 43);
		frmAssianInstituteExam.getContentPane().add(btnNewButton_9_1_2);
		
		JPanel panel = new JPanel();
		panel.setBounds(870, 196, 307, 249);
		frmAssianInstituteExam.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =1;
				LoadQuestions(id);
			}
		});
		btnNewButton.setBounds(10, 11, 58, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =2;
				LoadQuestions(id);
			}
		});
		btnNewButton_1.setBounds(85, 11, 58, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id =3;
				LoadQuestions(id);
			}
		});
		btnNewButton_1_1.setBounds(163, 11, 58, 50);
		panel.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("4");
		btnNewButton_1_1_1.setBounds(241, 11, 58, 50);
		panel.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_2 = new JButton("5");
		btnNewButton_2.setBounds(10, 87, 58, 50);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.setBounds(85, 87, 58, 50);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("7");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(163, 87, 58, 50);
		panel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.setBounds(241, 87, 58, 50);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("9");
		btnNewButton_6.setBounds(10, 160, 58, 50);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("10");
		btnNewButton_7.setBounds(85, 160, 58, 50);
		panel.add(btnNewButton_7);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 309, 251);
		panel.add(scrollPane);
		
		txtqno = new JTextField();
		txtqno.setText("0");
		txtqno.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 11));
		txtqno.setHorizontalAlignment(SwingConstants.CENTER);
		txtqno.setBounds(20, 234, 31, 20);
		frmAssianInstituteExam.getContentPane().add(txtqno);
		txtqno.setColumns(10);
		
		
		
		JLabel lblNewLabel = new JLabel("Marks Obtained");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setBounds(256, 87, 101, 16);
		frmAssianInstituteExam.getContentPane().add(lblNewLabel);
	}
	
	
	public void LoadQuestions(int id) {
		JDBCHandling jd = new JDBCHandling();
		//String query = "select * from java_questions where qId = ? ";
		String query = "select * from java_questions where qId = "+id;
//		try {
//			jd.pstmt.setInt(1, id);
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		try {
			jd.stmt = jd.con.createStatement();
			jd.result = jd.stmt.executeQuery(query);
			
			while(jd.result.next()) {
				txtqno.setText(jd.result.getString(1));
				txtQuestion.setText(jd.result.getString(2));
				txtOptionA.setText(jd.result.getString(3));
				txtOptionB.setText(jd.result.getString(4));
				txtOptionC.setText(jd.result.getString(5));
				txtOptionD.setText(jd.result.getString(6));
				correctAnswer = jd.result.getString(7);
				
				
				break;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
