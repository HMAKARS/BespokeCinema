package kr.smhrd.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;
import kr.smhrd.model.MovieDAO;
import kr.smhrd.model.MovieVO;
import kr.smhrd.model.UserVO;
import kr.smhrd.web.ViewResolver;



public class MbtiMainController2 implements Controller{
	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		MovieVO vo=new MovieVO();
		UserVO vo6=new UserVO();
//		int idx=Integer.parseInt(request.getParameter("idx"));
//		vo6.setIdx(idx);
		//세션값 주기
		String mb_id = request.getParameter("mb_id");
		String mb_pwd = request.getParameter("mb_pwd");
		String mb_mbti=request.getParameter("mb_mbti");
		vo6.setMb_id(mb_id);
		vo6.setMb_pwd(mb_pwd);
		vo6.setMb_mbti(mb_mbti);
		BoardDAO dao = new BoardDAO();
		UserVO succ = dao.isLogin(vo6);
	      System.out.println(succ);
		vo6 = dao.isLogin(vo6);
         System.out.println("userVO"+vo6);
		
        MovieDAO dao1=new MovieDAO();
		System.out.println("mbti"+mb_mbti); 
		
		//MB_MBTI가 NULL값이 출력됨.
		//회원가입에서 받아온 INPUT은 저장이 되고
		//STRING의 파라미터 타입이 아니어도 됨. USERVO에 있으니까
		
			
//		ArrayList<MovieVO> list = (ArrayList<MovieVO>)dao1.allMovieList();
		ArrayList<MovieVO> list1 = (ArrayList<MovieVO>)dao1.findMbti(vo6);
		request.setAttribute("list1", list1);
		System.out.print("mbti영화리스트"+list1);
//		request.setAttribute("list1", list1);
		
		
		  
	    PrintWriter writer = response.getWriter();
	    
	    Random rd = new Random();
		int suggest[] = new int[4];
	      
	      for(int i=0; i<suggest.length; i++) {
	         suggest[i] = rd.nextInt(list1.size())+1;
	         
	         for(int j=0; j<i; j++) {
	            if(suggest[i] == suggest[j]) {
	               i--;
	            }
	         }
	      }
	      MovieVO vo1 =dao1.movieList1(suggest[0]);
	      System.out.println("vo1"+vo1);
	      request.setAttribute("vo1", vo1);
	     
	      MovieVO vo2=dao1.movieList1(suggest[1]);
	      request.setAttribute("vo2", vo2);
	      
	      
	      MovieVO vo3=dao1.movieList1(suggest[2]);
	      request.setAttribute("vo3", vo3);
	      
	      MovieVO vo4=dao1.movieList1(suggest[3]);
	      request.setAttribute("vo4", vo4);

		   
	      
	      HttpSession session=request.getSession();
	         session.setAttribute("vo", succ);
      
      
      
     
	      return "mbtimain";
         
	}

	
	
	

}