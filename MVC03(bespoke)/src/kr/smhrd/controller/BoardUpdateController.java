package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;

public class BoardUpdateController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String title=request.getParameter("title");
		String contents=request.getParameter("contents");
		int idx=Integer.parseInt(request.getParameter("idx"));
		
		BoardVO vo=new BoardVO();
		vo.setTitle(title);
		vo.setContents(contents);
		vo.setIdx(idx);
		
		BoardDAO dao=new BoardDAO();
		dao.boardUpdate(vo); //수정성공->리스트로...
				
		return "redirect:/boardList.do";
	}

}
