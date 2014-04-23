<%@page import="cours.CoursVo"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:useBean id="list" type="java.util.List<cours.CoursVo>" 
      scope="request"/>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>과정관리폼</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>과정 목록(JSTL, EL)</h1>
<a href='form.html'>새과정</a><br>
<table border='1'>
<tr>
  <th>번호</th>
  <th>과정명</th>
</tr>
<c:forEach var="cours" items="${list}">
<tr>
  <td>${cours.no}</td>
  <td><a href='detail.bit?no=${cours.no}'>${cours.title}</a></td>
</tr>
</c:forEach>
</table>
<jsp:include page="/footer.jsp"/>
</body></html>




