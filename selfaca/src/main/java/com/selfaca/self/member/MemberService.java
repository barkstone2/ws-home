package com.selfaca.self.member;

public class MemberService implements IMemberService{
	private MemberDAO memberDAO;
	
	public MemberService() {
		memberDAO = new MemberDAO();
	}

	@Override
	public int memberJoin(String mId, String mPw, String mName) {
		return memberDAO.memberInsert(mId, mPw, mName);
	}
	
}
