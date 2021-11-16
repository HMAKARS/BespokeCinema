<%@page import="kr.smhrd.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%
    String cpath = request.getContextPath(); // /m02
    UserVO vo=(UserVO)session.getAttribute("vo");
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
        background-color: black;
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
.wrap{
  width: 30%;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
    #ca{
        
        width: 800px;
        height: 800px;
        /* position:absolute;
        top: 100px;
        left: 100px; */
        margin-top: 50px;
        margin-left: 550px;
        
    }
    #cale{
        border: solid;
        border-width: 10px;
        border-color: rgb(47, 47, 47);
    }
</style>   
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
            <li><a href="<%=cpath%>/moviemain.do">main</a></li>
     		 <li><a href="<%=cpath%>/movieContent.do?idx=<%=vo.getIdx()%>">³»Á¤º¸</a></li>
      		
            </ul>
          </div>
        </div>
      </nav>
   
        <div id="ca">
            <iframe src="http://naver.me/58HLKV0p" width="800" height="800" frameborder="0" id="cale"></iframe>
        </div>
          
   
    
</body>
</html>