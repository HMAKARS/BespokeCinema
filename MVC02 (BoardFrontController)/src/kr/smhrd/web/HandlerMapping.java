package kr.smhrd.web;

import java.util.HashMap;

import kr.smhrd.controller.*;

public class HandlerMapping {
	//ㅡㅡㅡㅡKEYㅡㅡㅡㅡㅡㅡㅡVALUE
	// /boardList.do -> ??
	// /boardInsert.do -> ??
	// /boardDelete.do -> ??
	// /boardForm.do -> ??
	// /boardUpdate.do -> ??
	// /boardContent.do -> ??
	
	//Hash가 들어가면 빠른 검색, 탐색속도를 요구한다. 자료구조와 관련된 API중 key와 valuee 동시에 가진 자료구조 HashMap 을 사용함.
	
	private HashMap<String, Controller> mappings; 
	//key값에 controller를 넣는 이유 : 각기 자식마다 내용이 달라지기 때문에 부모인 controller로 타입을 정해준다. 
	public HandlerMapping() {
		mappings=new HashMap<String, Controller>();
		mappings.put("/boardList.do", new BoardListController());
		mappings.put("/boardForm.do", new BoardFormController());
		mappings.put("/boardInsert.do", new BoardInsertController());
		mappings.put("/boardUpdate.do", new BoardUpdateController());
		mappings.put("/boardContent.do", new BoardContentController());
		mappings.put("/boardDelete.do", new BoardDeleteController());
		//새로 login.do 를 만든다 치면 new LoginController();로 매팅을 해주면 됨.
		
	}

	//프론트컨트롤러가 HandlerMapping을 거쳐 키값을 보내주면 어떤 controller(리턴타입)가 동작하도록 return해주는 메소드
	public Controller getConroller(String key) {
		return mappings.get(key);
	}
}
