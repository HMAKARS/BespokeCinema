package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;
import kr.smhrd.model.*;

public class MovieMyContentController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BoardDAO dao=new BoardDAO();
	   int idx =Integer.parseInt(request.getParameter("idx"));
	   UserVO vo=dao.movieContent(idx);
		
		
		System.out.println(vo);
		//상세보기 페이지(응답) => View(JSP : boardContent.jsp)
		request.setAttribute("vo", vo);		
		
		return "mypage"; //View의 논리적인이름
	}

}
