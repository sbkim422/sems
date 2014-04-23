<%@page import="cours.CoursVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>과정상세정보</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>과정 상세정보(jsp)</h1>
<table border='1'>
<tr>
  <th>번호</th>
  <td>${cours.no}</td>
</tr>
<tr>
  <th>과정명</th>
  <td>${cours.title}</td>
</tr>
<tr>
  <th>내용</th>
  <td><textarea rows='5' cols='60'>${cours.description}</textarea></td>
</tr>
<tr>
  <th>과정시간</th>
  <td>${cours.hours}</td>
</tr>
</table>
<a href='list.bit?pageNo=1&pageSize=10'>목록</a> 
<a href='delete.bit?no=${cours.no}'>삭제</a> 
<a href='update.bit?no=${cours.no}'>변경</a><br>
<jsp:include page="/footer.jsp"/>
</body>
</html>