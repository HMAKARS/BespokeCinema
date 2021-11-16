package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class MovieVO {
	
	private int movie_seq;
	private String movie_title;
	private String movie_actor;
	private String movie_story;
	private String genre_name;
	private String open_date;
	private String movie_MBTI;
	private String movie_pos;
	private String movie_spector;
	private String movie_direct;
	private String movie_pre;

}
