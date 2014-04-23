<%@page import="users.UsersVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="list" type="java.util.List<users.UsersVo>" 
      scope="request"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사용자관리폼</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>사용자 목록(JSTL, EL)</h1>
<a href='form.html'>새사용자</a><br>
<table border='1'>
<tr>
  <th>번호</th>
  <th>이메일</th>
</tr>
<c:forEach var="users" items="${list}">
<tr>
  <td>${users.no}</td>
  <td><a href='detail.bit?no=${users.no}'>${users.email}</a></td>
</tr>
</c:forEach>
</table>
<jsp:include page="/footer.jsp"/>
</body></html>

