package kr.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.MovieDAO;
import kr.smhrd.model.MovieVO;
import kr.smhrd.model.UserVO;
import kr.smhrd.web.ViewResolver;



public class MbtiMainController implements Controller{
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserVO vo = new UserVO();
		
//		int idx=Integer.parseInt(request.getParameter("idx"));
//		vo.setIdx(idx);
        MovieDAO dao1=new MovieDAO();
        
		ArrayList<MovieVO> list = (ArrayList<MovieVO>)dao1.allMovieList();
		System.out.println(vo);
		 
	      
		Random rd = new Random();
		int suggest[] = new int[4];
	      
	      for(int i=0; i<suggest.length; i++) {
	         suggest[i] = rd.nextInt(list.size())+1;
	         
	         for(int j=0; j<i; j++) {
	            if(suggest[i] == suggest[j]) {
	               i--;
	            }
	         }
	      }
	      MovieVO vo1=dao1.movieList1(suggest[0]);
	      request.setAttribute("vo1", vo1);
	     
	      MovieVO vo2=dao1.movieList1(suggest[1]);
	      request.setAttribute("vo2", vo2);
	      
	      
	      MovieVO vo3=dao1.movieList1(suggest[2]);
	      request.setAttribute("vo3", vo3);
	      
	      MovieVO vo4=dao1.movieList1(suggest[3]);
	      request.setAttribute("vo4", vo4);
      
      
      
      
      
      
      
      
     
         return "mbtimain";
         
	}

	
	
	

}