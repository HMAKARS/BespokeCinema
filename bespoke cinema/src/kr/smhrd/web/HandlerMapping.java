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
		
		mappings.put("/login.do", new LoginController());		
		mappings.put("/logout.do", new LogoutController());		
		mappings.put("/reviewList.do", new ReviewListController());
		mappings.put("/memberForm.do", new MemberFormController());
		mappings.put("/memberInsert.do", new MemberInsertController());
		mappings.put("/moviemypage.do", new MyPageController());
		mappings.put("/movieContent.do", new MovieMyContentController());
		mappings.put("/moviemypage.do", new MyPageController());
		mappings.put("/moviemycal.do", new calController());
		mappings.put("/moviembti.do", new MbtiMainController());
		mappings.put("/moviembti2.do", new MbtiMainController2());
		mappings.put("/moviefirst.do", new MovieFirstController());
		mappings.put("/movieview.do", new viewController());
		mappings.put("/movieUpdate.do", new MemUpdateController());
		mappings.put("/moviemain.do", new MovieMainContentController());
		mappings.put("/movieLogin.do", new MovieLoginController());
		mappings.put("/reviewUpdate.do", new ReviewUpdateController());
		
	}
	//                               /boardList.do
	public Controller getController(String key) {
		return mappings.get(key);
	}
}
