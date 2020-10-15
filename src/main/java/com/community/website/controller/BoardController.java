/*
 * 작성일자(Create Date): 2020-10-15
 * 프로젝트명(Project Name): Community Project
 * 저자(Author): Dodo / rabbit.white at daum dot net
 * 파일명(FileName): BoardController.java
 * 비고(Description):
 * 
 */

package com.community.website.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.community.website.service.BoardService;
import com.community.website.vo.BoardVO;

@Controller
@RequestMapping(value = "/board")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	@Qualifier("boardService")
    private BoardService boardService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		logger.info("Welcome Board! The client locale is {}.", locale);
		
		BoardVO vo = boardService.select("sample", 1);
		
		if ( vo != null) {
			// System.out.println("메모:" + vo.getMemo() );
		}else {
			// System.out.println("메모:none" );
		}
		
		return "home";
	}
	
}
