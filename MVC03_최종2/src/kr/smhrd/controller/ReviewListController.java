package kr.smhrd.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;
import kr.smhrd.model.ReviewDAO;
import kr.smhrd.model.ReviewVO;

public class ReviewListController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ReviewDAO dao=new ReviewDAO();
		List<ReviewVO> list=dao.reviewList();
		request.setAttribute("list", list);//중요    
		// View의 경로를 만들어서 문자열로 리턴해주는 역할
		return "reviewList"; 
	}
	
	

}
