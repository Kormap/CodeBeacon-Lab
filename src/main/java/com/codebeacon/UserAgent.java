package com.codebeacon;

import java.io.DataOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

		// List 만들기
		List<AppMenuDept> appMenuList = new ArrayList<>();

		// ========================= 1 DEPT 시작 ======================================

		// 1 DEPT : 쿠폰
		AppMenuDept appMenuDept = new AppMenuDept();

		appMenuDept.setSeq         ("1");
		appMenuDept.setCd          ("M0001");
		appMenuDept.setCd_nm       ("쿠폰");
		appMenuDept.setDspType ("T");
		appMenuDept.setMenuId      ("CP0001");
		appMenuDept.setMenuNm      ("쿠폰");
		appMenuDept.setMenuSubNm   ("");
		appMenuDept.setMenuCd      ("01");
		appMenuDept.setUrl         ("");
		appMenuDept.setReturnUrl   ("");
		appMenuDept.setContent_id  ("BOS0120");
		appMenuDept.setImg_url     ("");
		appMenuDept.setDispYn      ("");
		appMenuDept.setService     ("");
		appMenuDept.setNewYn       ("");
		appMenuDept.setMenuConnCd  ("");
		appMenuDept.setMenuNmColor ("");
		appMenuDept.setMenuDept    ("1");

		appMenuList.add(appMenuDept);
		System.out.println("1="+appMenuList.get(0).getCd());

		// 1 DEPT : 스마트 오더
//
		appMenuDept.setSeq         ("2");
		appMenuDept.setCd          ("M0002");
		appMenuDept.setCd_nm       ("");
		appMenuDept.setDspType ("T");
		appMenuDept.setMenuId      ("");
		appMenuDept.setMenuNm      ("쿠폰");
		appMenuDept.setMenuSubNm   ("");
		appMenuDept.setMenuCd      ("01");
		appMenuDept.setUrl         ("");
		appMenuDept.setReturnUrl   ("");
		appMenuDept.setContent_id  ("");
		appMenuDept.setImg_url     ("");
		appMenuDept.setDispYn      ("");
		appMenuDept.setService     ("");
		appMenuDept.setNewYn       ("");
		appMenuDept.setMenuConnCd  ("");
		appMenuDept.setMenuNmColor ("");
		appMenuDept.setMenuDept    ("");



		appMenuList.add(appMenuDept);
		System.out.println("2="+appMenuList.get(1).getCd());


		return userAgent;
	}

}




