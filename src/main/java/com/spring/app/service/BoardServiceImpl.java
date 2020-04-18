package com.spring.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.app.dao.BoardDao;
import com.spring.app.dto.BoardDto;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDao bdao;
	
	/**
	 * 게시판 목록
	 */
	@Override
	public List<BoardDto> boardList(BoardDto dto) {
		return bdao.boardList(dto);
	}
}
