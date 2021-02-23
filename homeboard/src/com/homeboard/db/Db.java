package com.homeboard.db;

import java.sql.Connection;
import javax.naming.InitialContext;
import org.apache.tomcat.jdbc.pool.DataSource;


public class Db {
	private DataSource dataSource;
	private Connection conn = null;
	
	public Db() {
	}
	
	public Connection getConn() {
		try {
			InitialContext context = new InitialContext();
			dataSource = (DataSource)context.lookup("java:comp/env/jdbc/Oracle11g");
			conn = dataSource.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
}
