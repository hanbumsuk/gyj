package com.spring.app.dao;

import java.util.List;

import com.spring.app.dto.BoardDto;

public interface BoardDao {
	
	List<BoardDto> boardList(BoardDto dto);
	
}
