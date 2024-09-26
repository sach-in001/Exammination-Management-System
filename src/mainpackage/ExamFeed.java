package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExamFeed {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExamFeed window = new ExamFeed();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExamFeed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		//frame.setBounds(100, 100, 450, 300);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frame.setSize(width,height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("ASSIAN INSTITUTE OF ENGINEERING");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 0, 1266, 47);
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblProgrammingLanguageExams = new JLabel("Explore Various In Demand Programming Language");
		lblProgrammingLanguageExams.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgrammingLanguageExams.setToolTipText("");
		lblProgrammingLanguageExams.setForeground(Color.GRAY);
		lblProgrammingLanguageExams.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblProgrammingLanguageExams.setBounds(232, 51, 801, 45);
		frame.getContentPane().add(lblProgrammingLanguageExams);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(232, 160, 319, 210);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Java");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(21, 11, 276, 102);
		panel_1.add(lblNewLabel_2);
		
		JButton btnCreateAccount = new JButton("Explore More...");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaExamForm.main(null);
			}
		});
		btnCreateAccount.setForeground(new Color(0, 64, 128));
		btnCreateAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCreateAccount.setBounds(8, 133, 303, 66);
		panel_1.add(btnCreateAccount);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_1.setBackground(new Color(0, 64, 128));
		panel_1_1.setBounds(714, 160, 319, 210);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Python");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(21, 11, 276, 102);
		panel_1_1.add(lblNewLabel_2_1);
		
		JButton btnCreateAccount_1 = new JButton("Explore More...");
		btnCreateAccount_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PythonExamPage1.main(null);
				
			}
		});
		btnCreateAccount_1.setForeground(new Color(0, 64, 128));
		btnCreateAccount_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCreateAccount_1.setBounds(8, 133, 303, 66);
		panel_1_1.add(btnCreateAccount_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2.setBackground(new Color(0, 64, 128));
		panel_1_2.setBounds(232, 411, 319, 210);
		frame.getContentPane().add(panel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("C++");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblNewLabel_2_2.setBackground(Color.WHITE);
		lblNewLabel_2_2.setBounds(21, 11, 276, 102);
		panel_1_2.add(lblNewLabel_2_2);
		
		JButton btnCreateAccount_2 = new JButton("Explore More...");
		btnCreateAccount_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CppExamPage1.main(null);
			}
		});
		btnCreateAccount_2.setForeground(new Color(0, 64, 128));
		btnCreateAccount_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCreateAccount_2.setBounds(8, 133, 303, 66);
		panel_1_2.add(btnCreateAccount_2);
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1_2_1.setBackground(new Color(0, 64, 128));
		panel_1_2_1.setBounds(714, 411, 319, 210);
		frame.getContentPane().add(panel_1_2_1);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("C");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblNewLabel_2_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_2_1.setBounds(21, 11, 276, 102);
		panel_1_2_1.add(lblNewLabel_2_2_1);
		
		JButton btnCreateAccount_2_1 = new JButton("Explore More...");
		btnCreateAccount_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CexamPage1.main(null);
			}
		});
		btnCreateAccount_2_1.setForeground(new Color(0, 64, 128));
		btnCreateAccount_2_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCreateAccount_2_1.setBounds(8, 133, 303, 66);
		panel_1_2_1.add(btnCreateAccount_2_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 124, 1207, 2);
		frame.getContentPane().add(separator);
	}
}
