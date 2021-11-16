package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ReviewVO {
   
   private int movie_seq; //영화 번호
   private int review_seq; //리뷰 번호
   private int star_score; //평점
   private String document; //리뷰 내용
   private int label; //긍정, 부정

}
