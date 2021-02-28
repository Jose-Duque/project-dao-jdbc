package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;
import db.DbIntegrityException;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		try {
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE ID = 4");
			
			
			int rowsAffected = st.executeUpdate();
			System.out.println("Done! rows affected - " + rowsAffected);
		}
		catch(SQLException e) {
			throw new DbIntegrityException("cannot be delete " ) ;
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}

}
