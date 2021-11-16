<%@page import="kr.smhrd.model.UserVO"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@page import="kr.smhrd.model.ReviewVO"%>  
<%@page import="kr.smhrd.model.MovieVO"%> 
<%@page import="java.util.ArrayList"%> 
<%String cpath = request.getContextPath();%>

<%
    // Object Cating(객체형변환-제일중요)
    ArrayList<ReviewVO> r_list=(ArrayList<ReviewVO>)request.getAttribute("list");

    UserVO vo1=(UserVO)session.getAttribute("vo");
	MovieVO m_list=(MovieVO)request.getAttribute("list2");
	//m_list == m_seq
    
    
    // 세션값을 읽어오는 방법
    ReviewVO user=(ReviewVO)session.getAttribute("succ");
    
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
  
  #y_n{
    
  	position : absolute;
  	left:270px;
  	
  }
  
  
  #minfo{
  	height:290px;
 	width:760px;
    position : relative;
    
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
 	height:290px;
 	width:650px;
    position : absolute;
    left:800px;
    bottom : -10px;
    font-size: 18px;
    color: white
   
 }
 
 #review{
   width: 650px;
   position: absolute;
   display : inline-block;
  
   left: 800px;
   color: white;
   font-size: 20px;
 }
 button{
 background-color : black;
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
        <li><a href="<%=cpath%>/movieContent.do?idx=<%=vo1.getIdx()%>">내정보</a></li>
        <li><a href="<%=cpath%>/logout.do">로그아웃</a><li>
      <li><a href="<%=cpath%>/moviemycal.do">캘린더</a></li>
      </ul>
    </div>
  
</nav>
<div class="container-fluid bg-1"></div>
 <div class="img-1">
   <img src="<%=m_list.getMovie_pos()%>" class="img-1" alt="포스터">
</div>
 
 <!-- 유튜브 링크 -->
 <div>
  <iframe width="650" height="400" src="https://www.youtube.com/embed/<%=m_list.getMovie_pre()%>" 
  frameborder="8" style="position:absolute; left:800px; top:100px; "></iframe>
  </div>
  
  <hr>

<!-- import -->


<!-- 포스터 와 감독, 영화배우 -->

    <div id="minfo">
        
        <h3 style=" font-size:35px; color: white;"><%=m_list.getMovie_title() %></h3>
        <!-- list.get(0).getReview_seq()%> /// m_list.get(51).getMovie_direct()%> -->
        <p style="   color: white;">감독 : <span><%=m_list.getMovie_direct() %></span></p>
        <p style="   color: white;">배우 : <span><%=m_list.getMovie_actor() %></span></p>
        <p style="   color: white;">MBTI : <span><%=m_list.getMovie_MBTI() %></span></p>
        <p style="   color: white;">장르: <span><%=m_list.getGenre_name() %></span></p>
        <p style="   color: white;">개봉일자<span><%=m_list.getOpen_date() %></span></p>
      
    </div>
    
    <div id="story">
          <h2>줄거리</h2>
            <p><%=m_list.getMovie_story() %></p>
    </div>
    
  <hr>
  
     <div id="y_n">
        
        <h3 style=" font-size:35px; color: white;">영화</h3>
        
        
       
        <% int cnt=0; %> <!-- 긍정 -->
        <% int cnt2=0; %> <!-- 부정 -->
        <% for(ReviewVO vo : r_list ){  %>
        <% if(vo.getLabel()==1){ %>
        	<% cnt+=1; %>
        	
        <% }else{%>
        	<% cnt2+=1; %>
        	
        <% }%>
        <% }%>
        <% double cnt3 = cnt*1.96; %>
        <% double cnt4 = cnt2*1.96; %>
        <% System.out.print(cnt3); %>
        <h4 style="color: white;">이 영화는 약 <%=cnt3%>%의 사용자들이 긍정이라고 평가했습니다</h4>
        <h4 style="color: white;">이 영화는 약 <%=cnt4%>%의 사용자들이 부정이라고 평가했습니다</h4>
        
        <% if(cnt3>=cnt4){ %>
		
		<img alt="긍정" src="https://w7.pngwing.com/pngs/1003/955/png-transparent-smiley-emoticon-wink-computer-icons-smiley-miscellaneous-face-smiley.png" style="width: 50px; height: 50px;">
            <% }else{ %>
            <img alt="부정" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQT1aeNMJTxv0c9GBhinzSnW9RfFatI4DocLvjzi1Z5vtWVVewg0Ut8LucvhGyDLWjyA2I&usqp=CAU" style="width: 50px; height: 50px;">
            <%   }  %>
	
		
        
        
     </div>
      
 
     
			<div id="review">
   <div class="wrap1">
    <div class="form-wrap">
    <%for(ReviewVO vo : r_list){ %>
        <form id="update" action="<%=cpath%>/reviewUpdate.do?movie_seq=<%=vo.getMovie_seq()%>" class="input-group" mehtod="post">
        <input type="hidden" name="movie_seq" value="<%=vo.getMovie_seq()%>">
        <%} %>
        <input type="hidden" name="review_seq">
             <p><p class="input-field" style="color: gray; font-size: 15px; font-weight:lighter; "> 평점 : <span class="MBT">
            </span><select name="score" id="star_scroe" style="height:100%;">
            &nbsp&nbsp&nbsp
              <option value="10">10</option>
              <option value="9">9</option>
              <option value="8">8</option>
              <option value="7">7</option>
              <option value="6">6</option>
              <option value="5">5</option>
              <option value="4">4</option>
              <option value="3">3</option>
              <option value="2">2</option>
              <option value="1">1</option>
          </select></p>
            <tr>
            <td>리뷰 작성하기</td>
            <td><textarea class="form-control" rows="3" style="width : 100%" name="review"></textarea></td>
          </tr>
            
           &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp
            <button class="submit" sytle="color:black;" onclick="alert('리뷰 등록 완료!');">리뷰 작성</button>
            
            <br>
            <br>
        </form>
          
    </div>
</div>
			<%for(ReviewVO vo : r_list){ %>
          	<hr>
          	<p>평점 :<%= vo.getStar_score()%></p>
            <p>No.<%= vo.getReview_seq()%> : <%= vo.getDocument()%></p>
            <% if(vo.getLabel()==1){ %> 
            
            <img alt="긍정" src="https://w7.pngwing.com/pngs/581/80/png-transparent-computer-icons-cursor-positive-hand-silhouette-black.png" style="width: 50px; height: 50px;">
            <% }else{ %>
            <img alt="부정" src="https://w7.pngwing.com/pngs/894/176/png-transparent-thumb-signal-computer-icons-down-miscellaneous-text-thumb-signal-thumbnail.png" style="width: 50px; height: 50px;">
            <%   }  %>
            <%   }  %>
           
        </div>




</body>
</html>