<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <c:forEach var="appmenu" items="${searchResult}">
        <li>${appmenu.menuNm}</li>
    </c:forEach>
</ul>


</body>
</html>