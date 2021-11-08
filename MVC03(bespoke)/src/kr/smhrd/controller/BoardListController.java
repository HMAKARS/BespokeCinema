package kr.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;

// POJO
public class BoardListController implements Controller{
    public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
    		                                           throws ServletException, IOException{
    	BoardDAO dao=new BoardDAO();
		List<BoardVO> list=dao.boardList();
		request.setAttribute("list", list);//중요    
		// View의 경로를 만들어서 문자열로 리턴해주는 역할
		return "boardList"; // ViewResolver 부터 수업~
    }
}









