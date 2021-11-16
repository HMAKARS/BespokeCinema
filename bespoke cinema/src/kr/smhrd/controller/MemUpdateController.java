package kr.smhrd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.UserVO;

public class MemUpdateController implements Controller{

	@Override
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		BoardDAO dao = new BoardDAO();
		
		
		String pwd = request.getParameter("pwd");
		String mbti = request.getParameter("mbti");
		int idx=Integer.parseInt(request.getParameter("idx"));
        
		
		UserVO vo = new UserVO();
		
		vo.setMb_pwd(pwd);
		vo.setMb_mbti(mbti);
		vo.setIdx(idx);
		int cnt = dao.memberUpdate(vo);
		
		String nextPage = null;
		String cpath = request.getContextPath();
		System.out.println(vo);
		if(cnt > 0) { //占쎄쉐�⑨옙 -> 筌뤴뫖以됵옙�몵嚥∽옙 : 占쎄퐣�뇡遺얄뵺 占쎌뒄筌ｏ옙(memberList.do)
			nextPage = "redirect:/moviembti.do";
		} else { //占쎈뼄占쎈솭
			throw new ServletException("error");
		}
		return nextPage;
	}

}
