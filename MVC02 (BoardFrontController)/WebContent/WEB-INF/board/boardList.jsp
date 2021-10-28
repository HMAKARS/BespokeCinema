<%@page import="kr.smhrd.model.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
    // Object Cating(객체형변환-제일중요)
    ArrayList<BoardVO> list=(ArrayList<BoardVO>)request.getAttribute("list");
	String cpath = request.getContextPath(); //m02
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
</head>
<body>

<div class="container">
  <h2>MVC BOARD</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BOARD LIST</div>
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
		   <tr>
		     <td colspan="5">
		       <button type="button" class="btn btn-primary btn-sm" onclick="location.href='<%=cpath%>/boardForm.do'">글쓰기</button>
		     </td>
		   </tr>
		</table>
    </div>
    <div class="panel-footer">인공지능 융합 서비스 개발자과정(김지현)</div>    
  </div>
</div>

</body>
</html>