package com.newlecture.web.entity;

import java.sql.Timestamp;

public class NoticeView extends Notice{
	private String memberName;
	
	public NoticeView() {
	}

	public NoticeView(int id, String title, String writer_id, String content, Timestamp regDate, int hit, boolean pub, String memberName) {
		super(id, title, writer_id, content, regDate, hit, pub);
		
		this.memberName = memberName;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return "NoticeView [memberName=" + memberName + ", getId()=" + getId() + ", getTitle()=" + getTitle()
				+ ", getWriter_id()=" + getWriter_id() + ", getContent()=" + getContent() + ", getRegDate()="
				+ getRegDate() + ", getHit()=" + getHit() + ", isPub()=" + isPub() + "]";
	}
	
	
}
