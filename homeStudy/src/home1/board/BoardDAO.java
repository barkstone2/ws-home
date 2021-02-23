package home1.board;

import java.sql.Connection;

import javax.naming.InitialContext;

import org.apache.tomcat.jdbc.pool.DataSource;


public class BoardDAO {
	private DataSource dataSource;
	
	public BoardDAO() {
		try {
			InitialContext context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			Connection conn = dataSource.getConnection();
			
		}catch(Exception e) {
			
		}
		
	
	}
	
	
	
}
