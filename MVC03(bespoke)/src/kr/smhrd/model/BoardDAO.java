package kr.smhrd.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// JDBC(Java+SQL) -> MyBatis(Java<-->SQL) -> Spring JPA(Java<-->SQL(X))

// MVC03 : JDBC -> MyBatis Framework(DB Framework)

public class BoardDAO {
				// Session=Connection , Factory=공장 =>SqlSessionFactory=Connection을 미리 만들어서 여러개를 가지고 있는 객체
	private static SqlSessionFactory sqlSessionFactory;
	
	
	// 초기화 블럭(클래스가 실행되면 무조건 실행되는 메소드) : DB연결
	static {
		try {
			String resource = "kr/smhrd/mybatis/config.xml";
			InputStream inputStream=Resources.getResourceAsStream(resource);
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void boardInsert(BoardVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		session.insert("boardInsert", vo);
		session.commit(); //완료(저장)
		session.close();  //반납(커넥션을 반납해서 재활용하기 위함)
	}
	public  List<BoardVO> boardList(){
		SqlSession session=sqlSessionFactory.openSession();
		List<BoardVO> list=session.selectList("boardList");
		session.close();
		return list;
	}
	public void boardDelete(int idx) {
		SqlSession session=sqlSessionFactory.openSession();
		session.delete("boardDelete", idx);
		session.commit(); 
		session.close();  
	}
	public BoardVO boardContent(int idx) {
		SqlSession session=sqlSessionFactory.openSession();
		BoardVO vo= session.selectOne("boardContent", idx);
		session.close();  
		return vo;
	}
	public void boardUpdate(BoardVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		session.update("boardUpdate", vo);
		session.commit(); 
		session.close();  
	}
	public UserVO isLogin(UserVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		vo=session.selectOne("isLogin",vo);
		session.close();
		return vo;
	}
}










