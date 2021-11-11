package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;

public class BoardContentController implements Controller{
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	int idx = Integer.parseInt(request.getParameter("idx"));
	//idx를 dao쪽으로 넘겨서 idx에 해당하는 게시글 딱 한개의 구조로 넘겨주면 됨
	BoardDAO dao = new BoardDAO();
	BoardVO vo=dao.boardContent(idx);
	//상세 보기 페이지(응답) = View가 담당해야함(JSP)
	//객체 바인딩
    request.setAttribute("vo", vo);
    
    return "boardContent";

	}
}