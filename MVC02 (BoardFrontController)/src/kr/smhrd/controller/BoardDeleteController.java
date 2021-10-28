package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;

public class BoardDeleteController implements Controller{
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int idx = Integer.parseInt(request.getParameter("idx"));
		BoardDAO dao = new BoardDAO();
		dao.boardDelete(idx); // 삭제 성공
		
		return "redirect:/boardList.do"; 
		//:에서 컷팅시키고 뒤쪽 경로로 리다이렉트로 연결해줌 
	}
	
}
