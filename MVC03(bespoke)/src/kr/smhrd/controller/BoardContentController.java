package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;

public class BoardContentController implements Controller{
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int idx=Integer.parseInt(request.getParameter("idx"));
		BoardDAO dao=new BoardDAO();
		BoardVO vo=dao.boardContent(idx);
		//상세보기 페이지(응답) => View(JSP : boardContent.jsp)
		request.setAttribute("vo", vo);		
		
		return "boardContent"; //View의 논리적인이름
	}

}
