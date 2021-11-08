<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
<script type="text/javascript">
 
function checkfield(){
 document.addjoin.submit();
 
}
</script>
</head>
<body>
<center>
<h1> 회원가입</h1>
 
 
<form action="addjoinaction" name="addjoin" method="post">
<table style="text-align: left" width="400px">
<tr>
<td>아이디</td><td ><input type="text" name="id" id="id" >
<div id="ckid"></div>
 
<tr>
<td>비밀번호</td><td ><input type="password" name="pw" id="pw">
 
<tr>
<td>비밀번호확인</td><td><input type="password" name="pw2" id = "pw2" >
 
<tr>
<td>이름</td><td><input type="text" name="name">
 

 
 
<tr>
<td>이메일</td><td><input type="text" name="email" id ="email" onkeyup="checkemail()">
 
<tr>
<td>생년월일</td><td><select name="year">
<%for(int i=2014; i>1949; i--){ %>
<option value="<%=i%>"><%=i %>년</option>
<%} %>
 
 
 
 
</select>
 
<select name="month">
<%for(int i=1; i<13; i++){ %>
<option value="<%=i%>"><%=i %>월</option>
<%} %>
</select>
 
<select name="day">
 
<%for(int i=1; i<31; i++){ %>
<option value="<%=i%>"><%=i %>일</option>
<%} %>
</select>
</td></tr>
</table>
 
 
<br>
<table width="400px">
<tr><td style="text-align: center">
<input type="button" value="가입" onclick="checkfield()">
<input type="reset" value="취소">
</td>
</tr>
</table>
 
</form>
 
 
</div>
</center>
</body>
</html>