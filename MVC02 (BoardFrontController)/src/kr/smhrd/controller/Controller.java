package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller {
	
	//Method 이름 통일
	//Why?? >> 하는 일이 다 비슷하니까 효율을 위해. 필수적인 작업이 아님.
	//How?? >> interface를 만든다. requestHandler를 만든다. 추상메소드로 implements한다.
	//하위 클래스는 implement로 구현한다. 
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
	//기존 ListController 서블릿에서 받은 서비스메소드가 사라진 대신에 매개변수로서의 기능만 가져옴. 
			throws ServletException, IOException;
	
}
