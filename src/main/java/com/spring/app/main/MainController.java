package com.spring.app.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 메인 화면
 * @author Han
 *
 */

@Controller
public class MainController {

	@RequestMapping(value="/main.do", method = RequestMethod.GET)
	public String main() { return "main/main"; }
	
}
