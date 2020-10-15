/*
 * 작성일자(Create Date): 2020-10-15
 * 프로젝트명(Project Name): Community Project
 * 저자(Author): Dodo / rabbit.white at daum dot net
 * 파일명(FileName): BoardDAO.java
 * 비고(Description):
 * 
 */

package com.community.website.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.community.website.vo.*;

public interface BoardDAO {

	// 게시판 상세 조회
	public BoardVO selectBoard(@Param("boardname")String boardname, 
							   @Param("id")long id);
	
	// 회원 조회 list
	public List<BoardVO> selectAll();
	
	// 회원 추가 insert
	public void insertBoard(BoardVO vo);
	
	// 수정 update
	public void updateBoard(BoardVO vo);
	
	// 삭제 delete
	public void removeBoard(@Param("id") String id);
	
}
