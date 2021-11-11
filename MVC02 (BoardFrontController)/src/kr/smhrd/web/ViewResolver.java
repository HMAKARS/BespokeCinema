package kr.smhrd.web;

public class ViewResolver {
	
	private ViewResolver() { 
		//디폴트 생성자 메소드의 접근지정자가 private일때 static 메소드가 있으면 객체생성이 가능하다. >> 자바 객체 생성과 관련해서 다시 공부

		//Math m = new Math(); = X //private Math(){  } = O >> 의 형태로 생성자메소드에 생성되어있다는 뜻
		//System sys = new System(); = X //private System(){  } = O >> 의 형태로 생성자 메소드에 생성되어있다는 뜻
		
	}
	
	//boardList >> /WEB-INF/board/boardList.jsp 로 접두사와 접미사를 붙여주는 클래스
	public static String makeViewUrl(String view) {
		
		
		return "/WEB-INF/board/"+view+".jsp";
		//ㅡㅡㅡㅡㅡ접두사ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ접미사
	}

}
