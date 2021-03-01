package com.newlecture.web.entity;

import java.sql.Timestamp;

public class Notice {
	private int id;
	private String title;
	private String writer_id;
	private String content;
	private Timestamp regDate;
	private int hit;
	private boolean pub;
	
	public Notice() {
	}

	public Notice(int id, String title, String writer_id, String content, Timestamp regDate, int hit, boolean pub) {
		super();
		this.id = id;
		this.title = title;
		this.writer_id = writer_id;
		this.content = content;
		this.regDate = regDate;
		this.hit = hit;
		this.pub = pub;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter_id() {
		return writer_id;
	}

	public void setWriter_id(String writer_id) {
		this.writer_id = writer_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getRegDate() {
		return regDate;
	}

	public void setRegDate(Timestamp regDate) {
		this.regDate = regDate;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public boolean isPub() {
		return pub;
	}

	public void setPub(boolean pub) {
		this.pub = pub;
	}

	@Override
	public String toString() {
		return "Notice [id=" + id + ", title=" + title + ", writer_id=" + writer_id + ", content=" + content
				+ ", regDate=" + regDate + ", hit=" + hit + ", pub=" + pub + "]";
	}
	
	
}
