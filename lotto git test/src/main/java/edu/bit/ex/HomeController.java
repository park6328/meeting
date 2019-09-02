package edu.bit.ex;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public String root() {
		return "home"; // return 이 뷰의 이름를 찾는 거니 중요!!!!!!
	}
	
	@RequestMapping("form/score")
	public String score_p() {
		System.out.println("score 호출");
		return "form/score"; // return 이 뷰의 이름를 찾는 거니 중요!!!!!!
	}

	@RequestMapping("form/score_result")
	public String score_pd() { 
		System.out.println("score_result 호출");
		return "form/score_result";
			
}
}