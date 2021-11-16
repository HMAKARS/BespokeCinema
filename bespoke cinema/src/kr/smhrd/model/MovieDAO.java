package kr.smhrd.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MovieDAO {
	
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
	
	    public  MovieVO movieList(int movie_seq){
		SqlSession session = sqlSessionFactory.openSession();
		MovieVO vo = session.selectOne("movieList", movie_seq);
		session.close();
		return vo;
	}
     	public MovieVO movieList1(int movie_seq) {
		SqlSession session=sqlSessionFactory.openSession();
		MovieVO vo= session.selectOne("movieList1", movie_seq);
		System.out.println(vo);
		session.close();  
		return vo;
	}
	
	    public List<MovieVO> allMovieList(){
		SqlSession session=sqlSessionFactory.openSession();
		List<MovieVO> list = session.selectList("allMovieList");
		session.close();
		return list;
		
	}   public List<MovieVO> findMbti(UserVO vo){
		SqlSession session = sqlSessionFactory.openSession();
		List<MovieVO> list1 = session.selectList("findMbti", vo);
		session.close();
		
		return list1;

	}	public List<MovieVO> selectListOne(){
		SqlSession session = sqlSessionFactory.openSession();
		List<MovieVO> vo1 = session.selectList("findMbti");
		session.close();
		System.out.print(vo1);
		return vo1;
}
}