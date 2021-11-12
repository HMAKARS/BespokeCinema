package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserDAO;
import kr.smhrd.model.UserVO;

public class LoginController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");

		
		
		UserVO vo=new UserVO();
		vo.setMb_id(id);
		vo.setMb_pwd(pwd);
		
		// UserDAO -> BoardDAO
		UserDAO dao=new UserDAO();
		UserVO succ=dao.isLogin(vo);
		if(succ!=null) { // 로그인 성공 -> 로그인 성공했다는 표시를 메모리(세션)에 해두어야 한다.
			HttpSession session=request.getSession();
			session.setAttribute("succ", succ);
		}
		
		
		
		return "redirect:/boardList.do";
	}
	
	
}
