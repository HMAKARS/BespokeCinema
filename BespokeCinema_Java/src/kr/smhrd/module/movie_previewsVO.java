package kr.smhrd.module;

import java.sql.Date;

public class movie_previewsVO {
	private int preview_seq;
	private int movie_seq;
	private Date preview_start_date;
	private Date preview_end_date;
	private Date preview_streaming;
	private String ott_platform;
	private String theater_name;
	private String theater_addr;
	private String theater_actors;
	
	public int getPreview_seq() {
		return preview_seq;
	}
	public void setPreview_seq(int preview_seq) {
		this.preview_seq = preview_seq;
	}
	public int getMovie_seq() {
		return movie_seq;
	}
	public void setMovie_seq(int movie_seq) {
		this.movie_seq = movie_seq;
	}
	public Date getPreview_start_date() {
		return preview_start_date;
	}
	public void setPreview_start_date(Date preview_start_date) {
		this.preview_start_date = preview_start_date;
	}
	public Date getPreview_end_date() {
		return preview_end_date;
	}
	public void setPreview_end_date(Date preview_end_date) {
		this.preview_end_date = preview_end_date;
	}
	public Date getPreview_streaming() {
		return preview_streaming;
	}
	public void setPreview_streaming(Date preview_streaming) {
		this.preview_streaming = preview_streaming;
	}
	public String getOtt_platform() {
		return ott_platform;
	}
	public void setOtt_platform(String ott_platform) {
		this.ott_platform = ott_platform;
	}
	public String getTheater_name() {
		return theater_name;
	}
	public void setTheater_name(String theater_name) {
		this.theater_name = theater_name;
	}
	public String getTheater_addr() {
		return theater_addr;
	}
	public void setTheater_addr(String theater_addr) {
		this.theater_addr = theater_addr;
	}
	public String getTheater_actors() {
		return theater_actors;
	}
	public void setTheater_actors(String theater_actors) {
		this.theater_actors = theater_actors;
	}
}
