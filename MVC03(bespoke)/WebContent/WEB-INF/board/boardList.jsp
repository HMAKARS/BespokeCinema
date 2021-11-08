<%@page import="kr.smhrd.model.UserVO"%>
<%@page import="kr.smhrd.model.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
    // Object Cating(객체형변환-제일중요)
    ArrayList<BoardVO> list=(ArrayList<BoardVO>)request.getAttribute("list");
    String cpath=request.getContextPath(); // /m02
    
    // 세션값을 읽어오는 방법
    UserVO user=(UserVO)session.getAttribute("succ");
    
%>
<!DOCTYPE html>
<html>
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
  	function outFn(){
  		location.href="<%=cpath%>/logout.do"
  	}
  </script>
</head>
<body>

<div class="container">
  <h2>MVC BOARD</h2>
  <div class="panel panel-default">
    <div class="panel-heading">
	<% if(user==null){ %>
	<form class="form-inline" action="<%=cpath%>/login.do" method="post">
  <div class="form-group">
    <label for="id">ID:</label>
    <input type="text" class="form-control" id="id" name="id">
  </div>
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="password" class="form-control" id="password" name="password">
  </div>
  <button type="submit" class="btn btn-default">로그인</button>
</form>
		<% }else{ %>
			<%=user.getUsername()%>님 방문을 환영합니다.
			<button type="submit" class="btn btn-default" onclick="outFn()">로그아웃</button>
		<% } %>
	</div>
    <div class="panel-body">
		 <table class="table table-hover table-bordered">
		   <tr>
		     <td>번호</td>
		     <td>제목</td>  
		     <td>작성자</td>
		     <td>작성일</td>
		     <td>조회수</td>
		   </tr>
		   <% for(BoardVO vo : list){  %>
		   <tr>
		     <td><%=vo.getIdx()%></td>
		     <td><a href="<%=cpath%>/boardContent.do?idx=<%=vo.getIdx()%>"><%=vo.getTitle()%></a></td>
		     <td><%=vo.getWriter()%></td>
		     <td><%=vo.getIndate()%></td>
		     <td><%=vo.getCount()%></td>
		   </tr>   
		   <%   }  %>
		   <% if(user!=null){ %>
		   <tr>
		     <td colspan="5">
		       <button type="button" class="btn btn-primary btn-sm" onclick="location.href='<%=cpath%>/boardForm.do'">글쓰기</button>
		     </td>
		   </tr>
		   <%} %>
		</table>
    </div>
    <div class="panel-footer">인공지능 융합 서비스 개발자과정(최선주)</div>    
  </div>
</div>

</body>
</html>