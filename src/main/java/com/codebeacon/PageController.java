package com.codebeacon;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {
	
	String welcometext = "";
	
	@GetMapping("/useragent")
	public String useragent(Model model, HttpServletRequest request, HttpServletResponse response) {
		
		String userAgent = request.getHeader("User-Agent"); System.out.println("USER-AGENT = "+ userAgent);
		
		//상태코드 강제 설정 
		response.setStatus(302);
		
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

	/*
	@GetMapping("/appmenulist")
	public String getappMenuList(Model model) {

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
		appMenuDept1.setContentId  ("");
		appMenuDept1.setImgUrl     ("");
		appMenuDept1.setDisp_yn      ("");
		appMenuDept1.setService     ("");
		appMenuDept1.setNew_yn       ("");
		appMenuDept1.setMenu_conn_cd  ("");
		appMenuDept1.setMenu_nm_color ("");
		appMenuDept1.setMenuDept    ("");

		appMenuList.add(appMenuDept1);

		System.out.println("1="+appMenuList.get(0).getCd());
		System.out.println("2="+appMenuList.get(1).getCd());


		model.addAttribute("appMenuList",appMenuList);


		return "appmenulist";
	}
*/  // APPMENU_LIST 테스트
	@GetMapping("/appmenulist")
	public ModelAndView getappMenuList(Model model) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/appmenulist");
		// List 만들기
		List<AppMenuDept> appMenuList = new ArrayList<AppMenuDept>();

		// 1 DEPT : 쿠폰
		AppMenuDept appMenuDept = new AppMenuDept();

		appMenuDept.setSeq         (1);
		appMenuDept.setCd          ("M0001");
		appMenuDept.setCdNm        ("쿠폰");
		appMenuDept.setDspType     ("T");
		appMenuDept.setMenuNm      ("쿠폰");
		appMenuDept.setMenuSubNm   ("");
		appMenuDept.setUrl         ("");
		appMenuDept.setMenu_conn_cd("");
		appMenuDept.setMenuDept    ("1");

		appMenuList.add(appMenuDept);


		// 1 DEPT : 스마트오더
		AppMenuDept appMenuDept1 = new AppMenuDept();

		appMenuDept1.setSeq         (2);
		appMenuDept1.setCd          ("M0002");
		appMenuDept1.setCdNm        ("스마트오더");
		appMenuDept1.setDspType     ("T");
		appMenuDept1.setMenuNm      ("스마트오더");
		appMenuDept1.setMenuSubNm   ("");
		appMenuDept1.setUrl         ("/wallet/lngSmartOrder/main/inapplink:login_compulsion_open:req_get:app_bottom_bar:");
		appMenuDept1.setMenu_conn_cd("");
		appMenuDept1.setMenuDept    ("1");

		appMenuList.add(appMenuDept1);


		// 1 DEPT : 전자영수증
		AppMenuDept appMenuDept2 = new AppMenuDept();

		appMenuDept2.setSeq         (3);
		appMenuDept2.setCd          ("M0003");
		appMenuDept2.setCdNm        ("전자영수증");
		appMenuDept2.setDspType     ("T");
		appMenuDept2.setMenuNm      ("전자영수증");
		appMenuDept2.setMenuSubNm   ("");
		appMenuDept2.setUrl         ("");
		appMenuDept2.setMenu_conn_cd("");
		appMenuDept2.setMenuDept    ("1");

		appMenuList.add(appMenuDept2);


		// 1 DEPT : 주차
		AppMenuDept appMenuDept3 = new AppMenuDept();

		appMenuDept3.setSeq         (4);
		appMenuDept3.setCd          ("M0004");
		appMenuDept3.setCdNm        ("주차");
		appMenuDept3.setDspType     ("T");
		appMenuDept3.setMenuNm      ("주차");
		appMenuDept3.setMenuSubNm   ("");
		appMenuDept3.setUrl         ("");
		appMenuDept3.setMenu_conn_cd("");
		appMenuDept3.setMenuDept    ("1");

		appMenuList.add(appMenuDept3);


		// 1 DEPT : 신세계 아카데미
		AppMenuDept appMenuDept4 = new AppMenuDept();

		appMenuDept4.setSeq         (5);
		appMenuDept4.setCd          ("M0005");
		appMenuDept4.setCdNm        ("신세계 아카데미");
		appMenuDept4.setDspType     ("T");
		appMenuDept4.setMenuNm      ("신세계 아카데미");
		appMenuDept4.setMenuSubNm   ("");
		appMenuDept4.setUrl         ("/images/menu/icon_aca.png");
		appMenuDept4.setMenu_conn_cd("");
		appMenuDept4.setMenuDept    ("1");

		appMenuList.add(appMenuDept4);


		// 1 DEPT : VIP
		AppMenuDept appMenuDept5 = new AppMenuDept();

		appMenuDept5.setSeq         (6);
		appMenuDept5.setCd          ("M0006");
		appMenuDept5.setCdNm        ("VIP");
		appMenuDept5.setDspType     ("B");
		appMenuDept5.setMenuNm      ("VIP");
		appMenuDept5.setMenuSubNm   ("");
		appMenuDept5.setUrl         ("");
		appMenuDept5.setMenu_conn_cd("");
		appMenuDept5.setMenuDept    ("1");

		appMenuList.add(appMenuDept5);


		// 1 DEPT : 점포안내
		AppMenuDept appMenuDept6 = new AppMenuDept();

		appMenuDept6.setSeq         (7);
		appMenuDept6.setCd          ("M0007");
		appMenuDept6.setCdNm        ("점포안내");
		appMenuDept6.setDspType     ("B");
		appMenuDept6.setMenuNm      ("점포안내");
		appMenuDept6.setMenuSubNm   ("");
		appMenuDept6.setUrl         ("");
		appMenuDept6.setMenu_conn_cd("");
		appMenuDept6.setMenuDept    ("1");

		appMenuList.add(appMenuDept6);


		// 1 DEPT : 쇼핑안내
		// 기존 데이터 없음
		AppMenuDept appMenuDept7 = new AppMenuDept();

		appMenuDept7.setSeq         (8);
		appMenuDept7.setCd          ("M0008");
		appMenuDept7.setCdNm        ("쇼핑안내");
		appMenuDept7.setDspType     ("B");
		appMenuDept7.setMenuNm      ("쇼핑안내");
		appMenuDept7.setMenuSubNm   ("");
		appMenuDept7.setUrl         ("");
		appMenuDept7.setMenu_conn_cd("");
		appMenuDept7.setMenuDept    ("1");

		appMenuList.add(appMenuDept7);


		// 1 DEPT : 마이페이지
		// 기존 데이터 없음
		AppMenuDept appMenuDept8 = new AppMenuDept();

		appMenuDept8.setSeq         (9);
		appMenuDept8.setCd          ("M0009");
		appMenuDept8.setCdNm        ("마이페이지");
		appMenuDept8.setDspType     ("B");
		appMenuDept8.setMenuNm      ("마이페이지");
		appMenuDept8.setMenuSubNm   ("");
		appMenuDept8.setUrl         ("");
		appMenuDept8.setMenu_conn_cd("");
		appMenuDept8.setMenuDept    ("1");

		appMenuList.add(appMenuDept8);


		// 1 DEPT : 신세계 컨텐츠
		// 기존 데이터 없음
		AppMenuDept appMenuDept9 = new AppMenuDept();

		appMenuDept9.setSeq         (10);
		appMenuDept9.setCd          ("M0010");
		appMenuDept9.setCdNm        ("신세계 컨텐츠");
		appMenuDept9.setDspType     ("B");
		appMenuDept9.setMenuNm      ("신세계 컨텐츠");
		appMenuDept9.setMenuSubNm   ("");
		appMenuDept9.setUrl         ("");
		appMenuDept9.setMenu_conn_cd("");
		appMenuDept9.setMenuDept    ("1");

		appMenuList.add(appMenuDept9);


		// 1 DEPT : 신세계 온라인
		// 기존 데이터 없음
		AppMenuDept appMenuDept10 = new AppMenuDept();

		appMenuDept10.setSeq         (11);
		appMenuDept10.setCd          ("M0011");
		appMenuDept10.setCdNm        ("신세계 온라인");
		appMenuDept10.setDspType     ("B");
		appMenuDept10.setMenuNm      ("신세계 온라인");
		appMenuDept10.setMenuSubNm   ("");
		appMenuDept10.setUrl         ("");
		appMenuDept10.setMenu_conn_cd("");
		appMenuDept10.setMenuDept    ("1");

		appMenuList.add(appMenuDept10);


		// 1 DEPT : NFT
		// 기존 데이터 없음
		AppMenuDept appMenuDept11 = new AppMenuDept();

		appMenuDept11.setSeq         (12);
		appMenuDept11.setCd          ("M0012");
		appMenuDept11.setCdNm        ("NFT");
		appMenuDept11.setDspType     ("B");
		appMenuDept11.setMenuNm      ("NFT");
		appMenuDept11.setMenuSubNm   ("");
		appMenuDept11.setUrl         ("");
		appMenuDept11.setMenu_conn_cd("");
		appMenuDept11.setMenuDept    ("1");

		appMenuList.add(appMenuDept11);


		// 1 DEPT : 신세계 고객 서비스
		AppMenuDept appMenuDept12 = new AppMenuDept();

		appMenuDept12.setSeq         (13);
		appMenuDept12.setCd          ("M0013");
		appMenuDept12.setCdNm        ("신세계 고객 서비스");
		appMenuDept12.setDspType     ("B");
		appMenuDept12.setMenuNm      ("신세계 고객 서비스");
		appMenuDept12.setMenuSubNm   ("");
		appMenuDept12.setUrl         ("");
		appMenuDept12.setMenu_conn_cd("");
		appMenuDept12.setMenuDept    ("1");

		appMenuList.add(appMenuDept12);


		// 1 DEPT : 패밀리
		// 기존 데이터 없음
		AppMenuDept appMenuDept13 = new AppMenuDept();

		appMenuDept13.setSeq         (14);
		appMenuDept13.setCd          ("M0014");
		appMenuDept13.setCdNm        ("패밀리");
		appMenuDept13.setDspType     ("B");
		appMenuDept13.setMenuNm      ("패밀리");
		appMenuDept13.setMenuSubNm   ("");
		appMenuDept13.setUrl         ("");
		appMenuDept13.setMenu_conn_cd("");
		appMenuDept13.setMenuDept    ("1");

		appMenuList.add(appMenuDept13);

		// ========================= 2, 3 DEPT 시작 ======================================
		// 2, 3 DEPT 총 40개  2DEPT = 30, 3DEPT 10

		// 2 DEPT : 신세계 아카데미 > 신세계 아카데미
		AppMenuDept appMenuDept14 = new AppMenuDept();

		appMenuDept14.setMenuNm      ("신세계 아카데미");
		appMenuDept14.setMenuSubNm   ("");
		appMenuDept14.setUrl         ("");
		appMenuDept14.setMenu_conn_cd("M0005");
		appMenuDept14.setMenuDept    ("2");

		appMenuList.add(appMenuDept14);


//		// 2 DEPT : 신세계 아카데미 > 신세계 온 아카데미
//		AppMenuDept appMenuDept14 = new AppMenuDept();
//
//		appMenuDept14.setMenuNm      ("신세계 온 아카데미");
//		appMenuDept14.setMenuSubNm   ("");
//		appMenuDept14.setUrl         ("http://shinsegae-academy.com/ON/outlink:req_get:");
//		appMenuDept14.setMenu_conn_cd("M0005");
//		appMenuDept14.setMenuDept    ("2");
//
//		appMenuList.add(appMenuDept14);


		// 2 DEPT : VIP > 혜택 사용 내역
		AppMenuDept appMenuDept15 = new AppMenuDept();

		appMenuDept15.setMenuNm      ("혜택 사용 내역");
		appMenuDept15.setMenuSubNm   ("");
		appMenuDept15.setUrl         ("/history/main.do");
		appMenuDept15.setMenu_conn_cd("M0006");
		appMenuDept15.setMenuDept    ("2");

		appMenuList.add(appMenuDept15);


		// 2 DEPT : VIP > 예약 서비스
		AppMenuDept appMenuDept16 = new AppMenuDept();

		appMenuDept16.setMenuNm      ("예약 서비스");
		appMenuDept16.setMenuSubNm   ("");
		appMenuDept16.setUrl         ("/fastTrack/main.do");
		appMenuDept16.setMenu_conn_cd("M0006");
		appMenuDept16.setMenuDept    ("2");

		appMenuList.add(appMenuDept16);


		// 2 DEPT : VIP > 프라이빗 이벤트
		AppMenuDept appMenuDept17 = new AppMenuDept();

		appMenuDept17.setMenuNm      ("프라이빗 이벤트");
		appMenuDept17.setMenuSubNm   ("");
		appMenuDept17.setUrl         ("/event/main.do");
		appMenuDept17.setMenu_conn_cd("M0006");
		appMenuDept17.setMenuDept    ("2");

		appMenuList.add(appMenuDept17);


		// 2 DEPT : VIP > 스페셜 마일리지
		AppMenuDept appMenuDept18 = new AppMenuDept();

		appMenuDept18.setMenuNm      ("스페셜 마일리지");
		appMenuDept18.setMenuSubNm   ("");
		appMenuDept18.setUrl         ("/promotion/specialMileage.do");
		appMenuDept18.setMenu_conn_cd("M0006");
		appMenuDept18.setMenuDept    ("2");

		appMenuList.add(appMenuDept18);


		// 2 DEPT : VIP > 11월의 소식 및 기념일 이벤트
		// 기존 데이터 없음
		AppMenuDept appMenuDept19 = new AppMenuDept();

		appMenuDept19.setMenuNm      ("11월의 소식 및 기념일 이벤트");
		appMenuDept19.setMenuSubNm   ("");
		appMenuDept19.setUrl         ("");
		appMenuDept19.setMenu_conn_cd("M0006");
		appMenuDept19.setMenuDept    ("2");

		appMenuList.add(appMenuDept19);


		// 2 DEPT : VIP > 혜택 안내
		AppMenuDept appMenuDept20 = new AppMenuDept();

		appMenuDept20.setMenuNm      ("혜택 안내");
		appMenuDept20.setMenuSubNm   ("");
		appMenuDept20.setUrl         ("https://deptmapp.shinsegae.com/service/vipclub/benefits-trinity.do");
		appMenuDept20.setMenu_conn_cd("M0006");
		appMenuDept20.setMenuDept    ("2");

		appMenuList.add(appMenuDept20);


		// 2 DEPT : 점포안내 > 점포 정보
		// 기존 데이터 없음
		AppMenuDept appMenuDept21 = new AppMenuDept();

		appMenuDept21.setMenuNm      ("점포 정보");
		appMenuDept21.setMenuSubNm   ("");
		appMenuDept21.setUrl         ("");
		appMenuDept21.setMenu_conn_cd("M0007");
		appMenuDept21.setMenuDept    ("2");

		appMenuList.add(appMenuDept21);


		// 2 DEPT : 점포안내 > 식당가 대기 현황
		AppMenuDept appMenuDept22 = new AppMenuDept();

		appMenuDept22.setMenuNm      ("식당가 대기 현황");
		appMenuDept22.setMenuSubNm   ("");
		appMenuDept22.setUrl         ("https://push.swallet.shinsegae.com/epush/retrieveFoodCourtServlet?store_cd=SC00001/inapplink:req_get:");
		appMenuDept22.setMenu_conn_cd("M0007");
		appMenuDept22.setMenuDept    ("2");

		appMenuList.add(appMenuDept22);


		// 2 DEPT : 쇼핑안내 > 쇼핑정보
		AppMenuDept appMenuDept23 = new AppMenuDept();

		appMenuDept23.setMenuNm      ("쇼핑정보");
		appMenuDept23.setMenuSubNm   ("");
		appMenuDept23.setUrl         ("");
		appMenuDept23.setMenu_conn_cd("M0008");
		appMenuDept23.setMenuDept    ("2");

		appMenuList.add(appMenuDept23);


		// 2 DEPT : 쇼핑안내 > FIT
		AppMenuDept appMenuDept24 = new AppMenuDept();

		appMenuDept24.setMenuNm      ("FIT");
		appMenuDept24.setMenuSubNm   ("");
		appMenuDept24.setUrl         ("/wallet/bmp/index");
		appMenuDept24.setMenu_conn_cd("M0008");
		appMenuDept24.setMenuDept    ("2");

		appMenuList.add(appMenuDept24);


		// 2 DEPT : 마이페이지 > MY 신세계
		AppMenuDept appMenuDept25 = new AppMenuDept();

		appMenuDept25.setMenuNm      ("MY 신세계");
		appMenuDept25.setMenuSubNm   ("");
		appMenuDept25.setUrl         ("");
		appMenuDept25.setMenu_conn_cd("M0009");
		appMenuDept25.setMenuDept    ("2");

		appMenuList.add(appMenuDept25);


		// 2 DEPT : 마이페이지 > MY ROOM
		AppMenuDept appMenuDept26 = new AppMenuDept();

		appMenuDept26.setMenuNm      ("MY ROOM");
		appMenuDept26.setMenuSubNm   ("");
		appMenuDept26.setUrl         ("/wallet/receiptGrade/myBrand?enter_gubun=mainMenu/inapplink:login_compulsion_open:req_get:app_bottom_bar:");
		appMenuDept26.setMenu_conn_cd("M0009");
		appMenuDept26.setMenuDept    ("2");

		appMenuList.add(appMenuDept26);


		// 2 DEPT : 마이페이지 > MY 클립
		AppMenuDept appMenuDept27 = new AppMenuDept();

		appMenuDept27.setMenuNm      ("MY 클립");
		appMenuDept27.setMenuSubNm   ("");
		appMenuDept27.setUrl         ("");
		appMenuDept27.setMenu_conn_cd("M0009");
		appMenuDept27.setMenuDept    ("2");

		appMenuList.add(appMenuDept27);


		// 2 DEPT : 신세계 컨텐츠 > 큐레이션
		// 기존 데이터 없음
		AppMenuDept appMenuDept28 = new AppMenuDept();

		appMenuDept28.setMenuNm      ("큐레이션");
		appMenuDept28.setMenuSubNm   ("");
		appMenuDept28.setUrl         ("");
		appMenuDept28.setMenu_conn_cd("M0010");
		appMenuDept28.setMenuDept    ("2");

		appMenuList.add(appMenuDept28);


		// 3 DEPT : 신세계 컨텐츠 > 큐레이션 > 나우뮤비
		AppMenuDept appMenuDept29 = new AppMenuDept();

		appMenuDept29.setMenuNm      ("나우뮤비");
		appMenuDept29.setMenuSubNm   ("영화ㆍOTT");
		appMenuDept29.setUrl         ("");
		appMenuDept29.setMenu_conn_cd("M0010");
		appMenuDept29.setMenuDept    ("3");

		appMenuList.add(appMenuDept29);


		// 3 DEPT : 신세계 컨텐츠 > 큐레이션 > 여미
		AppMenuDept appMenuDept30 = new AppMenuDept();

		appMenuDept30.setMenuNm      ("여미");
		appMenuDept30.setMenuSubNm   ("여행");
		appMenuDept30.setUrl         ("/wallet/event/mCatalogEvent/getMCatalogEventDtlInfo?event_id=6850&event_type=03&store_cd=SC00008/inapplink:login_compulsion_open:req_get:");
		appMenuDept30.setMenu_conn_cd("M0010");
		appMenuDept30.setMenuDept    ("3");

		appMenuList.add(appMenuDept30);


		// 3 DEPT : 신세계 컨텐츠 > 큐레이션 > 세바시랜드
		AppMenuDept appMenuDept31 = new AppMenuDept();

		appMenuDept31.setMenuNm      ("세바시랜드");
		appMenuDept31.setMenuSubNm   ("명사 클래스");
		appMenuDept31.setUrl         ("/wallet/cooperation/main?companyCd=SB&gubunType=KATE/inapplink:login_compulsion_open:req_get:");
		appMenuDept31.setMenu_conn_cd("M0010");
		appMenuDept31.setMenuDept    ("3");

		appMenuList.add(appMenuDept31);


		// 3 DEPT : 신세계 컨텐츠 > 큐레이션 > 신백서재
		AppMenuDept appMenuDept32 = new AppMenuDept();

		appMenuDept32.setMenuNm      ("신백서재");
		appMenuDept32.setMenuSubNm   ("e-book");
		appMenuDept32.setUrl         ("http://ssg2.bookcube.biz/FxLibrary/dependency/sso/sso.jsp?param_1={userId}&param_2={userId}&param_3={custNm}&pathtype=mobile/inapplink:login_compulsion_open:req_get:app_bo");
		appMenuDept32.setMenu_conn_cd("M0010");
		appMenuDept32.setMenuDept    ("3");

		appMenuList.add(appMenuDept32);


		// 3 DEPT : 신세계 컨텐츠 > 큐레이션 > 지니뮤직 라운지
		AppMenuDept appMenuDept33 = new AppMenuDept();

		appMenuDept33.setMenuNm      ("지니뮤직 라운지");
		appMenuDept33.setMenuSubNm   ("음악");
		appMenuDept33.setUrl         ("https://campaign.genie.co.kr/genielounge11/inapplink:login_compulsion_open:req_get:app_bottom_bar:");
		appMenuDept33.setMenu_conn_cd("M0010");
		appMenuDept33.setMenuDept    ("3");

		appMenuList.add(appMenuDept33);


		// 2 DEPT : 신세계 컨텐츠 > 라이프 스타일
		// 기존 데이터 없음
		AppMenuDept appMenuDept34 = new AppMenuDept();

		appMenuDept34.setMenuNm      ("라이프 스타일");
		appMenuDept34.setMenuSubNm   ("");
		appMenuDept34.setUrl         ("");
		appMenuDept34.setMenu_conn_cd("M0010");
		appMenuDept34.setMenuDept    ("2");

		appMenuList.add(appMenuDept34);


		// 3 DEPT : 신세계 컨텐츠 > 라이프 스타일 > 신세계 매거진
		AppMenuDept appMenuDept35 = new AppMenuDept();

		appMenuDept35.setMenuNm      ("신세계 매거진");
		appMenuDept35.setMenuSubNm   ("");
		appMenuDept35.setUrl         ("https://deptmapp.shinsegae.com/magazine/app/list.do/inapplink:req_get:");
		appMenuDept35.setMenu_conn_cd("");
		appMenuDept35.setMenuDept    ("3");

		appMenuList.add(appMenuDept35);


		// 3 DEPT : 신세계 컨텐츠 > 라이프 스타일 > 아트&컬처
		AppMenuDept appMenuDept36 = new AppMenuDept();

		appMenuDept36.setMenuNm      ("아트&컬처");
		appMenuDept36.setMenuSubNm   ("");
		appMenuDept36.setUrl         ("");
		appMenuDept36.setMenu_conn_cd("M0010");
		appMenuDept36.setMenuDept    ("3");

		appMenuList.add(appMenuDept36);


		// 3 DEPT : 신세계 컨텐츠 > 라이프 스타일 > 계절과 식탁
		AppMenuDept appMenuDept37 = new AppMenuDept();

		appMenuDept37.setMenuNm      ("계절과 식탁");
		appMenuDept37.setMenuSubNm   ("");
		appMenuDept37.setUrl         ("/wallet/recipe/getRecipeList?storeCd=SC00001/inapplink:req_post:");
		appMenuDept37.setMenu_conn_cd("M0010");
		appMenuDept37.setMenuDept    ("3");

		appMenuList.add(appMenuDept37);


		// 3 DEPT : 신세계 컨텐츠 > 라이프 스타일 > 오늘 뭐 먹지
		AppMenuDept appMenuDept38 = new AppMenuDept();

		appMenuDept38.setMenuNm      ("오늘 뭐 먹지");
		appMenuDept38.setMenuSubNm   ("");
		appMenuDept38.setUrl         ("/wallet/foodCoupon/index/inapplink:req_get:");
		appMenuDept38.setMenu_conn_cd("M0010");
		appMenuDept38.setMenuDept    ("3");

		appMenuList.add(appMenuDept38);


		// 3 DEPT : 신세계 컨텐츠 > 라이프 스타일 > 공간의 기준
		// 기존 데이터 없음
		AppMenuDept appMenuDept39 = new AppMenuDept();

		appMenuDept39.setMenuNm      ("공간의 기준");
		appMenuDept39.setMenuSubNm   ("");
		appMenuDept39.setUrl         ("");
		appMenuDept39.setMenu_conn_cd("M0010");
		appMenuDept39.setMenuDept    ("3");

		appMenuList.add(appMenuDept39);


		// 2 DEPT : 신세계 온라인 > 신백 LIVE
		AppMenuDept appMenuDept40 = new AppMenuDept();

		appMenuDept40.setMenuNm      ("신백 LIVE");
		appMenuDept40.setMenuSubNm   ("");
		appMenuDept40.setUrl         ("/wallet/deptLiveStream/getLiveMain/inapplink:req_get:");
		appMenuDept40.setMenu_conn_cd("M0011");
		appMenuDept40.setMenuDept    ("2");

		appMenuList.add(appMenuDept40);


		// 2 DEPT : 신세계 온라인 > 백화점 선물하기
		AppMenuDept appMenuDept41 = new AppMenuDept();

		appMenuDept41.setMenuNm      ("백화점 선물하기");
		appMenuDept41.setMenuSubNm   ("");
		appMenuDept41.setUrl         ("https://m.ssg.com/page/giftdept/outlink:req_get:ssgsso:ssgcom_ssggift");
		appMenuDept41.setMenu_conn_cd("M0011");
		appMenuDept41.setMenuDept    ("2");

		appMenuList.add(appMenuDept41);


		// 2 DEPT : 신세계 온라인 > SSG.COM
		AppMenuDept appMenuDept42 = new AppMenuDept();

		appMenuDept42.setMenuNm      ("SSG.COM");
		appMenuDept42.setMenuSubNm   ("");
		appMenuDept42.setUrl         ("http://m.ssg.com/outlink:req_get:ssgsso:ssgcom_main");
		appMenuDept42.setMenu_conn_cd("M0011");
		appMenuDept42.setMenuDept    ("2");

		appMenuList.add(appMenuDept42);


		// 2 DEPT : NFT > 푸빌라 소사이어티
		// 기존 데이터 없음
		AppMenuDept appMenuDept43 = new AppMenuDept();

		appMenuDept43.setMenuNm      ("푸빌라 소사이어티");
		appMenuDept43.setMenuSubNm   ("");
		appMenuDept43.setUrl         ("");
		appMenuDept43.setMenu_conn_cd("M0012");
		appMenuDept43.setMenuDept    ("2");

		appMenuList.add(appMenuDept43);


		// 2 DEPT : NFT > NFT 유틸리티 신청
		// 기존 데이터 없음
		AppMenuDept appMenuDept44 = new AppMenuDept();

		appMenuDept44.setMenuNm      ("NFT 유틸리티 신청");
		appMenuDept44.setMenuSubNm   ("");
		appMenuDept44.setUrl         ("");
		appMenuDept44.setMenu_conn_cd("M0012");
		appMenuDept44.setMenuDept    ("2");

		appMenuList.add(appMenuDept44);


		// 2 DEPT : NFT > 디지털 지갑 개설가이드
		AppMenuDept appMenuDept45 = new AppMenuDept();

		appMenuDept45.setMenuNm      ("디지털 지갑 개설가이드");
		appMenuDept45.setMenuSubNm   ("");
		appMenuDept45.setUrl         ("/wallet/nft/nftWalletGuide?enter_event_id=3931&store_cd=SC00001&event_id=3931/inapplink:req_get:");
		appMenuDept45.setMenu_conn_cd("M0012");
		appMenuDept45.setMenuDept    ("2");

		appMenuList.add(appMenuDept45);


		// 2 DEPT : 패밀리 > 팩토리 스토어
		AppMenuDept appMenuDept46 = new AppMenuDept();

		appMenuDept46.setMenuNm      ("팩토리 스토어");
		appMenuDept46.setMenuSubNm   ("");
		appMenuDept46.setUrl         ("http://app.ds.shinsegae.com/wallet/factoryStoreSelPageView/inapplink:req_get:app_bottom_bar:");
		appMenuDept46.setMenu_conn_cd("M0014");
		appMenuDept46.setMenuDept    ("2");

		appMenuList.add(appMenuDept46);


		// 2 DEPT : 패밀리 > 스타일 마켓
		AppMenuDept appMenuDept47 = new AppMenuDept();

		appMenuDept47.setMenuNm      ("스타일 마켓");
		appMenuDept47.setMenuSubNm   ("");
		appMenuDept47.setUrl         ("https://deptmapp.shinsegae.com/styleMarket/app/main.do?storeCd=MC00001/inapplink:req_get:app_bottom_bar:");
		appMenuDept47.setMenu_conn_cd("M0014");
		appMenuDept47.setMenuDept    ("2");

		appMenuList.add(appMenuDept47);


		// 2 DEPT : 패밀리 > 시코르
		AppMenuDept appMenuDept48 = new AppMenuDept();

		appMenuDept48.setMenuNm      ("시코르");
		appMenuDept48.setMenuSubNm   ("");
		appMenuDept48.setUrl         ("/wallet/SSGLandersReplyEvent?ssg_id=2/inapplink:");
		appMenuDept48.setMenu_conn_cd("M0014");
		appMenuDept48.setMenuDept    ("2");

		appMenuList.add(appMenuDept48);


		// 2 DEPT : 패밀리 > SSG.COM
		// 아웃링크
		// 위에 동일한 3 DEPT 메뉴가 있음 (seq : 42번)
		AppMenuDept appMenuDept49 = new AppMenuDept();

		appMenuDept49.setMenuNm      ("SSG.COM");
		appMenuDept49.setMenuSubNm   ("");
		appMenuDept49.setUrl         ("http://department.ssg.com/main.ssg/ssgsso:ssgcom");
		appMenuDept49.setMenu_conn_cd("M0014");
		appMenuDept49.setMenuDept    ("2");

		appMenuList.add(appMenuDept49);


		// 2 DEPT : 패밀리 > SSG PAY
		AppMenuDept appMenuDept50 = new AppMenuDept();

		appMenuDept50.setMenuNm      ("SSG PAY");
		appMenuDept50.setMenuSubNm   ("");
		appMenuDept50.setUrl         ("");
		appMenuDept50.setMenu_conn_cd("M0014");
		appMenuDept50.setMenuDept    ("2");

		appMenuList.add(appMenuDept50);



		// 2 DEPT : 패밀리 > 신세계 포인트
		AppMenuDept appMenuDept51 = new AppMenuDept();

		appMenuDept51.setMenuNm      ("신세계 포인트");
		appMenuDept51.setMenuSubNm   ("");
		appMenuDept51.setUrl         ("https://shinsegaepointapp.page.link/R6GT/outlink:req_get:");
		appMenuDept51.setMenu_conn_cd("M0014");
		appMenuDept51.setMenuDept    ("2");

		appMenuList.add(appMenuDept51);



		// 2 DEPT : 패밀리 > 신세계 제휴카드
		AppMenuDept appMenuDept52 = new AppMenuDept();

		appMenuDept52.setMenuNm      ("신세계 제휴카드");
		appMenuDept52.setMenuSubNm   ("");
		appMenuDept52.setUrl         ("https://deptmapp.shinsegae.com/service/membership/card.do/outlink:req_get:");
		appMenuDept52.setMenu_conn_cd("M0014");
		appMenuDept52.setMenuDept    ("2");

		appMenuList.add(appMenuDept52);


		// return
		mav.addObject("searchResult", appMenuList);

		System.out.println(mav);
		return mav;
// ================================================================================= END
	}


}
