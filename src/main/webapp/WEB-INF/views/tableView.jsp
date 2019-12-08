<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>테이블 정보</h1>
	<p>
		<c:forEach var="list" items="${table }">
			번호 : <c:out value="${list.disposableInt}"/><br/>
			문자열 : <c:out value="${list.disposableString}"/><br/>
		</c:forEach> 
	</p>
</body>
</html>