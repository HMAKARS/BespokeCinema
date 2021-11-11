package kr.smhrd.module;

import java.sql.Date;

public class moviesVO {
	private int movie_seq;
	private String movie_title;
	private String movie_actor;
	private String movie_story;
	private int movie_playtime;
	private String movie_genre;
	private String movie_ratings;
	private String movie_preview ;
	private Date reg_date ;
	private String mb_id ;
	private int genre_seq;
	private int mbti_seq;
	public int getMovie_seq() {
		return movie_seq;
	}
	public void setMovie_seq(int movie_seq) {
		this.movie_seq = movie_seq;
	}
	public String getMovie_title() {
		return movie_title;
	}
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}
	public String getMovie_actor() {
		return movie_actor;
	}
	public void setMovie_actor(String movie_actor) {
		this.movie_actor = movie_actor;
	}
	public String getMovie_story() {
		return movie_story;
	}
	public void setMovie_story(String movie_story) {
		this.movie_story = movie_story;
	}
	public int getMovie_playtime() {
		return movie_playtime;
	}
	public void setMovie_playtime(int movie_playtime) {
		this.movie_playtime = movie_playtime;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public String getMovie_ratings() {
		return movie_ratings;
	}
	public void setMovie_ratings(String movie_ratings) {
		this.movie_ratings = movie_ratings;
	}
	public String getMovie_preview() {
		return movie_preview;
	}
	public void setMovie_preview(String movie_preview) {
		this.movie_preview = movie_preview;
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
	public int getGenre_seq() {
		return genre_seq;
	}
	public void setGenre_seq(int genre_seq) {
		this.genre_seq = genre_seq;
	}
	public int getMbti_seq() {
		return mbti_seq;
	}
	public void setMbti_seq(int mbti_seq) {
		this.mbti_seq = mbti_seq;
	}
}
