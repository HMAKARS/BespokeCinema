package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;

public class BoardInsertController implements Controller{
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title=request.getParameter("title");
		String contents=request.getParameter("contents");
		String writer=request.getParameter("writer");
		
		BoardVO vo=new BoardVO();
		vo.setTitle(title);
		vo.setContents(contents);
		vo.setWriter(writer);
				
		BoardDAO dao=new BoardDAO();
		dao.boardInsert(vo);
		
		return "redirect:/boardList.do";
	}

}
