package com.codebeacon;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
	
	String welcometext = "";
	
	@GetMapping("/useragent")
	public String useragent(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		String userAgent = request.getHeader("User-Agent"); System.out.println("USER-AGENT = "+ userAgent);
		
		//상태코드 강제 설정 
		response.setStatus(500);
		
		//응답헤더 - 윈도우설정 
//		userAgent = "Windows";
//		response.setHeader(userAgent, userAgent);
		String os_name = "";
		if(userAgent.indexOf("Mac") > -1 ) { 
			System.out.println("User-Agent : 맥북 이용자시네요");
			os_name = "Mac";
			welcometext = "맥북을 쓰시다니 고수시군요!";
		}else if(userAgent.indexOf("Windows") > -1 ) { 
			System.out.println("User-Agent : 윈도우 이용자시네요");
			os_name = "Windows";
			welcometext = "맥북 쓰세요.";

		 }
		
		model.addAttribute("data",userAgent);
		model.addAttribute("os_name", os_name);
		model.addAttribute("welcometext", welcometext);
		return "useragent";
	}

}
