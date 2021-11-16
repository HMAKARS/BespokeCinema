<%@page import="kr.smhrd.model.UserVO"%>

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%
    String cpath = request.getContextPath(); // /m02
    UserVO vo=(UserVO)request.getAttribute("vo");
    UserVO vo1=(UserVO)session.getAttribute("vo");
    System.out.print(vo.getIdx());
    System.out.print(vo.getMb_mbti());
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
    width: 600px;
    height: 780px;
    position: absolute;
    margin: 2% auto;
    background: rgb(47, 47, 47);
    padding: 5px;
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
    top: 100px;
    margin-left: 19%;
    position: absolute;
    width: 280px;
    transition: .5s;
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
      <a class="navbar-brand" href="<%=cpath%>/moviemain.do">BESPOKE CINEMA</a>
    </div>
    <div class="wrap">
        <div class="search">
           
          </button>
        </div>
     </div>
     <ul class="nav navbar-nav navbar-right">
      <li><a href="<%=cpath%>/moviemain.do">Main</a></li>
      <li><a href="<%=cpath%>/moviemycal.do">캘린더</a></li>
      <li><a href="<%=cpath%>/logout.do">로그아웃</a><li>
    </ul>
    </div>
</nav>
<div class="wrap1">
    <div class="form-wrap">
			
			
        <form id="login" action="<%=cpath%>/movieUpdate.do"" class="input-group" mehtod="post">
            <h1 style="font-weight: bold; text-align: center; color: white;">마이 페이지</h1>
            <br>
            <input type="hidden" name="idx" value="<%=vo.getIdx()%>">
            <td><input  name="id"  id=id" type="id" class="input-field" style="color: gray" value="<%=vo.getMb_id()%>" required style="color: white;" ></td>
            <td><input  name="pwd" id="password1" type="password" class="input-field"   placeholder="변경하실 비밀번호를 입력해주세요" required style="color: white;"></td>
            <td><input id="password2" name="pwd2" type="password" class="input-field" placeholder="비밀번호를 한번 더 입력하세요"  required style="color: white;"></td>
            <td><input class="input-field" style="color: gray"  value="당신의  MBTI는 <%=vo.getMb_mbti()%>입니다." required style="color: white;" ></td>
            <p class="input-field" style="color: gray; font-size: 15px; font-weight:lighter; "> MBTI 수정 : <span class="MBT">
            </span>
             &nbsp
              &nbsp
               &nbsp
            <select name="mbti" id="mbtilist" style="height:100%;">
              <option value="INTJ">INTJ</option>
              <option value="INTP">INTP</option>
              <option value="ENTJ">ENTJ</option>
              <option value="ENTP">ENTP</option>
              <option value="INFJ">INFJ</option>
              <option value="INFP">INFP</option>
              <option value="ENFJ">ENFJ</option>
              <option value="ENFP">ENFP</option>
              <option value="ISTJ">ISTJ</option>
              <option value="ISFJ">ISFJ</option>
              <option value="ESTJ">ESTJ</option>
              <option value="ESFJ">ESFJ</option>
              <option value="ISTP">ISTP</option>
              <option value="ISFP">ISFP</option>
              <option value="ESTP">ESTP</option>
              <option value="ESFP">ESFP</option>
          </select></p>
            
           
            <button class="submit" onclick="test()">수정완료</button>
            
            <br>
            <br>
        </form>
         
    </div>
</div>
 <script type="text/javascript">
    function test() {
      var p1 = document.getElementById('password1').value;
      var p2 = document.getElementById('password2').value;
      if( p1 != p2 ) {
        alert("비밀번호가 일치 하지 않습니다");
        return false;
        
      } else{
        alert("비밀번호가 일치합니다");
        return true;
      }

    }
  </script>

</body>
</html> 