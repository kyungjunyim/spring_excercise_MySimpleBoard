package com.example.myboard.dto;

import java.util.Date;

public class BoardDto {
	private int idx;
	private String title;
	private String contents;
	private int view_cnt;
	private Date reg_date;
	public BoardDto() {
		super();
	}
	public BoardDto(int idx, String title, String contents, int view_cnt, Date reg_date) {
		super();
		this.idx = idx;
		this.title = title;
		this.contents = contents;
		this.view_cnt = view_cnt;
		this.reg_date = reg_date;
	}
	public int getIdx() {
		return idx;
	}
	public String getTitle() {
		return title;
	}
	public String getContents() {
		return contents;
	}
	public int getView_cnt() {
		return view_cnt;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public void setView_cnt(int view_cnt) {
		this.view_cnt = view_cnt;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	@Override
	public String toString() {
		return "BoardDto [idx=" + idx + ", title=" + title + ", contents=" + contents + ", view_cnt=" + view_cnt
				+ ", reg_date=" + reg_date + "]";
	}
}
