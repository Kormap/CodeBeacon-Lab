<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
<h1> MODEL APPMENU LIST TEST</h1><br>
<%--<h2>APP MENU LIST = ${searchResult[0].menuNm}</h2>--%>
<h2>APP MENU LIST</h2>
<ul>
    <c:forEach var="appmenu" items="${searchResult}" begin="0" end="4">
        <c:if test="${appmenu.menuDept eq 1}">
            <li class="dept1">${appmenu.menuNm}</li>
        </c:if>
    </c:forEach>

    <h1>Dept partition</h1>

    <c:forEach var="appmenu" items="${searchResult}" begin="5" end="${fn:length(searchResult)}">
        <c:if test="${appmenu.menuNm eq 'VIP'}">
            <li class="dept1">${appmenu.menuNm}</li>
        </c:if>
            <c:choose>
                    <c:when test="${appmenu.menuDept eq 2}">
                        <c:choose>
                        <c:when test="${appmenu.menuDept2 eq 'VIP'}">
                            <li class="dept2">${appmenu.menuNm}</li>
                        </c:when>
                        </c:choose>
                    </c:when>
            </c:choose>
    </c:forEach>

    <c:forEach var="appmenu" items="${searchResult}" begin="5" end="${fn:length(searchResult)}">
        <c:if test="${appmenu.menuNm eq '점포안내'}">
                <li class="dept1">${appmenu.menuNm}</li>
            </c:if>
            <c:choose>
                <c:when test="${appmenu.menuDept eq 2}">
                    <c:choose>
                        <c:when test="${appmenu.menuDept2 eq '점포안내'}">
                            <li class="dept2">${appmenu.menuNm}</li>
                        </c:when>
                    </c:choose>
                </c:when>
            </c:choose>
    </c:forEach>

    <c:forEach var="appmenu" items="${searchResult}" begin="5" end="${fn:length(searchResult)}">
        <c:if test="${appmenu.menuNm eq '쇼핑안내'}">
            <li class="dept1">${appmenu.menuNm}</li>
        </c:if>
        <c:choose>
            <c:when test="${appmenu.menuDept eq 2}">
                <c:choose>
                    <c:when test="${appmenu.menuDept2 eq '쇼핑안내'}">
                        <li class="dept2">${appmenu.menuNm}</li>
                    </c:when>
                </c:choose>
            </c:when>
        </c:choose>
    </c:forEach>

    <c:forEach var="appmenu" items="${searchResult}" begin="5" end="${fn:length(searchResult)}">
        <c:if test="${appmenu.menuNm eq '마이페이지'}">
            <li class="dept1">${appmenu.menuNm}</li>
        </c:if>
        <c:choose>
            <c:when test="${appmenu.menuDept eq 2}">
                <c:choose>
                    <c:when test="${appmenu.menuDept2 eq '마이페이지'}">
                        <li class="dept2">${appmenu.menuNm}</li>
                    </c:when>
                </c:choose>
            </c:when>
        </c:choose>
    </c:forEach>

    <c:forEach var="appmenu" items="${searchResult}" begin="5" end="${fn:length(searchResult)}">
        <c:if test="${appmenu.menuNm eq '신세계 컨텐츠'}">
            <li class="dept1">${appmenu.menuNm}</li>
        </c:if>
        <c:choose>
            <c:when test="${appmenu.menuDept eq 2}">
                <c:choose>
                    <c:when test="${appmenu.menuDept2 eq '신세계 컨텐츠'}">
                        <li class="dept2">${appmenu.menuNm}</li>
                    </c:when>
                </c:choose>
            </c:when>
        </c:choose>
        <c:choose>
            <c:when test="${appmenu.menuDept eq 3}">
                <c:if test="${appmenu.menuDept3 eq '큐레이션'}">
                    <li class="dept3">${appmenu.menuNm}</li>
                </c:if>
            </c:when>
        </c:choose>
        <c:choose>
            <c:when test="${appmenu.menuDept eq 3}">
                <c:if test="${appmenu.menuDept3 eq '라이프 스타일'}">
                    <li class="dept3">${appmenu.menuNm}</li>
                </c:if>
            </c:when>
        </c:choose>
    </c:forEach>




<%--    <c:forEach var="appmenu" items="${searchResult}" begin="0" end="${fn:length(searchResult)}">
        <c:if test="${appmenu.seq eq 2}">
            <li class="dept1">${appmenu.menuNm}</li>
        </c:if>
    </c:forEach>

    <c:forEach var="appmenu" items="${searchResult}" begin="0" end="${fn:length(searchResult)}">

        <c:if test="${appmenu.menuDept eq '2'}">
            <c:choose>
                <c:when test="${appmenu.menuDept2 eq '신세계 아카데미'}">
                    <li class="dept2">${appmenu.menuNm}</li>
                </c:when>
            </c:choose>
        </c:if>
    </c:forEach>--%>

<%--
        <li>${appmenu.menuNm}</li>
--%>
</ul>


</body>
<style>
.dept2{
    margin-left: 50px;
}
.dept3{
    margin-left: 100px;
}


</style>
</html>