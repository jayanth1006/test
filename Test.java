// Write the import code at top
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SchoolRecord extends javax.swing.JFrame {

	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	// JButton1 Code starts from here
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/student", "root",
			"root");
		stmt = con.createStatement();
		String rollno = jTextField1.getText();
		String name = jTextField2.getText();
		String class = jTextField3.getText();
		String sec = jTextField4.getText();
		String adr = jTextArea1.getText();
		String INSERT = "INSERT INTO RECORD VALUES('"
						+ rollno + "','" + name + "','"
						+ class + "','" + sec + "','" + adr
						+ "');";
		stmt.executeUpdate(INSERT);
		JOptionPane.showMessageDialog(
			this, "Record Added Successfully");
		jButton1.setEnabled(true);
	}
	catch (Exception e) {
		JOptionPane.showMessageDialog(
			this, "Error In Connectivity");
	}
