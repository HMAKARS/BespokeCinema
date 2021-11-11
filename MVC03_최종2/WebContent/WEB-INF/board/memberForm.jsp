<%@page import="kr.smhrd.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
     String cpath=request.getContextPath(); // /m02
     UserVO user=(UserVO)session.getAttribute("succ");

%>    
<!DOCTYPE html>
<html lang="en">
<head>
  <title>memberForm</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<script type="text/javascript">
	function done(){
		alert(회원가입 완료!);
	}
	
	function del(){
		alert(모든 데이터를 삭제합니다.);
	}
</script>



</head>
<body>
 
<div class="container">
  <h2>MVC BOARD</h2>
  <div class="panel panel-default">
    <div class="panel-heading">회원가입하기</div>
    <div class="panel-body">
      <form class="form-horizontal" action="<%=cpath%>/memberInsert.do" method="post">
		 <div class="form-group">
		    <label class="control-label col-sm-2" for="title">아이디:</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="id"  placeholder="아이디">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="title">닉네임:</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="name"  placeholder="닉네임">
		    </div>
		  </div>
		  <div class="form-group">
		  
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="contents">비밀번호:</label>
		    <div class="col-sm-10">
		      <input type="password" class="form-control" name="pwd"  placeholder="비밀번호">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="contents">이메일:</label>
		    <div class="col-sm-10">
		      <input type="email" class="form-control" name="email"  placeholder="이메일">
		    </div>
		  </div>
		  
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="contents">어드민 여부:</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="admin"  placeholder="Y/N">
		    </div>
		  </div>
		  
		  
		  <div class="form-group">
		    <label class="control-label col-sm-2" for="contents">mbti:</label>
		    <div class="col-sm-10">
		      <input type="text" class="form-control" name="mbti"  placeholder="MBTI">
		    </div>
		  </div>
		  
		  <div class="col-sm-offset-2 col-sm-10">
		      <button type="submit" class="btn btn-primary btn-sm" onclick="done()">등록</button>
		      <button type="reset" class="btn btn-warning btn-sm" onclick="del()">취소</button>
		    </div>
		  </div>
		  
      </form>
    </div>
    <div class="panel-footer">회원가입하기   
    <button type="button" class="btn btn-success btn-sm" onclick="location.href='<%=cpath%>/boardList.do'">리스트</button> 
  	</div>
  </div>
</div>

</body>
</html>