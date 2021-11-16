<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@page import="kr.smhrd.model.UserVO"%>
    <%
    String cpath = request.getContextPath(); // /m02
    /* UserVO user=(UserVO)session.getAttribute("vo"); */
    UserVO vo1 = (UserVO)session.getAttribute("vo1");
    %>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- Theme Made By www.w3schools.com - No Copyright -->
  <title>BESPOKE CINEMA</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script src="https://kit.fontawesome.com/3929e16ef5.js" crossorigin="anonymous"></script>
        <script src="{% static 'network/functions.js' %}"></script>
  <style>
body{
background-color:black;
}



  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }

}


.navbar-brand{
text-align:center;
}
.jumbotron {
  padding-top: 0;
  padding-bottom: 0;
  color: white;
  background-color: black;

}

.wrap{
  width: 30%;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
.search {
  width: 50%;
  position: relative;
  display: flex;
  margin-left: 60%;
}

.searchTerm {
  width: 100%;
  border: 3px solid #e9e9e9;
  border-right: none;
  padding: 5px;
  height: 36px;
  border-radius: 5px 0 0 5px;
  outline: none;
  color: #9DBFAF;
}

.searchTerm:focus{
  color: #e9e9e9;
}

.searchButton {
  width: 40px;
  height: 36px;
  border: 1px solid #e9e9e9;
  background: #e9e9e9;
  text-align: center;
  color: black;
  border-radius: 0 5px 5px 0;
  cursor: pointer;
  font-size: 20px;
}
* {
    margin: 0;
    padding: 0;
    font-family: sans-serif;
}
.wrap1 {
    height: 100%;
    width: 100%;
    background-color: rgb(0, 0, 0);
    background-position: center;
    background-size: cover;
    position: absolute;

}
.form-wrap {
    /* background-image:url(https://cdn.pixabay.com/photo/2016/12/07/18/39/pattern-1890182_960_720.jpg); */
    width: 600px;
    height: 780px;
    position: absolute;
    margin: 2% auto;
    background: rgb(47, 47, 47);
    
    padding: 10px;
    overflow: hidden;
    top: 0%;
    left: 33%;
    
}
.button-wrap {
    width: 230px;
    margin: 35px auto;
    position: relative;
    box-shadow: 0 0 600px 9px #fcae8f;
    border-radius: 30px;
}


.input-group {
    top: 120px;
    margin-left: 19%;
    position: absolute;
    width: 280px;
    transition: .5s;
    border-style: soild;
}
.input-field {
    width: 100%;
    padding: 10px 0;
    margin: 5px 0;
    border: none;
    border-bottom: 1px solid rgb(255, 255, 255);
    outline: none;
    background: transparent;
}
.submit {
    width: 85%;
    padding: 10px 30px;
    cursor: pointer;
    display: block;
    margin: auto;
    background: linear-gradient(to right, #888888, #888888);
    border: 0;
    outline: none;
    border-radius: 30px;
    font-weight: bolder;
    position: relative;
    margin-top: 10%;
   

}
.checkbox {
    margin: 30px 10px 30px 0;
}
span {
    color: #777;
    font-size: 12px;
    bottom: 68px;
    position: absolute;
}
#login {
    left: 50px;
}
#register {
    left: 450px;
}
.MBTI{
    font-size: 20px;
    color: black;
    bottom: 119px;
    left: 50%;
    font-weight: bolder;
}
#mbtilist{
  color: black;
  
  
}

  </style>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" >BESPOKE CINEMA</a>
    </div>
    <div class="wrap">
       <div>
          
        </div>
     </div>
     <ul class="nav navbar-nav navbar-right">
     <li><a href="<%=cpath%>/memberForm.do">회원가입</a></li>
     
    </ul>
    </div>
</nav>
<div class="wrap1">
    <div class="form-wrap">
    
        <form id="login" action="<%=cpath%>/login.do" method="post"  class="input-group">
            <h1 style="font-weight: bold; text-align: center; color: white;">로그인</h1>
            <br>
            <input type="id" name="id" id="id" class="input-field" placeholder="아이디" required style="color: white;" >
            <input type="password" id="pwd" name="pwd" class="input-field" placeholder="비밀번호" required style="color: white;" >
            <br>
            <br>
            
            <button class="submit" >로그인</button>
            
        </form>
          
    </div>
      
</div>



</body>
</html> 