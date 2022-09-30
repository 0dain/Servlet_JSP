package com.smhrd.database;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

//myBatis 설정파일(mybatis-config.xml) 내용을 읽어서 db 커넥션 후 세션 반환
//SqlSessionFactoryBuilder: config 파일을 바탕으로 SessionFactory 생성
//SqlSessionFactory: Session생성
//SqlSession: sql 실행, 트랜잭션 관리
//데이터베이스랑 연결하고 닫아주고 하는 역할을 함
public class SqlSessionManager {
	
	public static SqlSessionFactory sqlSession;
	static {
		String resource = "com/smhrd/database/mybatis-config.xml";
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			sqlSession = new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//생성된 factory를 반환해주는 메서드
	public static SqlSessionFactory getSqlSession() {
		return sqlSession;
	}

}
