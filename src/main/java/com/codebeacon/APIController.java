package com.codebeacon;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//API 확인용 = RestController 로 생성
@RestController
@RequestMapping("/api/http/*")
public class APIController {
	
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
//	@RequestMapping(value = "/options", method = RequestMethod.OPTIONS)
//	public String OptionsMethod(HttpServletRequest request, HttpServletResponse response) {
//
//		String options = request.getMethod();
//
//
//		return options;
//	}

	@GetMapping("/appmenulist")
	public List<AppMenuDept> getappMenuList(Model model) {

		// List 만들기
		List<AppMenuDept> appMenuList = new ArrayList<AppMenuDept>();

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


		// 1 DEPT : 스마트 오더
//
		AppMenuDept appMenuDept1 = new AppMenuDept();

		appMenuDept1.setSeq         ("2");
		appMenuDept1.setCd          ("M0002");
		appMenuDept1.setCd_nm       ("");
		appMenuDept1.setDspType ("T");
		appMenuDept1.setMenuId      ("");
		appMenuDept1.setMenuNm      ("");
		appMenuDept1.setMenuSubNm   ("");
		appMenuDept1.setMenuCd      ("01");
		appMenuDept1.setUrl         ("");
		appMenuDept1.setReturnUrl   ("");
		appMenuDept1.setContent_id  ("");
		appMenuDept1.setImg_url     ("");
		appMenuDept1.setDispYn      ("");
		appMenuDept1.setService     ("");
		appMenuDept1.setNewYn       ("");
		appMenuDept1.setMenuConnCd  ("");
		appMenuDept1.setMenuNmColor ("");
		appMenuDept1.setMenuDept    ("");

		appMenuList.add(appMenuDept1);

		System.out.println("1= "+appMenuList.get(0).getCd());
		System.out.println("2= "+appMenuList.get(1).getCd());
		System.out.println("2-1= "+appMenuList.get(1).toString());

//		model.addAttribute("appMenuList",appMenuList);

		return appMenuList;
	}
}




