package kr.smhrd.model;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;


public class MemberDAO {
	
	
	
	
	static {
		try {
			String resource = "kr/smhrd/mybatis/config.xml";
			InputStream inputStream=Resources.getResourceAsStream(resource);
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public int insertjoin(MemberVO dto) {
		int result;
		result = sqlsession.insert("insertjoin",dto);
		
		return result;
	}
//	public UserVO isLogin(UserVO vo) {
//		SqlSession session=sqlSessionFactory.openSession();
//		vo=session.selectOne("isLogin",vo);
//		session.close();
//		return vo;
//	}

}