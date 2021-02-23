package com.selfaca.self.member;

public interface IMemberDAO {
	void getConn();
	void quitConn();
	int memberInsert(String mId, String mPw, String mName);
}
