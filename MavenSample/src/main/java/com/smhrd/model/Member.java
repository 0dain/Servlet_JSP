package com.smhrd.model;


//회원관련 정보
public class Member {
	
	private String id;
	private String pw;
	private String nick;

	//생성자
	public Member(String id, String pw, String nick) {
		this.id=id;
		this.pw=pw;
		this.nick=nick;
	}
	
	public Member(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	//mybatis는 get메서드 필수!
	public String getId() {
		return id;
	}
	
	public String getPw() {
		return pw;
	}
	
	public String getNick() {
		return nick;
	}
	
}
