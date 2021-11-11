package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardFormController implements Controller {
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
	//기존 ListController 서블릿에서 받은 서비스메소드가 사라진 대신에 매개변수로서의 기능만 가져옴. 
			throws ServletException, IOException {
		return "boardForm";
	}
}
