package package1;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CexamPage1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CexamPage1 window = new CexamPage1();
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
	public CexamPage1() {
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
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(0, 11, 1266, 47);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblProgrammingLanguageExams = new JLabel("Explore Various In Demand Programming Language");
		lblProgrammingLanguageExams.setToolTipText("");
		lblProgrammingLanguageExams.setHorizontalAlignment(SwingConstants.CENTER);
		lblProgrammingLanguageExams.setForeground(Color.GRAY);
		lblProgrammingLanguageExams.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblProgrammingLanguageExams.setBounds(232, 62, 801, 45);
		frame.getContentPane().add(lblProgrammingLanguageExams);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(29, 135, 1207, 2);
		frame.getContentPane().add(separator);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBackground(new Color(0, 64, 128));
		panel_1.setBounds(232, 161, 801, 421);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C Programming");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(78, 45, 645, 102);
		panel_1.add(lblNewLabel_2);
		
		JButton btnCreateAccount = new JButton("Enroll Now");
		btnCreateAccount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaPaymentForm.main(null);
			}
		});
		btnCreateAccount.setForeground(new Color(255, 0, 0));
		btnCreateAccount.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnCreateAccount.setBounds(249, 186, 303, 66);
		panel_1.add(btnCreateAccount);
		
		JButton btnStart = new JButton("START");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaExamEntry.main(null);
			}
		});
		btnStart.setBackground(new Color(0, 128, 64));
		btnStart.setForeground(new Color(255, 255, 255));
		btnStart.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnStart.setBounds(249, 285, 303, 66);
		panel_1.add(btnStart);
	}
}
