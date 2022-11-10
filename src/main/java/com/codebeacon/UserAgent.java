package com.codebeacon;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//API 확인용 = RestController 로 생성
@RestController
@RequestMapping("/api/http/*")
public class UserAgent {
	
	@GetMapping("/useragent")
	public String getuserAgent(HttpServletRequest request, HttpServletResponse response) {
		
		String userAgent = request.getHeader("User-Agent");
		System.out.println("USER-AGENT = "+ userAgent);
		response.setStatus(300);
//		String os_name = "Mac";
		if(userAgent.indexOf("Mac") > -1 ) System.out.println("User-Agent : 맥북 이용자시네요");
		else if(userAgent.indexOf("Windows") > -1 ) System.out.println("User-Agent : 윈도우 이용자시네요");

		return userAgent;
	}

}




