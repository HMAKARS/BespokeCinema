package kr.smhrd.module;

import java.sql.Date;

public class reviewsVO {
	private String review_seq;
	private String movie_seq;
	private String review_content;
	private Date reg_date;
	private String mb_id;
	private int review_rating;
	private String critic_yn;
	
	public String getReview_seq() {
		return review_seq;
	}
	public void setReview_seq(String review_seq) {
		this.review_seq = review_seq;
	}
	public String getMovie_seq() {
		return movie_seq;
	}
	public void setMovie_seq(String movie_seq) {
		this.movie_seq = movie_seq;
	}
	public String getReview_content() {
		return review_content;
	}
	public void setReview_content(String review_content) {
		this.review_content = review_content;
	}
	public Date getReg_date() {
		return reg_date;
	}
	public void setReg_date(Date reg_date) {
		this.reg_date = reg_date;
	}
	public String getMb_id() {
		return mb_id;
	}
	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}
	public int getReview_rating() {
		return review_rating;
	}
	public void setReview_rating(int review_rating) {
		this.review_rating = review_rating;
	}
	public String getCritic_yn() {
		return critic_yn;
	}
	public void setCritic_yn(String critic_yn) {
		this.critic_yn = critic_yn;
	}
}
