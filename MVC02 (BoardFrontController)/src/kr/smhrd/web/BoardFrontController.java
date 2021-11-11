package kr.smhrd.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.smhrd.controller.BoardContentController;
import kr.smhrd.controller.BoardDeleteController;
import kr.smhrd.controller.BoardFormController;
import kr.smhrd.controller.BoardInsertController;
import kr.smhrd.controller.BoardListController;
import kr.smhrd.controller.BoardUpdateController;
import kr.smhrd.controller.Controller;
import kr.smhrd.model.BoardDAO;
import kr.smhrd.model.BoardVO;


@SuppressWarnings("serial")
@WebServlet("*.do")
public class BoardFrontController extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 6개의 요청을 모두 받아서 처리하는 프론트 컨트롤러.
		//(FrontController)
		//1개로 편하나 Controller가 무거워짐. 여섯가지의 일을 자기가 혼자하기 때문에.
		//if문자체가 무거워짐. >> 개선시키려면 controller를 controller들의 코드자체를 없애버려야함. 
		
		//인코딩
		request.setCharacterEncoding("utf-8");
		
		
		//boardList.do,boardForm.do,boardInsert.do,boardDelete.do,boardUpdate.do,boardContent.do
		//클라이언트에게서 온 요청이 자기가 할수있는 6개의 .do중 어느것인지 판별해야한다.
		//req객체를 이용하면 요청 url이 들어오게 된다. 
		//req에선 뒤의 querystring을 읽을 수 있다. board들의 역할을 If-else문을 이용해 구분해야한다.
		
		//1.클라이언트의 요청을 확인
		String reqURL = request.getRequestURI();
		//System.out.println(reqURL); //확인
		
		//2.context path 가져오기
		String cpath=request.getContextPath();
		//System.out.println(cpath);	//확인
		
		//3.판별된 command 가져오기	
		String command = reqURL.substring(cpath.length());
		//System.out.println(command);	//확인
		//전체 경로에서 context path만큼의 글자수를 빼 뒤의 .do를 가져온다.
		
		//4.if-else문으로 command에 따라 해야하는 일들의 분기점 만들기
		
		
		//4-1.변수는 바깥으로 빼서 전역변수로 지정해 코드 간소화 시키기
		Controller controller = null;
		String view = null;
		//4-2.Handler Mapping : 요청이 어떤 룰으로 컨트롤러에게 보내는지(매핑하는지), 그 방법을 정해주는 클래스
		//Spring에선 핸들러 매핑을 Dispatcher Servlet이라 함.
		
		//방법 A ) Handler Mapping 클래스 연결 >> 유지보수에 용이 	
		//객체생성한 후 command를 get controller method에 key로 넘겨주면 
		//해당하는 컨트롤러를 return해주고 프론트 컨트롤러에서 해당하는 컨트롤러를 시키면 됨.
		 
		HandlerMapping mapping = new HandlerMapping();
		controller=mapping.getConroller(command);
		view=controller.requestHandler(request, response);
		
		
		//방법 B ) if-else문 이용 ~2021/10/27까지 핸들러 매핑
//		if(command.equals("/boardList.do")) {
//			//다른 패키지에 있는 controller를 활용하기 위해 객체를 생성함. 
//			controller = new BoardListController();
//			view = controller.requestHandler(request, response);	
//			//매개변수를 넘겨줘서 boardlistcontroller에서 pojo가 기존에 하던 일을 대신하게 하는 것.
//		
//		}else if(command.equals("/boardForm.do")){
//			//다른 패키지에 있는 controller를 활용하기 위해 객체를 생성함. 
//			controller = new BoardFormController();
//			view = controller.requestHandler(request, response);
//			//글쓰기화면(JSP)으로 forward시켜 boardFormController의 역할을 해야함.
//		
//		}else if(command.equals("/boardInsert.do")){
//			//parameter수집부터 클라이언트 수집까지 과정이 많기 때문에 위 두 과정처럼 복붙하면 효율이 떨어짐
//			controller = new BoardInsertController();
//			view = controller.requestHandler(request, response);
//			request.setCharacterEncoding("utf-8"); //post방식
//		
//		}else if(command.equals("/boardContent.do")){
//			//idx에 해당하는 객체를 가지고 와서 객체 바인딩하는 BoardContentController
//			controller = new BoardContentController();
//			view = controller.requestHandler(request, response);
//		
//		}else if(command.equals("/boardDelete.do")){
//			controller = new BoardDeleteController();
//			view = controller.requestHandler(request, response);
//			
//		}else if(command.equals("/boardUpdate.do")){
//			//인코딩
//			//request.setCharacterEncoding("utf-8"); //utf-8 -> post방식
//			controller = new BoardUpdateController();
//			view = controller.requestHandler(request, response);
//		}
//		
		//4-3.분기작업후 데이터 전송은 한번에 하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//형태 분류 : 1. /WEB-INF/board/boardList.jsp
		//		   2. redirect:/boardList.do
		//4-4. 형태에 따라 view값의 유무에 따라 분기점 지정
		if(view!=null) {
			if(view.indexOf("redirect:")!=-1) { 
				//indexOf의 역할 : 뒤에 오는 글자가 있는지 없는지 찾는다. 글자가 없으면 -1을 넘겨준다.
				//리턴값에 redirect가 들어가서 sendRedirect를 해야하는 경우
				
				response.sendRedirect(cpath+view.split(":")[1]);
				//cpath : view를 split으로 나눈것의 [0]번째 
				//view로 나온 경로를 :을 기준으로 잘라서 [0]번째가 아닌 [1]번째에 있는 /boardList.do를 가져온다.
			}else {
				//리턴값에 redirect가 없어서 forwarding을 해야하는 경우			
			RequestDispatcher rd=request.getRequestDispatcher(ViewResolver.makeViewUrl(view)); 
			//<< view에는 논리적인 이름이 오게 될거임.ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡViewResolver = view의 실제 논리적인 이름을 꺼내주는 클래스
			
			rd.forward(request, response);
			//View(JSP)	
			//"/WEB-INF/board/boardContent.jsp"
			//물리적인경로------/view의논리적인이름/jsp
			//접두사(prefix)--/------------/접미사(suffix)
			
			}
		}
	}

	
}
