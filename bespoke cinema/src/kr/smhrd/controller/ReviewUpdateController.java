package kr.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;
import kr.smhrd.model.MovieVO;
import kr.smhrd.model.ReviewDAO;
import kr.smhrd.model.ReviewVO;

public class ReviewUpdateController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		MovieVO vo2 = new MovieVO();
		ReviewVO vo=new ReviewVO();
		ReviewDAO dao=new ReviewDAO();
		int score=Integer.parseInt(request.getParameter("score"));
		String review=request.getParameter("review");
		int movie_seq = Integer.parseInt(request.getParameter("movie_seq"));
		
		
		System.out.println(score);
		System.out.println(review);
		System.out.println(movie_seq);
		
		
		vo.setStar_score(score);
		vo.setDocument(review);
		vo2.setMovie_seq(movie_seq);
		vo.setMovie_seq(movie_seq);
		
		
		System.out.println(movie_seq);
		
		System.out.println(vo);
		System.out.println(vo2);
		
		ArrayList<ReviewVO> list=(ArrayList<ReviewVO>) dao.reviewList(vo2);
		request.setAttribute("list", list);
		dao.reviewInsert(vo);
		
		
		
		
		
		return "redirect:/reviewList.do?movie_seq="+vo2.getMovie_seq();
	}

}
