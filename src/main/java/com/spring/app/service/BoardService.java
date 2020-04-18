package com.spring.app.service;

import java.util.List;

import com.spring.app.dto.BoardDto;

public interface BoardService {
	/**
	 * 게시판 목록
	 * @param dto
	 * @return
	 */
	List<BoardDto> boardList(BoardDto dto);

}
