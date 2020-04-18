package com.spring.app.dto;

import java.sql.Date;

/**
 * 게시판 VO
 * @author Han
 *
 */
public class BoardDto {

	private int bno;			// 게시글 번호
	private String title;		// 제목
	private String content;		// 내용
	private String writer;		// 작성자
	private int hit;			// 조회수
	private String registrant;	// 등록자
	private Date reg_date; 		// 게시글 작성일
	private String modifier;	// 수정자
	private Date modi_date;		// 게시글 수정일
	private char del_yn; 		// 삭제 여부
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	public String getRegistrant() {
		return registrant;
	}
	public void setRegistrant(String registrant) {
		this.registrant = registrant;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public Date getModi_date() {
		return modi_date;
	}
	public void setModi_date(Date modi_date) {
		this.modi_date = modi_date;
	}
	public char getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(char del_yn) {
		this.del_yn = del_yn;
	}
	
	@Override
	public String toString() {
		return "BoardDto [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", hit="
				+ hit + ", registrant=" + registrant + ", reg_date=" + reg_date + ", modifier=" + modifier
				+ ", modi_date=" + modi_date + ", del_yn=" + del_yn + "]";
	}
}
