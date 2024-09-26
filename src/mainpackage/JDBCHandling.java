package package1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class JDBCHandling {
	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt = null;
	ResultSet result = null;
	
	public JDBCHandling() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Got Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","Vv@9420290615");
			System.out.println("Got Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	int insertData(String firstName, String lastName, String email, int mobile, String password, String confirmPassword, String dob, String gender) {
		
		int status = 0;
		
		
		try {
			pstmt = con.prepareStatement("insert into userdata values (default,?,?,?,?,?,?,?,?,default)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, email);
			pstmt.setInt(4, mobile);
			pstmt.setString(5, password);
			pstmt.setString(6, confirmPassword);
			pstmt.setString(7, dob);
			pstmt.setString(8, gender);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
int insertAdminData(String firstName, String lastName, String gender,long mobile,String email, String password, String confirmPassword, String dob) {
		
		int status = 0;
		
		
		try {
			pstmt = con.prepareStatement("insert into admindata values (default,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, gender);
			pstmt.setLong(4, mobile);
			pstmt.setString(5, email);
			pstmt.setString(6, password);
			pstmt.setString(7, confirmPassword);
			pstmt.setString(8, dob);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

	
	
//	int validate(String email, String password) {
//			
//			int status = 0;
//			
//			
//			try {
//				pstmt = con.prepareStatement("SELECT * FROM userdata WHERE email=? AND passwordd=?");
//				pstmt.setString(1, email);
//				pstmt.setString(2, passwordd);				
//				status = pstmt.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			return status;
//	}
	
//	int validate(String email, String password) {
//		
//		
//		String query = "SELECT * FROM users WHERE username=? AND password=?";
//		try {
//			pstmt = con.prepareStatement(query);
//			pstmt.setString(1, email);
//			pstmt.setString(2, password);
//		    if 
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
//		return result;
//	}
	
	int validate(String email, String password) {
		int status = 0;

		String query = "SELECT * FROM company.userdata WHERE email=? AND passwordd=?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);

		    ResultSet resultSet = pstmt.executeQuery();

		    if (resultSet.next()) {
		        boolean approved = resultSet.getBoolean("approved");
		        if (approved) {
		        	status = 1;
		        } else {
		        	status = 0;
		        }
		    }
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return status;

	}
	
	int validateAdmin(String email, String password) {
		int status = 0;

		String query = "SELECT * FROM company.admindata WHERE email=? AND password=?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);

		    ResultSet resultSet = pstmt.executeQuery();
		    
		    if(resultSet.next()) {
		    	status =1;
		    }

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return status;

	}
	
	int validateJavaApproval(String email, String password) {
		int status = 0;

		String query = "SELECT * FROM company.java_approval WHERE email=? AND pin=? AND approved = true";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, email);
			pstmt.setString(2, password);

		    ResultSet resultSet = pstmt.executeQuery();
		    
		    if(resultSet.next()) {
		    	status =1;
		    }

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return status;

	}
	
	ResultSet getTable() {
		try {
			stmt = con.createStatement();
			result = stmt.executeQuery("select * from java_approval");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
int insertData(String firstName, String lastName, String email,long mobile, int pin) {
		
		int status = 0;
		
		
		try {
			pstmt = con.prepareStatement("insert into java_approval values (default,?,?,?,?,?,default)");
			pstmt.setString(1, firstName);
			pstmt.setString(2, lastName);
			pstmt.setString(3, email);
			pstmt.setLong(4, mobile);
			pstmt.setInt(5, pin);
			
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
public void loadQuestion(String question, String optA, String optB, String optC, String optD, String ans, String correctAns ) {
	
	String query = "select * from java_questions";
	try {
		stmt = con.createStatement();
		result = stmt.executeQuery(query);
		
		while(result.next()) {
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	int approve(int id) {
		int status =0;
		try {
			pstmt = con.prepareStatement("UPDATE java_approval SET approved=true WHERE id = ?");
			pstmt.setInt(1, id);
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
		// Example to approve a user
//		String approveQuery = "UPDATE java_approval SET approved=true WHERE id = ?";
//		try (PreparedStatement approveStatement = con.prepareStatement(approveQuery)) {
//		    approveStatement.setIn(1, id);
//		    int rowsUpdated = approveStatement.executeUpdate();
//		    // Check if rowsUpdated > 0 to ensure the user was updated
//		}

	}
	
}
