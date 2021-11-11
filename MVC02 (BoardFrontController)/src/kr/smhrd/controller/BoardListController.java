package kr.smhrd.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;


//POJO
public class BoardListController implements Controller{
	public String requestHandler(HttpServletRequest request, HttpServletResponse response) 
		//기존 ListController 서블릿에서 받은 서비스메소드가 사라진 대신에 매개변수로서의 기능만 가져옴. 
			throws ServletException, IOException {
		BoardDAO dao = new BoardDAO(); //DB연동
		ArrayList<BoardVO> list = dao.boardList();
		request.setAttribute("list", list); //IMPORTANT
		//boardDAO불러오고 불러온 데이터(=게시판 리스트)를 arraylist의 list에 넣어버림
		//경로는 string의 형태이다. 경로를 굳이 서블릿으로 경로를 만드는것이 아닌 하청업체 pojo한테 다음페이지(forwarding할 url)을 받아서
		//넘겨주고 view의 경로를 만들어서 문자열로 리턴하게 지정해주면 아주 ㅆㅅㅌㅊ의 pojo가 되는것이다.
		//여기서 잠깐, 리턴타입 지정(여기서는 String) 필수!
		return "boardList";
		
		//처음에 들어올때 재료를 req, res매개변수를 받고 들어와서 DB연동과 
		//ArrayList삽입한 후 String view는 나중에 결과값을 보내줄 경로로 리턴을 해주는것.
	}
}
