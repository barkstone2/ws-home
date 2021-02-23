package com.selfaca.self.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDAO implements IMemberDAO{
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	@Override
	public void getConn() {
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String dbId = "selfaca";
			String dbPw = "1234";
			Class.forName(driver);
			conn = DriverManager.getConnection(dbUrl, dbId, dbPw);
			System.out.println("오라클 접속 성공");
		}catch (Exception e) {
			System.out.println("오라클 접속 실패");
			e.printStackTrace();
		}
	}
	@Override
	public void quitConn() {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public int memberInsert(String mId, String mPw, String mName) {
		int result = 0;
		getConn();
		try {
			String sql = "insert into member (mId, mPw, mName) values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mId);
			pstmt.setString(2, mPw);
			pstmt.setString(3, mName);
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		quitConn();
		return result;
	}
}
