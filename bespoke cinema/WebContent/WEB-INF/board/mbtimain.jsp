<%@page import="kr.smhrd.model.MovieVO"%>
<%@page import="kr.smhrd.model.ReviewVO"%>
<%@page import="kr.smhrd.model.UserVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
      <%
    String cpath = request.getContextPath(); // /m02
    UserVO user=(UserVO)session.getAttribute("vo");
    MovieVO vo1 =(MovieVO)request.getAttribute("vo1");
    MovieVO vo2 =(MovieVO)request.getAttribute("vo2");
    MovieVO vo3 =(MovieVO)request.getAttribute("vo3");
    MovieVO vo4 =(MovieVO)request.getAttribute("vo4");
    /* MovieVO list1 =(MovieVO)request.getAttribute("list1"); */
    
    ArrayList<MovieVO> list1=(ArrayList<MovieVO>)request.getAttribute("list1");
    
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
 
  .container-fluid {
    padding-top: 10px;
    padding-bottom: 10px;
  }
    
  .carousel-inner img {
      width: 100%; /*Set width to 100% */
      min-height:200px;
  }

  /* Hide the carousel text when the screen is less than 600 pixels wide */
  @media (max-width: 600px) {
    .carousel-caption {
      display: none; 
    }
    
  }
  .col-sm-4{
    width: 25%;
  }
  .thumbnail {
  padding: 0 0 0 0;
  border: none;
  border-radius: 0;
  background-color: black;
  position: relative;
  right: 15%;
  

  
}

.thumbnail img {
  /* width: 50%; */
  height: 20%;
  width: 50%;
  border-radius: 15%;
  margin-left: 25%;
  margin-bottom: 10px;
  position: relative;
  
}

.jumbotron {
  padding-top: 2%;
  padding-bottom: 3%;
  color: white;
  background-color: black;

}
.myButton {
	box-shadow:inset 0px 1px 0px 0px #ffffff;
	background:linear-gradient(to bottom, #f9f9f9 5%, #e9e9e9 100%);
	background-color:#f9f9f9;
	border-radius:6px;
	border:1px solid #dcdcdc;
	display:inline-block;
	cursor:pointer;
	color :black;
	font-family:Arial;
	font-size:15px;
	font-weight:bold;
	padding:6px 40px;
	text-decoration:none;
	text-shadow:0px 1px 0px #ffffff;
  
}
.myButton:hover {
	background:linear-gradient(to bottom, #e9e9e9 5%, #f9f9f9 100%);
	background-color: #e9e9e9 5%;
}
.myButton:active {
	position:relative;
	top:1px;
}
.h_container{
    background-color: black;
    color: white;
    border-radius : 10px;
    box-shadow: 0 2px 8px rgba(0,0,0,.1);
    display: inline-block;
    margin-right: 10px;
}
#heart{
    font-size: 30px;
    margin-top: 10px;
}
#heart:active{
  color: red;
  transform: translateY(4px);
}
/* #heart:visited{
  color: red;
} */


i.selected{
  color: red;
}
.myButton1 {
	box-shadow:inset 0px 1px 0px 0px black;
	background:linear-gradient(to bottom, black 5%, black 100%);
	background-color:black;
	border-radius:  42px;
	border:1px solid black;
	display:inline-block;
	cursor:pointer;
	color:#ffffff;
	font-family:Verdana;
	font-size:15px;
	font-weight:bold;
	padding:9px 11px;
	text-decoration:none;
	text-shadow:0px 1px 0px black;
  margin-right: 43%;
  
}
.myButton1:hover {
	background:linear-gradient(to bottom,black 5%, black 100%);
	background-color:black;
}
.myButton1:active {
	position:relative;
	top:1px;
}
@import url(https://fonts.googleapis.com/css?family=Open+Sans);



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
  left: 55%;
  transform: translate(-50%, -50%);
  
}



  </style>
</head>
<body>
<%-- <a><input type="hidden" name="mbti" value="<%=vo.getMb_mbti()%>"></a> --%>
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
       <li><a href="<%=cpath%>/movieContent.do?idx=<%=user.getIdx()%>">내정보</a></li>
       <li><a href="<%=cpath%>/logout.do">로그아웃</a><li>
      </ul>
     
    </div>
  </div>
</nav>
<div class="jumbotron text-center">
    <h1>YOUR MBTI</h1>
    <h2><%=user.getMb_mbti()%></h2>
    
  </div>
   
  
<div class="container-fluid text-center bg-grey">
    
    <div class="row text-center">
      <div class="col-sm-4">
        <div class="thumbnail" style="position: relative; left: 5%;">
          <a href="#" class="myButton1">1</a>
          <img src="<%=list1.get(0).getMovie_pos()%>" alt="Paris">
          <p style="color: white; font-size: 20px;"><strong><%=list1.get(0).getMovie_title()%></strong></p>
          <div class="h_container">
            <i id="heart" class="far fa-heart"></i>
          </div>
              <a href="<%=cpath%>/reviewList.do?movie_seq=<%=list1.get(0).getMovie_seq()%>" class="myButton">상세보기</a>
            </div>
        </div> 
     
      <div class="row text-center">
      <div class="col-sm-4">
        <div class="thumbnail" style="position: relative; left: 5%;">
          <a href="#" class="myButton1">2</a>
          <img src="<%=list1.get(1).getMovie_pos()%>" alt="Paris">
          <p style="color: white; font-size: 20px;"><strong><%=list1.get(1).getMovie_title()%></strong></p>
          <div class="h_container">
            <i id="heart" class="far fa-heart"></i>
          </div>
              <a href="<%=cpath%>/reviewList.do?movie_seq=<%=list1.get(1).getMovie_seq()%>" class="myButton">상세보기</a>
            </div>
        </div>
            <div class="row text-center">
      <div class="col-sm-4">
        <div class="thumbnail" style="position: relative; left: 5%;">
          <a href="#" class="myButton1">3</a>
          <img src="<%=list1.get(2).getMovie_pos()%>" alt="Paris">
          <p style="color: white; font-size: 20px;"><strong><%=list1.get(2).getMovie_title()%></strong></p>
          <div class="h_container">
            <i id="heart" class="far fa-heart"></i>
          </div>
              <a href="<%=cpath%>/reviewList.do?movie_seq=<%=list1.get(2).getMovie_seq()%>" class="myButton">상세보기</a>
            </div>
                </div> 
               <div class="row text-center">
      <div class="col-sm-4">
        <div class="thumbnail" style="position: relative; left: 5%; bottom: 8%;">
          <a href="#" class="myButton1">4</a>
          <img src="<%=list1.get(3).getMovie_pos()%>" alt="Paris">
          <p style="color: white; font-size: 20px;"><strong><%=list1.get(3).getMovie_title()%></strong></p>
          <div class="h_container">
            <i id="heart" class="far fa-heart"></i>
          </div>
              <a href="<%=cpath%>/reviewList.do?movie_seq=<%=list1.get(3).getMovie_seq()%>" class="myButton">상세보기</a>
            </div>
        </div>
      </div>
  </div>
  </div>
   
  
  <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
   <hr>
                <span style="color: white;">Bespoke cinema</span>
                <script>
					$('i').on('click', function(){
 					 $('i').removeClass('selected');
 					 $(this).addClass('selected');
	

						});
</script>




</body>
 
</html>