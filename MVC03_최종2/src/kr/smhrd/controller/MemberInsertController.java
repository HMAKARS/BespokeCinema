package kr.smhrd.controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserDAO;
import kr.smhrd.model.UserVO;

public class MemberInsertController implements Controller {

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mbti=request.getParameter("mbti");
		
		String admin=request.getParameter("admin");
		
		//date형식으로 받는게 아니라 입력받은것을 알아서 날짜를 int타입으로 001004 이런식으로 변경을 해줘야한다
		//그리고 getParameter로 가져올때 무조건 string으로 가져오니까 parseInt로 형변환을 해준다
		
		
		
		//jsp에 password name pwd로 변경하기, username name name으로 변경
		//mbti랑 email 받는거 input생겨야함
		
		
		//DAO 객체생성
		UserDAO dao = new UserDAO();
		
		UserVO vo = new UserVO();
		vo.setMb_id(id);
		vo.setMb_email(email);
		vo.setMb_name(name);
		vo.setMb_pwd(pwd);
		vo.setMb_mbti(mbti);
	
		vo.setAdmin_yn(admin);
		
	
		int cnt = dao.memberInsert(vo);
	
		String nextPage = null;
		String cpath = request.getContextPath();
		if(cnt>0) {
			nextPage = "redirect:"+"/boardList.do";
		} else {
			throw new ServletException("error");
		}
		return nextPage;
	}

}
