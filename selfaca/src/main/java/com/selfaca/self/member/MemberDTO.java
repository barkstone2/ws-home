package com.selfaca.self.member;

public class MemberDTO {
	private String mId;
	private String mPw;
	private String mPwc;
	private String mName;
	
	public MemberDTO() {
	}

	public MemberDTO(String mId, String mPw, String mName) {
		super();
		this.mId = mId;
		this.mPw = mPw;
		this.mName = mName;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getmPwc() {
		return mPwc;
	}

	public void setmPwc(String mPwc) {
		this.mPwc = mPwc;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}


	
	
}
