package kr.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;
import kr.smhrd.model.MovieDAO;
import kr.smhrd.model.MovieVO;
import kr.smhrd.model.ReviewDAO;
import kr.smhrd.model.ReviewVO;
import kr.smhrd.model.UserVO;

public class ReviewListController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		int movie_seq = Integer.parseInt(request.getParameter("movie_seq"));
		MovieDAO dao=new MovieDAO();
		MovieVO vo = new MovieVO();
		vo.setMovie_seq(movie_seq);
		
		MovieVO list2 = dao.movieList(movie_seq);
		request.setAttribute("list2", list2);//중요
		//request.setAttribute의 키와 값을 이용하여 Attrubute에 담아 JSP로 보내게 된다.
		//Controller에서-ArrayList-Vo를-JSP로-보내고-JSP에서-받고-사용하기
		// View의 경로를 만들어서 문자열로 리턴해주는 역할 
		
		
		ReviewDAO dao1=new ReviewDAO();
		
		ArrayList<ReviewVO> list=(ArrayList<ReviewVO>) dao1.reviewList(vo);
		request.setAttribute("list", list);//중요
		//request.setAttribute의 키와 값을 이용하여 Attrubute에 담아 JSP로 보내게 된다.
		//Controller에서-ArrayList-Vo를-JSP로-보내고-JSP에서-받고-사용하기
		// View의 경로를 만들어서 문자열로 리턴해주는 역할
		return "reviewList"; 
	}
	
	

}
