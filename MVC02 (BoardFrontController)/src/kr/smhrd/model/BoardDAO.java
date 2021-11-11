package kr.smhrd.model;
// JDBC(Java+SQL) -> MyBatis(Java<-->SQL) -> Spring JPA(Java<-->SQL(X))
import java.sql.*;
import java.util.ArrayList;
public class BoardDAO { // DAO(Data Access Object)
   private Connection conn;
   private PreparedStatement ps;
   private ResultSet rs;
   // 연결메서드 -> mysql용 접속 Driver(?)
   public Connection getConnect() {  
	    String url="jdbc:mysql://localhost:3306/ai"; // 프로토콜+서브프로토콜
	    String user="root";
	    String password="12345";
	    try {
		   Class.forName("com.mysql.jdbc.Driver"); //  ClassNotFoundException
		   conn=DriverManager.getConnection(url, user, password); //SQLException		   
	    } catch (Exception e) {
		 e.printStackTrace();
	    }
	    return conn;
   } 
   // 게시물등록 메서드 만들기(정의)
   public int boardInsert(BoardVO vo) {
	   conn=getConnect(); //연결                                                                   ?(파라메터)                     
	   String SQL="insert into board(title,contents,writer) values(?,?,?)";
	   // SQL문장을 전송하는 객체를 생성(예외처리)
	   int cnt=-1;
	   try {
		   ps=conn.prepareStatement(SQL);
		   ps.setString(1, vo.getTitle());
		   ps.setString(2, vo.getContents());
		   ps.setString(3, vo.getWriter());
		   cnt=ps.executeUpdate(); //SQL전달(실행)
	   } catch (Exception e) {
		 e.printStackTrace();
	   }	
	   return cnt; // 0, 1
   }
   // 게시판 전체리스트를 가져오는 메서드(제일중요)
   public ArrayList<BoardVO> boardList() {
	   conn=getConnect();
	   String SQL="select * from board order by idx desc";
	   ArrayList<BoardVO> list=new ArrayList<BoardVO>();	   
	   try {
		  ps=conn.prepareStatement(SQL);
		  rs=ps.executeQuery();
		  while(rs.next()) {
			  int idx=rs.getInt("idx");
			  String title=rs.getString("title");
			  String contents=rs.getString("contents");
			  String writer=rs.getString("writer");
			  String indate=rs.getString("indate");
			  int count=rs.getInt("count");	
			  // 묶고(VO)->담고(ArrayList)
			  BoardVO vo=new BoardVO();
			  vo.setIdx(idx);
			  vo.setTitle(title);
			  vo.setContents(contents);
			  vo.setWriter(writer);
			  vo.setIndate(indate);
			  vo.setCount(count);
			  list.add(vo);			  
		  }
	   } catch (Exception e) {
		  e.printStackTrace();
	   }	
	   return list;
   }
   public void boardDelete(int idx) {
	   conn=getConnect();
	   String SQL="delete from board where idx=?";
	   try {
		 ps=conn.prepareStatement(SQL);
		 ps.setInt(1, idx);
		 ps.executeUpdate();
	   } catch (Exception e) {
		  e.printStackTrace();
	   }	   
   }
   public BoardVO boardContent(int idx){
	   conn=getConnect();
	   String SQL="select * from board where idx=?";
	   BoardVO vo=null;
	   try {
		  ps=conn.prepareStatement(SQL);
		  ps.setInt(1, idx);
		  rs=ps.executeQuery();// rs->커서->이동(next())
		  if(rs.next()) {
			  idx=rs.getInt("idx");
			  String title=rs.getString("title");
			  String contents=rs.getString("contents");
			  String writer=rs.getString("writer");
			  String indate=rs.getString("indate");
			  int count=rs.getInt("count");	
			  // 묶고(VO)->담고(ArrayList)
			  vo=new BoardVO();
			  vo.setIdx(idx);
			  vo.setTitle(title);
			  vo.setContents(contents);
			  vo.setWriter(writer);
			  vo.setIndate(indate);
			  vo.setCount(count);
		  }		   
	    } catch (Exception e) {
		  e.printStackTrace(); 
  	   }
	   return vo;
   }
   public void boardUpdate(BoardVO vo) {
	   conn=getConnect();
	   String SQL="update board set title=?, contents=? where idx=?";
	   try {
		  ps=conn.prepareStatement(SQL);
		  ps.setString(1, vo.getTitle());
		  ps.setString(2, vo.getContents());
		  ps.setInt(3, vo.getIdx());
		  ps.executeUpdate();
	   } catch (Exception e) {
		 e.printStackTrace();
	  }	   
   }
}










