<%-- EL 적용 --%>
<%@page import="subject.SubjectVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>과목상세정보</title>
</head>
<body>
<jsp:include page="/header.jsp"/>
<h1>과목 상세정보(EL)</h1>
<table border='1'>
<tr>
  <th>번호</th>
  <td>${subject.no}</td>
</tr>
<tr>
  <th>과목명</th>
  <td>${subject.title}</td>
</tr>
<tr>
  <th>내용</th>
 <td><textarea rows='5' cols='60'>${subject.description}</textarea></td>
</tr>
</table>
<a href='list.bit?pageNo=1&pageSize=10'>목록</a> 
<a href='delete.bit?no=${subject.no}'>삭제</a> 
<a href='update.bit?no=${subject.no}'>변경</a><br>
<jsp:include page="/footer.jsp"/>
</body></html>










