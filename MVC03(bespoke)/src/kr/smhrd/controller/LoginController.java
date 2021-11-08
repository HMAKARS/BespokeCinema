package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserVO;

public class LoginController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		UserVO vo=new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		// UserDAO -> BoardDAO
		BoardDAO dao=new BoardDAO();
		UserVO succ=dao.isLogin(vo);
		if(succ!=null) { // 로그인 성공 -> 로그인 성공했다는 표시를 메모리(세션)에 해두어야 한다.
			HttpSession session=request.getSession();
			session.setAttribute("succ", succ);
		}
		
		
		
		return "redirect:/boardList.do";
	}
	
	
}
