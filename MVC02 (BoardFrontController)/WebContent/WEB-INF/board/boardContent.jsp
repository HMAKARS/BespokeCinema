<%@page import="kr.smhrd.model.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
    BoardVO vo = (BoardVO)request.getAttribute("vo");
	String cpath = request.getContextPath(); //m02
%>   
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
     function delFn(idx) {
		// 삭제페이지로 이동?
		location.href=<%=cpath%>+"boardDelete.do?idx="+idx;		
	 }
  </script>
</head>
<body> 
<div class="container">
  <h2>MVC BOARD</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BOARD CONTENT</div>
    <div class="panel-body">
       <form action="<%=cpath%>/boardUpdate.do" method="post">
       <input type="hidden" name="idx" value="<%=vo.getIdx()%>">
       <table class="table table-bordered">
          <tr>
            <td>제목</td>
            <td><input class="form-control" type="text" name="title" value="<%=vo.getTitle()%>"></td>
          </tr>
          <tr>
            <td>내용</td>
            <td><textarea class="form-control" rows="7" name="contents"><%=vo.getContents()%></textarea></td>
          </tr>
          <tr>
            <td>작성자</td>
            <td><%=vo.getWriter()%></td>
          </tr>
          <tr>
            <td>작성일</td>
            <td><%=vo.getIndate().split(" ")[0]%></td>
          </tr>
          <tr>
            <td colspan="2" align="center">
               <button type="submit" class="btn btn-primary btn-sm">수정</button>
               <button type="reset" class="btn btn-warning btn-sm">취소</button>
               <button type="button" class="btn btn-info btn-sm" onclick="delFn(<%=vo.getIdx()%>)">삭제</button>
               <button type="button" class="btn btn-success btn-sm" onclick="location.href='<%=cpath%>/boardList.do'">리스트</button>
            </td>
          </tr>
       </table>
       </form>
    </div>
    <div class="panel-footer">인공지능 융합 서비스 개발자과정(김지현)</div>    
  </div>
</div>

</body>
</html>