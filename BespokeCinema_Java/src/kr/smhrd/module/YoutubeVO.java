package kr.smhrd.module;

import java.sql.Date;

public class YoutubeVO {
	private int youtube_seq;
	private String youtube_name;
	private String youtube_link;
	private String youtube_tittle;
	private int youtube_length;
	private Date red_date;
	private String mb_id;
	public int getYoutube_seq() {
		return youtube_seq;
	}
	public void setYoutube_seq(int youtube_seq) {
		this.youtube_seq = youtube_seq;
	}
	public String getYoutube_name() {
		return youtube_name;
	}
	public void setYoutube_name(String youtube_name) {
		this.youtube_name = youtube_name;
	}
	public String getYoutube_link() {
		return youtube_link;
	}
	public void setYoutube_link(String youtube_link) {
		this.youtube_link = youtube_link;
	}
	public String getYoutube_tittle() {
		return youtube_tittle;
	}
	public void setYoutube_tittle(String youtube_tittle) {
		this.youtube_tittle = youtube_tittle;
	}
	public int getYoutube_length() {
		return youtube_length;
	}
	public void setYoutube_length(int youtube_length) {
		this.youtube_length = youtube_length;
	}
	public Date getRed_date() {
		return red_date;
	}
	public void setRed_date(Date red_date) {
		this.red_date = red_date;
	}
	public String getMb_id() {
		return mb_id;
	}
	public void setMb_id(String mb_id) {
		this.mb_id = mb_id;
	}
}
