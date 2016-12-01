package kr.ac.hansung.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller // @component + 컨트롤러 역할
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
	
		return "home"; // view's logical name
	}
	//02:50
	
}
