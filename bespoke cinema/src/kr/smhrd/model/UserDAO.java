package kr.smhrd.model;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class UserDAO {
	
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

	public UserVO isLogin(UserVO vo) {
		SqlSession session=sqlSessionFactory.openSession();
		vo=session.selectOne("isLogin",vo);
		session.close();
		return vo;
	}
	public int memberInsert(UserVO vo) {
	        SqlSession session = sqlSessionFactory.openSession();
	        int cnt = session.insert("memberInsert", vo);
	        session.commit();
	        session.close();
	        return cnt;
	 }
	
	
}
