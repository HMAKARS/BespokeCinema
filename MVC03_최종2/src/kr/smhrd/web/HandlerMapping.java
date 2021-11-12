package kr.smhrd.web;

import java.util.HashMap;

import kr.smhrd.controller.*;
public class HandlerMapping {
    //        KEY       VALUE    
	// /boardList.do  --->?
	// /boardInsert.do--->?
	// /boardDelete.do--->?
	private HashMap<String, Controller> mappings;
	public HandlerMapping() {
		mappings=new HashMap<String, Controller>();
		mappings.put("/boardList.do", new BoardListController());
		mappings.put("/boardForm.do", new BoardFormController());
		mappings.put("/boardInsert.do", new BoardInsertController());
		mappings.put("/boardContent.do", new BoardContentController());
		mappings.put("/boardUpdate.do", new BoardUpdateController());
		mappings.put("/boardDelete.do", new BoardDeleteController());
		mappings.put("/login.do", new LoginController());		
		mappings.put("/logout.do", new LogoutController());		
		
		mappings.put("/memberForm.do", new MemberFormController());
		mappings.put("/memberInsert.do", new MemberInsertController());
		
		mappings.put("/reveiwList.do", new ReviewListController());
		
	}
	//                               /boardList.do
	public Controller getController(String key) {
		return mappings.get(key);
	}
}
