package kr.smhrd.model;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserVO { 
	
	private String mb_id;
	private String mb_name;
	private String mb_pwd;
	private String mb_email;
	private String admin_yn;
	private String mb_mbti;
	
}
