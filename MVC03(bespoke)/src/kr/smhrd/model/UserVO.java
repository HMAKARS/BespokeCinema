package kr.smhrd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserVO { 
	private int idx;
	private String id;
	private String password;
	private String username;
	private String email;
}
