package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 게시물(Object)-->번호, 제목, 내용, 작성자, 작성일, 조회수........
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardVO {
	// 정보은닉
	private int idx; //번호
	private String title; //제목
    private String contents; // 내용
    private String writer; //작성자
    private String indate; //작성일
    private int count; //조회수    
    
    private String mb_name;
    private String mb_pwd;
    private String mb_nickname;
	
}
