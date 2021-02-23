package com.homeboard.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.homeboard.board.dto.BoardDTO;
import com.homeboard.db.Db;

public class BoardDAO {
	private Db db = new Db();
	private Connection conn = db.getConn();
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	public BoardDAO() {
	}
	
	public void quitConn() {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int bWrite(BoardDTO dto) {
		int result = 0;
		try {
			String sql = "insert into board "
					+ "(bNo,bSubject,bContent,bWriter,wDate,bPw,bHit,bReplyCount,thumbsUpCount,thumbsDownCount) "
					+ "values(seq_board.nextval,???,default,?,default,default,default,default)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getbSubject());
			pstmt.setString(2, dto.getbContent());
			pstmt.setString(3, dto.getbWriter());
			pstmt.setString(4, dto.getbPw());
			result = pstmt.executeUpdate();
		}catch (Exception e) {
			e.printStackTrace();
		}
		quitConn();
		return result;
	}
}
