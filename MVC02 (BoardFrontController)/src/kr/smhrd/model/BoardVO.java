package kr.smhrd.model;
// 게시물(Object)-->번호, 제목, 내용, 작성자, 작성일, 조회수........

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//STS와 lombok을 연결시켜야 한다. 현재는 import만 한 상태이다. 
//lombok의 역할 : getter와 setter 생략가능
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
    
	
}
