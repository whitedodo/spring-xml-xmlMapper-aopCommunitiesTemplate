/*
 * 작성일자(Create Date): 2020-10-15
 * 프로젝트명(Project Name): Community Project
 * 저자(Author): Dodo / rabbit.white at daum dot net
 * 파일명(FileName): BoardDAOImpl.java
 * 비고(Description):
 * 
 */

package com.community.website.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.community.website.vo.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{

	@Autowired
	@Qualifier("sqlSession")
    private SqlSession sqlSession; 
    
    private static final String Namespace = "com.community.website.mapper.BoardMapper";
	
	@Override
	public BoardVO selectBoard(@Param("boardname")String boardname, 
								@Param("id")long id) {

		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("boardname", boardname);
		paramMap.put("id", id);
		
		if (sqlSession != null ) {
			System.out.println("참");
		}else {
			System.out.println("거짓");
		}
		
		if (sqlSession.selectOne(Namespace + ".selectBoard", paramMap) != null) {
			System.out.println("참2");
			
			BoardVO test = sqlSession.selectOne(Namespace + ".selectBoard", paramMap);
			System.out.println(test.getName());
			
		}else {
			System.out.println("거짓2");	
		}
		
		return sqlSession.selectOne(Namespace + ".selectBoard", paramMap);
		
	}

	@Override
	public List<BoardVO> selectAll() {
		
		return sqlSession.selectList(Namespace + ".selectAll");
	}

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeBoard(String idx) {
		// TODO Auto-generated method stub
		
	}
	
}
