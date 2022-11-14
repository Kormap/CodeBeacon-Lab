package com.codebeacon;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AppMenuDept {

    private String menuId;              // 메뉴코드
    private String menuCd;              // 메뉴유형
    private String menuNm;              // 메뉴명
    private String MenuSubNm;
    private String url;                  // url
    private String noteCont;          // 비고
    private String useYn;              // 사용유무
    private String sortNo;              // 정렬순서
    private String contentId;         // 컨텐츠ID
    private String imgUrl;            // 이미지 url
    private String disp_yn;           // 왼쫀메뉴 노출여부
    private String service;           // 전체서비스정보
    private String new_yn;            // 신메뉴yn
    private String menu_conn_cd;      // 메뉴 연결코드
    private String banner_img_url;    // 배너 이미지 주소
    private String favorite_yn;       // 즐겨찾기 사용여부
    private String menu_frame_color;  // 아이콘 배경색
    private String menu_nm_color;     // 아이콘 텍스트색

    // 추가한 부분
    private int    seq;               // 메뉴 순서
    private String cd;                // 메뉴 코드 (1DEPT 만 보유)
    private String cdNm;              // 메뉴 코드명
    private String dspType;           // 메뉴 상 하단 배치
    private String returnUrl;         // ?
    private String menuDept;          // DEPT 구분
    private String menuDept2;          // DEPT 구분
    private String menuDept3;          // DEPT 구분

}
