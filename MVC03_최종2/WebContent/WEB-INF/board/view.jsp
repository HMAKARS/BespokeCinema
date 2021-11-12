<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
     <%
    String cpath = request.getContextPath(); // /m02
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
  left: 50%;
  transform: translate(-50%, -50%);
}
/* ---------------------상위--------------------------- */
.img-1{
      width:55%;
      height: 50%;
      padding-left:150px;
      position:static;
      left: 80%;
      border-color: black;
      object-fit: cover;
      
      

  }
  img.static { 
        position: static;
      }
  
  
      .poster{
    padding-left:270px;
    font-size: 18px;
  }
 
  ol{
    border-right:1px solid gray;
    width: 1000px;
  }
 #grid{
   display: grid;
   color: white;
   position: absolute;
   bottom: 200px;
   left: 800px;
 }
 #story{
   width: 650px;
   position: absolute;
   left: 800px;
   color: white;
   font-size: 20px;
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
          
         
          
       
      </div>
   </div>
      <ul class="nav navbar-nav navbar-right">
       
        <li><a href="<%=cpath%>/moviemypage.do">내정보</a></li>
      <li><a href="<%=cpath%>/moviemycal.do">캘린더</a></li>
      </ul>
    </div>
  
</nav>
<div class="container-fluid bg-1"></div>
 <div class="img-1">
   <img src="https://file.mk.co.kr/meet/neds/2021/09/image_readtop_2021_931772_16329893494800394.jpg" class="img-1" alt="포스터">
</div>
 
 <!-- 유튜브 링크 -->
 <div>
  <iframe width="650" height="400" src="https://www.youtube.com/embed/BdkSkI61aGo?rel=0&amp;autoplay=1&mute=1&amp;loop=1;playlist=BdkSkI61aGo" 
  frameborder="8" style="position:absolute; left:800px; top:100px; "></iframe>
  </div>
  
  <hr>

<!-- import -->


<!-- 포스터 와 감독, 영화배우 -->
  <table>
    <tr>
      <td class="poster">
        
        <h3 style=" font-size:35px; color: white;">이터널스</h3>
        
        <p style="   color: white;">감독 : <span><!-- =vo.movie_pos() %> --> 아무나</span></p>
        <p style="   color: white;">배우 : <span>안젤리나졸리, 마동석, 리차드매든</span></p>
        <p style="   color: white;">상영시간 : <span>155분</span></p>
        <p style="   color: white;">장르: <span>액션,드라마,판타지</span></p>
        <p style="   color: white;">개봉일자<span>2021.11.03</span></p>
      
      </td>
      <td id="story">
          <h2>줄거리</h2>
            <p>마블 스튜디오의  <이터널스> 는 수 천년에 걸쳐 그 모습을 드러내지 않고 살아온 불멸의 히어로들이  <어벤져스_엔드게임>
             이후 인류의 가장 오래된 적 '데비안츠'에 맞서기 위해 다시 힘을 합치면서 벌어지는 이야기</p>
        </td>
    </tr>
  </table>
 
  <hr>

  <table>
    <tr>
      <td class="poster">
        
        <h3 style=" font-size:35px; color: white;">영화리뷰</h3>
        <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ81HpW7PCNKisRMTsmPQJDPyrFcKqOMUU63tqO6GHIfkTZAWo7XpXjdXScONVEjuYZz60&usqp=CAU" alt="" style="width: 50px; height: 50px;">
        <p style="color: white;">이 영화는 약 ~~%의 사용자들이 긍정이라고 평가했습니다</p>
      </td>
      <td id="story">
          
            <p>리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1</p>
            <p>리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1</p>
            <p>리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1</p>
            <p>리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1</p>
            <p>리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1</p>
            <p>리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1 리뷰1</p>

        </td>
    </tr>
  </table> 



</div>



</body>
</html>