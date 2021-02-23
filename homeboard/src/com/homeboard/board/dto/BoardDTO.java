package com.homeboard.board.dto;

public class BoardDTO {
	private int bNo;
	private String bSubject;
	private String bContent;
	private String bWriter;
	private String wDate;
	private String bPw;
	private int bHit;
	private int bReplyCount;
	private int thumbsUpCount;
	private int thumbsDownCount;
	
	public BoardDTO() {
	}

	public int getbNo() {
		return bNo;
	}

	public void setbNo(int bNo) {
		this.bNo = bNo;
	}

	public String getbSubject() {
		return bSubject;
	}

	public void setbSubject(String bSubject) {
		this.bSubject = bSubject;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public String getwDate() {
		return wDate;
	}

	public void setwDate(String wDate) {
		this.wDate = wDate;
	}

	public String getbPw() {
		return bPw;
	}

	public void setbPw(String bPw) {
		this.bPw = bPw;
	}

	public int getbHit() {
		return bHit;
	}

	public void setbHit(int bHit) {
		this.bHit = bHit;
	}

	public int getbReplyCount() {
		return bReplyCount;
	}

	public void setbReplyCount(int bReplyCount) {
		this.bReplyCount = bReplyCount;
	}

	public int getThumbsUpCount() {
		return thumbsUpCount;
	}

	public void setThumbsUpCount(int thumbsUpCount) {
		this.thumbsUpCount = thumbsUpCount;
	}

	public int getThumbsDownCount() {
		return thumbsDownCount;
	}

	public void setThumbsDownCount(int thumbsDownCount) {
		this.thumbsDownCount = thumbsDownCount;
	}
	
	
	
	
}
