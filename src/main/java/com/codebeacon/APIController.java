package com.codebeacon;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

//API 확인용 = RestController 로 생성
@RestController
@RequestMapping("/api/http/*")
public class APIController {

	@GetMapping("/useragent")
	public List<String> getuserAgent(HttpServletRequest request, HttpServletResponse response) {

		String userAgent = request.getHeader("User-Agent");
		System.out.println("USER-AGENT = "+ userAgent);
		response.setStatus(300);

		List<String> result = new ArrayList<>();
		String compareOS = "";

		result.add(userAgent);

		if(userAgent.indexOf("Mac") > -1 ) {
			System.out.println("User-Agent : 맥북 이용자시네요");
			compareOS = "맥북 이용자시네요";
		}else if(userAgent.indexOf("Windows") > -1 ) {
			System.out.println("User-Agent : 윈도우 이용자시네요");
			compareOS = "윈도우 이용자시네요";
		}

		result.add(compareOS);

		return result;
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

		appMenuDept.setSeq         (1);
		appMenuDept.setCd          ("M0001");
		appMenuDept.setCdNm    ("쿠폰");
		appMenuDept.setDspType ("T");
		appMenuDept.setMenuId      ("CP0001");
		appMenuDept.setMenuNm      ("쿠폰");
		appMenuDept.setMenuSubNm   ("");
		appMenuDept.setMenuCd      ("01");
		appMenuDept.setUrl         ("");
		appMenuDept.setReturnUrl   ("");
		appMenuDept.setContentId  ("BOS0120");
		appMenuDept.setImgUrl     ("");
		appMenuDept.setDisp_yn      ("");
		appMenuDept.setService     ("");
		appMenuDept.setNew_yn       ("");
		appMenuDept.setMenu_conn_cd  ("");
		appMenuDept.setMenu_nm_color ("");
		appMenuDept.setMenuDept    ("1");

		appMenuList.add(appMenuDept);


		// 1 DEPT : 스마트 오더
//
		AppMenuDept appMenuDept1 = new AppMenuDept();

		appMenuDept1.setSeq         (2);
		appMenuDept1.setCd          ("M0002");
		appMenuDept1.setCdNm       ("");
		appMenuDept1.setDspType ("T");
		appMenuDept1.setMenuId      ("");
		appMenuDept1.setMenuNm      ("");
		appMenuDept1.setMenuSubNm   ("");
		appMenuDept1.setMenuCd      ("01");
		appMenuDept1.setUrl         ("");
		appMenuDept1.setReturnUrl   ("");
		appMenuDept1.setContentId  ("");
		appMenuDept1.setImgUrl     ("");
		appMenuDept1.setDisp_yn      ("");
		appMenuDept1.setService     ("");
		appMenuDept1.setNew_yn       ("");
		appMenuDept1.setMenu_conn_cd  ("");
		appMenuDept1.setMenu_nm_color ("");
		appMenuDept1.setMenuDept    ("");

		appMenuList.add(appMenuDept1);

		System.out.println("1= "+appMenuList.get(0).getCd());
		System.out.println("2= "+appMenuList.get(1).getCd());
		System.out.println("2-1= "+appMenuList.get(1).toString());

//		model.addAttribute("appMenuList",appMenuList);

		return appMenuList;
	}


	@PostMapping("/appmenulist")
	public List<AppMenuDept> postappMenuList(Model model) {

		// List 만들기
		List<AppMenuDept> appMenuList = new ArrayList<AppMenuDept>();

		// ========================= 1 DEPT 시작 ======================================

		// 1 DEPT : 쿠폰
		AppMenuDept appMenuDept = new AppMenuDept();

		appMenuDept.setSeq         (1);
		appMenuDept.setCd          ("M0001");
		appMenuDept.setCdNm    ("쿠폰");
		appMenuDept.setDspType ("T");
		appMenuDept.setMenuId      ("CP0001");
		appMenuDept.setMenuNm      ("쿠폰");
		appMenuDept.setMenuSubNm   ("");
		appMenuDept.setMenuCd      ("01");
		appMenuDept.setUrl         ("");
		appMenuDept.setReturnUrl   ("");
		appMenuDept.setContentId  ("BOS0120");
		appMenuDept.setImgUrl     ("");
		appMenuDept.setDisp_yn      ("");
		appMenuDept.setService     ("");
		appMenuDept.setNew_yn       ("");
		appMenuDept.setMenu_conn_cd  ("");
		appMenuDept.setMenu_nm_color ("");
		appMenuDept.setMenuDept    ("1");

		appMenuList.add(appMenuDept);


		// 1 DEPT : 스마트 오더
//
		AppMenuDept appMenuDept1 = new AppMenuDept();

		appMenuDept1.setSeq         (2);
		appMenuDept1.setCd          ("M0002");
		appMenuDept1.setCdNm       ("");
		appMenuDept1.setDspType ("T");
		appMenuDept1.setMenuId      ("");
		appMenuDept1.setMenuNm      ("");
		appMenuDept1.setMenuSubNm   ("");
		appMenuDept1.setMenuCd      ("01");
		appMenuDept1.setUrl         ("");
		appMenuDept1.setReturnUrl   ("");
		appMenuDept1.setContentId  ("");
		appMenuDept1.setImgUrl     ("");
		appMenuDept1.setDisp_yn      ("");
		appMenuDept1.setService     ("");
		appMenuDept1.setNew_yn       ("");
		appMenuDept1.setMenu_conn_cd  ("");
		appMenuDept1.setMenu_nm_color ("");
		appMenuDept1.setMenuDept    ("");

		appMenuList.add(appMenuDept1);

		System.out.println("1= "+appMenuList.get(0).getCd());
		System.out.println("2= "+appMenuList.get(1).getCd());
		System.out.println("2-1= "+appMenuList.get(1).toString());

//		model.addAttribute("appMenuList",appMenuList);

		return appMenuList;
	}

}




