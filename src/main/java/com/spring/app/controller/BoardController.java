package com.spring.app.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.app.dao.BoardDao;
import com.spring.app.dto.BoardDto;
import com.spring.app.logger.Log;

/**
 * 자유게시판, 공지사항, 질문/답변, 자주묻는질문, 자료실
 * @author Han
 *
 */

@Controller
public class BoardController {

	@Autowired
	private BoardDao bd;
	
	@RequestMapping(value = "/freeBoardList.do", method = RequestMethod.GET)
	public String qnaBoardList(ModelMap model, BoardDto bdto ,HttpSession session) {
		Log.Debug("BoardController.freeBoardList Start");
		
		List<BoardDto> list = bd.boardList(bdto);
		model.addAttribute("list", list);
		
		Log.Debug("BoardController.freeBoardList End");
		return "board/freeBoardList";
	}
}
