package kr.smhrd.module;

import java.sql.Date;

public class memberVO {
	private String mb_id;
	private String mb_name;
	private String mb_pwd;
	private String mb_phone;
	private Date mb_joindate;
	private String admin_yn;
	private String critic_yn;
	
	public String getMb_id() {
		return mb_id;
	}
	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}
	public String getMb_name() {
		return mb_name;
	}
	public void setMb_name(String mb_name) {
		this.mb_name = mb_name;
	}
	public String getMb_pwd() {
		return mb_pwd;
	}
	public void setMb_pwd(String mb_pwd) {
		this.mb_pwd = mb_pwd;
	}
	public String getMb_phone() {
		return mb_phone;
	}
	public void setMb_phone(String mb_phone) {
		this.mb_phone = mb_phone;
	}
	public Date getMb_joindate() {
		return mb_joindate;
	}
	public void setMb_joindate(Date mb_joindate) {
		this.mb_joindate = mb_joindate;
	}
	public String getAdmin_yn() {
		return admin_yn;
	}
	public void setAdmin_yn(String admin_yn) {
		this.admin_yn = admin_yn;
	}
	public String getCritic_yn() {
		return critic_yn;
	}
	public void setCritic_yn(String critic_yn) {
		this.critic_yn = critic_yn;
	}
}
