/*
 * 작성일자(Create Date): 2020-10-15
 * 프로젝트명(Project Name): Community Project
 * 저자(Author): Dodo / rabbit.white at daum dot net
 * 파일명(FileName): BoardService.java
 * 비고(Description):
 * 
 */

package com.community.website.service;

import java.util.List;

import com.community.website.vo.BoardVO;

public interface BoardService {

	public BoardVO select(String boardname, long id);
	public List<BoardVO> selectAll();
	
}
