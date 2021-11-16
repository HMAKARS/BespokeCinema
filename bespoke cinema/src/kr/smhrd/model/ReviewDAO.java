package kr.smhrd.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ReviewDAO {
	
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
	
//	public void reviewInsert(ReviewVO vo) {
//		SqlSession session=sqlSessionFactory.openSession();
//		session.insert("reviewInsert", vo);
//		session.commit(); //완료(저장)
//		session.close();  //반납(커넥션을 반납해서 재활용하기 위함)
//	}
	
	public  List<ReviewVO> reviewList(MovieVO vo){
		SqlSession session=sqlSessionFactory.openSession();
		List<ReviewVO> list=session.selectList("reviewList", vo);
		session.close();
		return list;
	}
	
//	public void reviewDelete(int review_seq) {
//		SqlSession session=sqlSessionFactory.openSession();
//		session.delete("reviewDelete", review_seq); 
//		session.commit(); 
//		session.close();  
//	}
//	public ReviewVO reviewContent(int review_seq) {
//		SqlSession session=sqlSessionFactory.openSession();
//		ReviewVO vo= session.selectOne("reviewContent", review_seq);
//		session.close();  
//		return vo;
	
	public void reviewInsert(ReviewVO vo) {
	SqlSession session=sqlSessionFactory.openSession();
		session.insert("reviewInsert", vo);
		session.commit(); 
		System.out.println(vo);
		session.close();  
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


		
	}
	
	
	
	
