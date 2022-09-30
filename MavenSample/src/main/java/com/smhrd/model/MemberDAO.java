package com.smhrd.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class MemberDAO {
	
	SqlSessionFactory sqlSessionFactory=SqlSessionManager.getSqlSession();//정적 메서드여서 객체 생성 없이 바로 사용 가능
	//SqlSessionManager import할 때 우리가 만든 클래스로!
	
	
	//회원가입
	public int join(Member vo) {//Member.java에서 만든 정보를 joinCon.java로 넘겨서 받아 놓은 객체를 가져온다
		//Factory를 활용해서 세션 열기 
		//openSession(): 우리가 만든 세션 열기
		//세션을 너무 많이 열어두면 오류가 나니까 사용하고 나서는 바로 닫아주기 위해 메서드 안에 넣어줌!
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		//db에 값 삽입(insert("insert문을 찾아가는 경로 적어주기(mapper namespace의 이름과 insert의 id값을 적어주면 됨)",메서드에서 받아 주고 있는 매개변수))
		//성공한 경우 1, 실패한 경우 0을 반환함(그래서 int형으로 받아주는 거임~)
		//("메퍼 찾아가기(com.smhrd.database.MemberMapper).메서 안에서 뭘 실행할건지 id값 적어주기(insert),내가 넘겨줘야 하는 파라미터 적어주기(vo)
		int cnt=sqlSession.insert("com.smhrd.database.MemberMapper.insert",vo);		
		
		//mybatis는 자동 커밋을 안 해줌
		//성공한 경우 1, 실패한 경우 0
		if(cnt>0) {
			sqlSession.commit();//성공하면 저장
		}else {
			sqlSession.rollback();//실패하면 롤백
		}
		
		//세션 닫기
		sqlSession.close();
		
		//joinCon에서 제대로 삽입됐는지 확인할 수 있도록 return 
		return cnt;
	}
	
	//로그인
	public Member login(Member vo) {
		//세션 생성
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		//찾아가야 하는 mapper namespace와 select id 쓰기
		//경로 쓴 다음엔 파라미터에 들어가는 실제 타입 적어주기 => vo!
		//메퍼에서 멤버타입으로 반환하기 때문에 멤버타입으로 값을 받아줘야 함!
		Member loginM=sqlSession.selectOne("com.smhrd.database.MemberMapper.selectOne", vo);
		
		//select는 커밋하거나 롤백하지 않아도 되니까 바로 세션 닫아도 됨!
		//세션 닫아주기
		sqlSession.close();
		
		return loginM;
		
	}
	
	//개인정보수정
	public int update(Member vo) {
		//세션 생성
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		//수정할 부분 불러오기
		//update: 반환타입 int(수정완료 = 1, 수정실패 = 0)
		int cnt=sqlSession.update("com.smhrd.database.MemberMapper.update", vo);
		
		//mybatis는 자동 커밋을 안 해줌
				//성공한 경우 1, 실패한 경우 0
		if(cnt>0) {
			sqlSession.commit();//성공하면 저장
		}else {
			sqlSession.rollback();//실패하면 롤백
		}
		
		//세션 닫기
		sqlSession.close();
		
		//UpdateCon에서 제대로 삽입됐는지 확인할 수 있도록 return 
		return cnt;
	}
	
	//탈퇴
	public int delete(String id) {//아이디만 있어도 삭제할 수 있으니까 Member 안 불러도 됨
		SqlSession sqlSession=sqlSessionFactory.openSession();
		
		int cnt=sqlSession.delete("com.smhrd.database.MemberMapper.delete",id);
		
		if(cnt>0) {
			sqlSession.commit();//성공하면 저장
		}else {
			sqlSession.rollback();//실패하면 롤백
		}
		
		sqlSession.close();
		
		return cnt;
	}
	
}
